package com.abstraction2;

public class ClassB extends ClassA{
	@Override
	public void personalLoan() {
		System.out.println("8%");
	}
	
	@Override
	public void educationalLoan() {
		// TODO Auto-generated method stub
		super.educationalLoan();
	}
	public static void main(String[] args) {
		ClassB c=new ClassB();
		c.personalLoan();
		c.educationalLoan();
	}
	

}
