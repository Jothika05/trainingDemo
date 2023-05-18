

package com.simpli;

public class Main {

	public static void main(String[] args) {
		// Exception demo
		System.out.println(" try-catch Exception handling demo ");

		int[] array = new int[3];

		try {
			array[7] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught an exception " + e);
		}

		System.out.println("End of program");

	} 

}