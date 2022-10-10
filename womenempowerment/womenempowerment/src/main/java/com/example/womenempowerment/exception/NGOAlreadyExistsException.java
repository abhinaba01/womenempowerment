package com.example.womenempowerment.exception;

public class NGOAlreadyExistsException extends Exception{
	
	String msg;
	
	public NGOAlreadyExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public NGOAlreadyExistsException() {
		super();
	}
}
