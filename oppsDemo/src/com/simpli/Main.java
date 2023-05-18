
package com.simpli;

public class Main {

	public static void main(String[] args) {
		Dog scott = new Dog("Scott", "papillon", 5, "black");
		System.out.println(scott);
		
		
		//Encapsulation Demo
		// scott.age;//direct acces is  NOT allowed beacuse age is private
		
		System.out.println("\n\n Encapsulation Demo: we can access using getters");
		System.out.println("scott.getAge() = " + scott.getAge()); // WORKS
	     

		
		// Inheritance demo
		System.out.println("\n\n Inheritance Demo:. Creating the subclass instance");
		MountainBike mbike1= new MountainBike(3, 100, 25); 
		System.out.println("mbike1 is \n:" + mbike1); 
	}

}