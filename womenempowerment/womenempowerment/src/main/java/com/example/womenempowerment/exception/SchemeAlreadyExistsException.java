package com.example.womenempowerment.exception;

public class SchemeAlreadyExistsException extends Exception{
String msg;
	
	public SchemeAlreadyExistsException(String msg) {
		super();
		this.msg=msg;
	}
	
	public SchemeAlreadyExistsException() {
		super();
	}
}
