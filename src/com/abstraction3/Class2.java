package com.abstraction3;

public class Class2 extends Class1{

	@Override
	public void personalLoan() {
		System.out.println("7%");
	}
	@Override
	public void educationalLoan() {
		// TODO Auto-generated method stub
		super.educationalLoan();
	}
	public static void main(String[] args) {
		Class2 c2=new Class2();
		c2.personalLoan();
		c2.educationalLoan();
	}

}
