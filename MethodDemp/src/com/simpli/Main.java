package com.simpli;

	public class Main {

		public static void main(String[] args) {
			
			EmpInfo e1 = new EmpInfo();
			
			e1.salary = 15000;
			
			float tax1 = e1.getTaxAmount();
			
			System.out.println("Emp e1's tax = "+tax1);
			
		
			
			// increment e1 salary by 3000
			e1.incrementSalaryBy(3000);
			
			float tax2 = e1.getTaxAmount();
			System.out.println("Emp e1's taxafter increment = "+tax2);
			
			
			// Compute the tax given the rate is 20 percent
			float tax3 = e1.getTaxAmount(20);
			System.out.println("Emp e1's tax at 20% tax rate = "+tax3);	
			
			
			// Creating an Employee with a predefined name,id and salary
			EmpInfo e2 = new EmpInfo(2,"Santosh", 24000);
			System.out.println("Employee details of e2 : "+ e2.id + " " + e2.name + " "+ e2.salary);

		}

	
		

		}


