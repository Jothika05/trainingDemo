package com.simpli;

public class Person extends Thread{
	
	Postman postman;
	String msg;
	
	
	public Person(Postman postman, String msg) {
		// super();
		this.postman = postman;
		this.msg = msg;
	}	
	
	public void run() {
		
		//synchronized (postman) {
			postman.send(msg);
		//}		
	}

}