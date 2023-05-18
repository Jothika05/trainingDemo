

	package com.simpli;

	public class TypeCasting{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Implicit TypeCasting");
			char a='A';
			System.out.println("Value of a:" +a);
			
			int b=a;
			System.out.println("Value of b:" +b);
			
			
			float c=a;
			System.out.println("Value of c: "+c);
			
			long d=a;
			System.out.println("Value of d: "+d);
			
			double e=a;
			System.out.println("Value of e: "+e);
			
					
			System.out.println("\n");
			
			System.out.println("Explicit Type Casting");
			//explicit conversion
			double x=45.5;
			int y = (int) x;
			
			System.out.println("Value of x: "+x);
			System.out.println("Value of y: "+y);
			
			byte b1= 86;
			char c1 = (char) b1;
			System.out.println("Value of b1: "+b1);
			System.out.println("Value of c1: "+c1);

		}

	}

