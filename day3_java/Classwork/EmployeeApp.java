package com.coforge.day3;

public class EmployeeApp {
	public static void main(String args[]) {
		Employee varSHIT = new Employee(101,"varSHIT",6000);
		Employee charity = new Employee(102, "Charith",6000);
		varSHIT.display();
		varSHIT.setSalary(6500);
		varSHIT.display();
		charity.getSalary();
	    charity.display();
	}

}
