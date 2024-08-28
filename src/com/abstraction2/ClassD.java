package com.abstraction2;

public class ClassD implements IntC{

	@Override
	public void bikeLoan() {
		System.out.println("10%");
	}

	@Override
	public void carLoan() {
		System.out.println("9%");
	}
	
	public static void main(String[] args) {
		ClassD c=new ClassD();
		c.bikeLoan();
		c.carLoan();
	}

}
