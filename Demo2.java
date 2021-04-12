package com.uday;

public class Demo2 {
	public static void main(String[] args) {
		
		int age = 19;
		if (age > 20) {
			System.out.println("Eligible for voting");
		}else {
			System.out.println("Not Eligible");
		}
		int num = 10;
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
		
		System.out.println((num%2==0?"even":"odd"));
		int marks = 50;
		if(marks<50) {
			System.out.println("D grade");
		}
		else if(marks>=50 && marks <70) {
			System.out.println("C Grade");
		}
		else if(marks>=70 && marks <90) {
			System.out.println("B Grade");
		}
		else if(marks>=90 && marks <100) {
			System.out.println("A Grade");
		}
		else {
			System.out.println("fail");
			
		}
		
	}

}
