package com.inheritance;

public class GrandChild extends Child{
	
	public void laptop() {
		System.out.println("Lenovo");
	}
	@Override
	public void land() {
		// TODO Auto-generated method stub
		super.land();
	}
	@Override
	public void car() {
		// TODO Auto-generated method stub
		super.car();
	}
		@Override
		public void watch() {
			// TODO Auto-generated method stub
			super.watch();
		}
		public static void main(String[] args) {
			GrandChild gc=new GrandChild();
			gc.laptop();
			gc.land();
			gc.car();
			gc.watch();
		}

}
