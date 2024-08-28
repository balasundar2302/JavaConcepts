package com.abstraction3;

public class Class3 implements Inter1,Inter2{

	@Override
	public void homeLoan() {
		System.out.println("9%");
	}

	@Override
	public void carLoan() {
		System.out.println("10%");
	}
	
	public static void main(String[] args) {
		Class3 c3=new Class3();
		c3.homeLoan();
		c3.carLoan();
		c3.bikeLoan();
	}

	@Override
	public void bikeLoan() {
		System.out.println("11%");
	}

}
