package com.example.womenempowerment.exception;

public class TrainingCourseDoesNotExistsException extends Exception{
	
	String msg;
	
	public TrainingCourseDoesNotExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public TrainingCourseDoesNotExistsException() {
		super();
	}
}
