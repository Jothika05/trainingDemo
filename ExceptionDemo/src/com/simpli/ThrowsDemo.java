
package com.simpli;

public class ThrowsDemo {

	public static void main(String[] args) {
		// Throws demo
		System.out.println(" Throws demo ");

		Class2 c1 = new Class2();

		try {
			c1.division();
		} catch (Exception e) {
			System.out.println("Exception happened " + e);
		}
		
		System.out.println("Program End ");

	}

}

class Class2 {

	void division() throws Exception {

		int a = 45, b = 0, rs;

		rs = a / b;

		System.out.print("\n\tThe result is : " + rs);

	}
} 