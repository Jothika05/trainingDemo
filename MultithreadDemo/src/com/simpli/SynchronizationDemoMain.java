package com.simpli;

public class SynchronizationDemoMain {

	public static void main(String[] args) {
		System.out.println("Synchronization Demo");
		
		Postman commonPostman = new Postman();
		
		Person person1 = new Person(commonPostman, "Hi");
		Person person2 = new Person(commonPostman, "Bye");
		Person person3 = new Person(commonPostman, "Good night");
		
		person3.start();
		person1.start();
		person2.start();	

	}

}