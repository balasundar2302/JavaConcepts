package com.conditionalStatements;

public class Conditions {
	
	
	public static void main(String[] args) {
		
		int age=9;
		
		if (age<=10) {
			System.out.println("Primary school");
		}
		else if (age<=15) {
			System.out.println("Secondary school");
		}
		else if (age<=17) {
			System.out.println("Higher secondary");
		}
		else {
			System.out.println("College");
		}
		
}
}