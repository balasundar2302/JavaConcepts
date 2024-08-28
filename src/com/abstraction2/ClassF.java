package com.abstraction2;

public class ClassF implements IntC,IntE{

	@Override
	public void homeLoan() {
		System.out.println("12%");
	}

	@Override
	public void bikeLoan() {
		System.out.println("10%");
	}

	@Override
	public void carLoan() {
		System.out.println("8%");
	}
public static void main(String[] args) {
	ClassF c=new ClassF();
	c.homeLoan();
	c.bikeLoan();
	c.carLoan();
}
}
