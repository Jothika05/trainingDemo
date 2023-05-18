package com.simpli;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	             // Class1 c1 = new Class1(); WONT WORK
				
		OuterClass outClassObj = new OuterClass();

		OuterClass.Class1 c1 = outClassObj.new Class1();

		c1.display();

		c1.displayPriceOfTheOuterClass();

		// Another way
		OuterClass.Class1 c2 = new OuterClass().new Class1();
		c2.display();
		c2.displayPriceOfTheOuterClass();


}}