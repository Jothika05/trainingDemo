

package com.simpli;

public class OuterClass {

		private int price=100;
		
		//inner class definition
		class Class1{
			
			int age;
			
			public void display() {
				System.out.println(" I am inner class class 1");
			}
			
			public void displayPriceOfTheOuterClass() {
				System.out.println(" Outer class has price = " + price);
			
			}}
		}