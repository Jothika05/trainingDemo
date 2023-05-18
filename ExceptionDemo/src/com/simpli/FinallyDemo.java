/*package com.simpli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		// Finally demo
		System.out.println("Finally demo \n\n ");

		int a = 45, b, rs = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a number: ");
		b= sc.nextInt();
		
		try {
			
			rs = a / b;
			FileReader f = new FileReader("a.txt");
			f.read();
			
			
		} catch (ArithmeticException Ex) {
			System.out.println("Error : " + Ex.getMessage());
		}
		catch (IOException Ex) {
			System.out.println("Error : " + Ex.getMessage());
		}
		finally {
			System.out.println(" Inside finally");
		}
		
		System.out.println("Program End ");

} */
package com.simpli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		// Finally demo
		System.out.println("Finally demo \n\n ");

		int a = 45, b, rs = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a number: ");
		b= sc.nextInt();
		
		FileReader f =null;
		try {
			
			rs = a / b;
			 f = new FileReader("a.txt");
			f.read();			
			
		} catch (ArithmeticException Ex) {
			System.out.println("Error : " + Ex.getMessage());
		}
		catch (IOException Ex) {
			System.out.println("Error : " + Ex.getMessage());
		}
		finally {
			System.out.println(" Inside finally");
			try {
			f.close();
			}catch(Exception e) {};
		}
		
		System.out.println("Program End ");

	}

}



