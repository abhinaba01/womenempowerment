package com.example.womenempowerment.exception;

public class TrainingCourseAlreadyExistsException extends Exception{
	String msg;
	
	public TrainingCourseAlreadyExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public TrainingCourseAlreadyExistsException() {
		super();
	}
}
