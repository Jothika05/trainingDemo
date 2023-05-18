package com.simpli;

public class EmpInfo {
	int id;
	String name;
	int salary;
	
public EmpInfo() {    }	

	public EmpInfo(int id, String name, int salary) {
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// method to return task
	float getTaxAmount() {
		float tax = (float) (this.salary*0.1);
		return tax;
	}
	
	 //Example of another method that takes 1 argument and does not return anything
		void incrementSalaryBy(int val){
			this.salary = this.salary + val;
		}

	// Example of overloaded method
		float getTaxAmount(float taxRate){
			
			float tax =  this.salary * (taxRate / 100);
			
			return tax;
		}
		
		
}


