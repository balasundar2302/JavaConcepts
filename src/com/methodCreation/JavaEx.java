package com.methodCreation;

public class JavaEx {
	private void methodA() {
		System.out.println("METHOD 1");
	}
	private void methodB() {
		System.out.println("METHOD B");
	}

	public static void main(String[] args) {
		JavaEx j=new JavaEx();
		j.methodA();
		j.methodB();
	}
	
}
