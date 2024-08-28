package com.accessSpecifiers;

public class Class2 extends Specifiers{

	@Override
	protected void protectedAccess() {
		// TODO Auto-generated method stub
		super.protectedAccess();
	}
	@Override
	public void publicAccess() {
		// TODO Auto-generated method stub
		super.publicAccess();
	}
	@Override
	void voidAccess() {
		// TODO Auto-generated method stub
		super.voidAccess();
	}
	public static void main(String[] args) {
		Class2 c2=new Class2();
		c2.protectedAccess();
		c2.publicAccess();
		c2.voidAccess();
		
		Specifiers s=new Specifiers();
		s.voidAccess();
	}
	
}
