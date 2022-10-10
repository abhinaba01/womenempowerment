package com.example.womenempowerment.exception;

public class UserDoesNotExistsException extends Exception{
	String msg;
	
	public UserDoesNotExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public UserDoesNotExistsException() {
		super();
	}
}
