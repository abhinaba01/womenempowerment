package com.example.womenempowerment.exception;

public class FeedBackAlreadySubmittedException extends Exception{
	String msg;
	
	public FeedBackAlreadySubmittedException(String msg) {
		super();
		this.msg=msg;
	}
	
	public FeedBackAlreadySubmittedException() {
		super();
	}
}
