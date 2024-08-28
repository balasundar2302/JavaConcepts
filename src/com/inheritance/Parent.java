package com.inheritance;

public class Parent {
	
	public void land() {
		System.out.println("5 acres");
	}
	public void land(int i) {
		System.out.println("5 acres");
	}
	public void car() {
		System.out.println("Ambassador");

	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.car();
		p.land();
	}

}
