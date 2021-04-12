package com.uday.day3;

class Employee{
	public int empId;
	public String firstName;
	public String lastName;
	public String email;
	public int age;
	
	public void getFullName() {
		System.out.println(firstName+" "+lastName);
	}
}
class FullTimeEmployee extends Employee{
	public int annualSalary;
}
class PartTimeEmployee extends Employee{
	public int hourSalary;
}


public class Demo7{
	public static void main(String[] args) {
		FullTimeEmployee fte = new FullTimeEmployee();
		fte.firstName = "Uday";
		fte.lastName = "Krishna";
		
		PartTimeEmployee pte = new PartTimeEmployee();
		pte.firstName = "chai";
		pte.lastName = "Kyubi";
		
		fte.getFullName();
		pte.getFullName();
	}
}