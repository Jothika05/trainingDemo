package com.simpli;

public class Main {

	public static void main(String[] args) {
		System.out.println("Thread creation and starting them..");
		
		MyThread mThread1 =  new MyThread();
		MyThread mThread2 =  new MyThread();
		
		mThread1.start();
		mThread2.start();
		
		//Approach 2 of creating Threads from runnable classes
		MyRunnableThread myRunnableThreadObj1 = new MyRunnableThread();
		Thread myRunnableThread1 = new Thread(myRunnableThreadObj1);
		
		myRunnableThread1.start();
	
		
		for(int i=0;i<10;i++)
		System.out.println("Main "+i);
		
		System.out.println("End of Main");

	}

}
