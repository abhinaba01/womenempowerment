package com.example.womenempowerment.service;

import java.util.List;
import java.util.Optional;

import com.example.womenempowerment.entity.Feedback;
import com.example.womenempowerment.exception.FeedBackAlreadySubmittedException;
import com.example.womenempowerment.exception.FeedBackDoesNotExistsException;

public interface FeedbackService {
	Feedback addFeedBack(Feedback feedback) throws FeedBackAlreadySubmittedException;

	Feedback updateFeedBack(Feedback feedback);

	Optional<Feedback> viewFeedBack(int feedbackId) throws FeedBackDoesNotExistsException;

	List<Feedback> viewAllFeedBack();

	List<Feedback> viewFeedBackBySchemeName(String schemeName) throws FeedBackDoesNotExistsException;

	List<Feedback> viewFeedBackByTrainingCourseName(String courseName) throws FeedBackDoesNotExistsException;
}
