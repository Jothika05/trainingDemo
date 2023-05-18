package com.simpli;

public class CustomeExceptionDemo {

	public static void main(String[] args) {
		System.out.println(" Custom Ex Demo:\n");

		Class3 c3 = new Class3();

		try {
			c3.callMe(15);
			c3.callMe(5);
		} catch (MyException e) {
			System.out.println("Exception happened " + e.getMessage());
		}

		System.out.println("Program End ");
	}

}

class Class3 {

	void callMe(int x) throws MyException {
		if (x == 5)
			throw new MyException(x + " as Input not accepted!");
		else
			System.out.println("Thank you for the input " + x + " accepted");
	}

}