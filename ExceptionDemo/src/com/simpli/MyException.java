package com.simpli;


public class MyException extends Exception{
	
	String message;
	
	public MyException(String str) {
		this.message = str;
		
	}
	
	public String getMessage() {
		return this.message;
	}

}
