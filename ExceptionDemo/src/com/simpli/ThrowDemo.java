package com.simpli;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		// Throw and Throws demo
		System.out.println(" Throw demo ");
		
		Class1 c1 = new Class1();
		
		c1.callMe(15);
		
		System.out.println("Program End ");
			
	}

}

class Class1{
	
	void callMe(int x) {
		if (x == 5)
			throw new RuntimeException(x + " as Input not accepted!");
		else
			System.out.println("Thank you for the input. accepted");
	}
	
}
