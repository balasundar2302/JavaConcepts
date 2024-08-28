package com.inheritance;

public class Child extends Parent {

	public void watch() {
		System.out.println("Sonata");
	}

//	private void land() {
//		// TODO Auto-generated method stub
//
//	}
	@Override
	public void land() {
		super.land();
	}
	

	@Override
	public void car() {
		// TODO Auto-generated method stub
		super.car();
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.watch();
		c.land();
		c.car();
	}
}
