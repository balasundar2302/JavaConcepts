package com.inheritance2;

public class GrandChild extends Child{
@Override
public void car() {
	// TODO Auto-generated method stub
	super.car();
}
@Override
	public void bike() {
		// TODO Auto-generated method stub
		super.bike();
	}
@Override
	public void land() {
		// TODO Auto-generated method stub
		super.land();
	}

public static void main(String[] args) {
	GrandChild gc=new GrandChild();
	gc.car();
	gc.land();
	gc.bike();
}
}
