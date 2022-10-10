package com.example.womenempowerment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.womenempowerment.entity.Feedback;
import com.example.womenempowerment.entity.NGO;
import com.example.womenempowerment.entity.TrainingCourse;
import com.example.womenempowerment.exception.FeedBackAlreadySubmittedException;
import com.example.womenempowerment.exception.FeedBackDoesNotExistsException;
import com.example.womenempowerment.exception.NGODoesNotExistsException;
import com.example.womenempowerment.exception.TrainingCourseDoesNotExistsException;
import com.example.womenempowerment.service.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackServ;
	
	@PostMapping("/feedback")
	public ResponseEntity<Feedback> addFeedBack(@RequestBody Feedback feedback) throws FeedBackAlreadySubmittedException{
		Feedback addfeedback = feedbackServ.addFeedBack(feedback);
		return new ResponseEntity<Feedback>(addfeedback,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/feedback")
	public ResponseEntity<Feedback> updateFeedback(@RequestBody Feedback feedback){
		Feedback updatefeedback = feedbackServ.updateFeedBack(feedback);
		return new ResponseEntity<Feedback>(updatefeedback,HttpStatus.OK);
	}
	
	@GetMapping("/feedback/{feedbackId}")
	public ResponseEntity<Optional<Feedback>> viewFeedBack(@PathVariable int feedbackId) throws FeedBackDoesNotExistsException{
		Optional<Feedback> viewbyid = feedbackServ.viewFeedBack(feedbackId);
		if(!viewbyid.isEmpty()) {
			return new ResponseEntity<Optional<Feedback>>(viewbyid,HttpStatus.OK);
		}
		else {
			throw new FeedBackDoesNotExistsException();
		}
	}
	
	@GetMapping("/feedbacks")
	public ResponseEntity<List<Feedback>> viewAllFeedBack(){
		List<Feedback> viewall = feedbackServ.viewAllFeedBack();
		return new ResponseEntity<List<Feedback>>(viewall,HttpStatus.OK);
	}
	
	@GetMapping("/viewfeedbacks/{schemeName}")
	public ResponseEntity<List<Feedback>> viewFeedbackBySchemeName(@PathVariable String schemeName) throws FeedBackDoesNotExistsException{
		List<Feedback> viewbyschemename = feedbackServ.viewFeedBackBySchemeName(schemeName);
		if(!viewbyschemename.isEmpty()) {
			return new ResponseEntity<List<Feedback>>(viewbyschemename,HttpStatus.OK);
		}
		else {
			throw new FeedBackDoesNotExistsException();
		}
	}
	
	@GetMapping("/feedbacks/{courseName}")
	public ResponseEntity<List<Feedback>> viewFeedbackByCourseName(@PathVariable String courseName) throws FeedBackDoesNotExistsException{
		List<Feedback> viewbycoursename = feedbackServ.viewFeedBackByTrainingCourseName(courseName);
		if(!viewbycoursename.isEmpty())
		{
			return new ResponseEntity<List<Feedback>>(viewbycoursename,HttpStatus.OK);
		}
		else {
			throw new FeedBackDoesNotExistsException();
		}
	}
}
