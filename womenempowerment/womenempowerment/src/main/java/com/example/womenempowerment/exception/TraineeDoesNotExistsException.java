package com.example.womenempowerment.exception;

public class TraineeDoesNotExistsException extends Exception{
	String msg;
	
	public TraineeDoesNotExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public TraineeDoesNotExistsException() {
		super();
	}
}
