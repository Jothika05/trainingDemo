package com.simpli;

public class Postman {
	
	String msg;
	
	 public void send(String msg) {
		 
		 System.out.println("Sending "  + msg ); 
		 
		 try {
			 // the post is packing the msg on a telegram
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		 
		 System.out.println("\n" + msg + " Sent"); 
		 
		 
	 }

 }

