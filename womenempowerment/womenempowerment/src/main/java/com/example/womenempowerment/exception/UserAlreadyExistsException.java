package com.example.womenempowerment.exception;

public class UserAlreadyExistsException extends Exception{
	
	String msg;
	
	public UserAlreadyExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public UserAlreadyExistsException() {
		super();
	}
}
