package com.simpli;

public class SleepWaitDemoMain {
	
	private static Object LOCK = new Object();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sleep demo..");

		// make the main thread sleep for 1 sec = 1000ms

		try {
			
			System.out.println("Main thread is going to sleep for 1 sec");
			Thread.sleep(1000); // 1 sec sleep
			System.out.println("Main thread is waking up");			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Wait demo..");
		synchronized (LOCK) {
			/// do something
			System.out.println("Main thread is going to WAIT for 5 sec");
			LOCK.wait(5000);
			System.out.println("Main thread is waking up from WAIT");
			
		}

	}

}