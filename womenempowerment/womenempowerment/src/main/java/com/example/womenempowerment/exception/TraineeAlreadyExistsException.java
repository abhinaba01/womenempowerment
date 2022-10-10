package com.example.womenempowerment.exception;

public class TraineeAlreadyExistsException extends Exception{
	String msg;

	public TraineeAlreadyExistsException(String msg) {
		super();
		this.msg = msg;
	}

	public TraineeAlreadyExistsException() {
		super();
	}
}
