package utill;

import com.simpli.Apple;

public class AccessModifierMain {

	public static void main(String[] args) {

				Apple apple1 = new Apple();

				// Try accessing apple 's price
				// System.out.println("Apple's price = " + apple1.price); // Compiler error for
				// access permisiion
				// Try accessing the price using getter method
				System.out.println("Apple's price = " + apple1.getPrice()); // WORK

				// System.out.println("Apple's weight = " + apple1.weight); // Compiler error
				// for access permisiion

				// Try accessing apple 's color
				System.out.println("Inside com.simpli.util packege. Apple's color = " + apple1.color); // WORKS

				// Try accessing apple 's city of origin
				//System.out.println("Apple's color = " + apple1.cityOfOrigin); // Compiler error
						
				
				// Try accessing Snowapple 's city of origin
				SnowApple snowapple1 = new SnowApple();
				System.out.println("Snow Apple's city of origin = " + snowapple1.displayCityOfOrigin());

			}

		}


