package com.example.womenempowerment.exception;

public class FeedBackDoesNotExistsException extends Exception{
	String msg;
	
	public FeedBackDoesNotExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public FeedBackDoesNotExistsException() {
		super();
	}
}
