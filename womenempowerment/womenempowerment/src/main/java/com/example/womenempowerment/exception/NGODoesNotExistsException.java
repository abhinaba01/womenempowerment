package com.example.womenempowerment.exception;

public class NGODoesNotExistsException extends Exception{
	String msg;
	
	public NGODoesNotExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public NGODoesNotExistsException() {
		super();
	}
}
