package com.example.womenempowerment.exception;

public class SchemeDoesNotExistsException extends Exception{
	String msg;
	
	public SchemeDoesNotExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public SchemeDoesNotExistsException() {
		super();
	}
}
