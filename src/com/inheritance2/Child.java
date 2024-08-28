package com.inheritance2;

public class Child extends Parent{
	
	public void bike() {
		System.out.println("YAMAHA");
	}
	@Override
	public void car() {
		super.car();
	}
	@Override
	public void land() {
		// TODO Auto-generated method stub
		super.land();
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.bike();
		c.car();
		c.land();
	}
}
