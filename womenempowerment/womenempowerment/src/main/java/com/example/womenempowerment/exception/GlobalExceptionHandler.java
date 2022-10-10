package com.example.womenempowerment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=TrainingCourseAlreadyExistsException.class)
	public ResponseEntity<String> TrainingCourseAlreadyExistsException(TrainingCourseAlreadyExistsException trainingCourseAlreadyExistsException){
		return new ResponseEntity<String>("Training course already exists",HttpStatus.CONFLICT);
	}
		
	@ExceptionHandler(value=TrainingCourseDoesNotExistsException.class)
	public ResponseEntity<String> TrainingCourseDoesNotExistsException(TrainingCourseDoesNotExistsException trainingCourseDoesNotExistsException){
		return new ResponseEntity<String>("Training course does not exists",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=NGOAlreadyExistsException.class)
	public ResponseEntity<String> NGOAlreadyExistsException(NGOAlreadyExistsException ngoAlreadyExistsException){
		return new ResponseEntity<String>("NGO already exists",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=NGODoesNotExistsException.class)
	public ResponseEntity<String> NGODoesNotExistsException(NGODoesNotExistsException ngoDoesNotExistsException){
		return new ResponseEntity<String>("NGO does not exists",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=TraineeAlreadyExistsException.class)
	public ResponseEntity<String> TraineeAlreadyExistsException(TraineeAlreadyExistsException traineeAlreadyExistsException){
		return new ResponseEntity<String>("Trainee already exists",HttpStatus.CONFLICT);
	}
		
	@ExceptionHandler(value=TraineeDoesNotExistsException.class)
	public ResponseEntity<String> TraineeDoesNotExistsException(TraineeDoesNotExistsException traineeDoesNotExistsException){
		return new ResponseEntity<String>("Trainee does not exists",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=SchemeAlreadyExistsException.class)
	public ResponseEntity<String> SchemeAlreadyExistsException(SchemeAlreadyExistsException schemeAlreadyExistsException){
		return new ResponseEntity<String>("Scheme already exists",HttpStatus.CONFLICT);
	}
		
	@ExceptionHandler(value=SchemeDoesNotExistsException.class)
	public ResponseEntity<String> SchemeDoesNotExistsException(SchemeDoesNotExistsException schemeDoesNotExistsException){
		return new ResponseEntity<String>("Scheme does not exists",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=FeedBackAlreadySubmittedException.class)
	public ResponseEntity<String> FeedBackAlreadySubmittedException(FeedBackAlreadySubmittedException feedbackAlreadySubmittedException){
		return new ResponseEntity<String>("Feedback already submitted",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=FeedBackDoesNotExistsException.class)
	public ResponseEntity<String> FeedBackDoesNotExistsException(FeedBackDoesNotExistsException feedbackDoesNotExistsException){
		return new ResponseEntity<String>("Feedback does not exist",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=UserAlreadyExistsException.class)
	public ResponseEntity<String> UserAlreadyExistsException(UserAlreadyExistsException userAlreadySubmittedException){
		return new ResponseEntity<String>("User already exists",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=UserDoesNotExistsException.class)
	public ResponseEntity<String> UserDoesNotExistsException(UserDoesNotExistsException userDoesNotExistsException){
		return new ResponseEntity<String>("User does not exist",HttpStatus.NOT_FOUND);
	}

}
