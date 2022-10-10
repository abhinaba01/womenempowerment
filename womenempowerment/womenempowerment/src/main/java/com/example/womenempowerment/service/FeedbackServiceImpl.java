package com.example.womenempowerment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.womenempowerment.entity.Feedback;
import com.example.womenempowerment.entity.TrainingCourse;
import com.example.womenempowerment.exception.FeedBackAlreadySubmittedException;
import com.example.womenempowerment.exception.FeedBackDoesNotExistsException;
import com.example.womenempowerment.exception.TrainingCourseAlreadyExistsException;
import com.example.womenempowerment.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	@Autowired
	private FeedbackRepository feedBackRepo;

	@Override
	public Feedback addFeedBack(Feedback feedback) throws FeedBackAlreadySubmittedException {
		if(feedBackRepo.existsById(feedback.getFeedbackId())) {
			throw new FeedBackAlreadySubmittedException();
		}
		else {
			Feedback savefeedback = feedBackRepo.save(feedback);
			return savefeedback;
		}
	}

	@Override
	public Feedback updateFeedBack(Feedback feedback) {
		Feedback updatefeedback = feedBackRepo.save(feedback);
		return updatefeedback;
	}

	@Override
	public Optional<Feedback> viewFeedBack(int feedbackId) throws FeedBackDoesNotExistsException {
		Optional<Feedback> findbyId = feedBackRepo.findById(feedbackId);
		return findbyId;
	}

	@Override
	public List<Feedback> viewAllFeedBack() {
		List<Feedback> viewall = feedBackRepo.findAll();
		return viewall;
	}

	@Override
	public List<Feedback> viewFeedBackBySchemeName(String schemeName) throws FeedBackDoesNotExistsException{
		List<Feedback> viewfeedback = feedBackRepo.viewFeedBackBySchemeName(schemeName);
		return viewfeedback;
	}

	@Override
	public List<Feedback> viewFeedBackByTrainingCourseName(String courseName) throws FeedBackDoesNotExistsException{
		List<Feedback> viewfeedback = feedBackRepo.viewFeedBackByTrainingCourseNameName(courseName);
		return viewfeedback;
	}
}
