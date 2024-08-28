package com.typeCasting;

import com.accessSpecifiers.Specifiers;
import com.variables.Variables;

public class Access extends Specifiers{
@Override
public void publicAccess() {
	// TODO Auto-generated method stub
	super.publicAccess();
}
@Override
	protected void protectedAccess() {
		// TODO Auto-generated method stub
		super.protectedAccess();
	}

public static void main(String[] args) {
	Access a=new Access();
	a.protectedAccess();
	a.publicAccess();
	
	
	Specifiers s=new Specifiers();
	s.publicAccess();
	
	
}

	}
	

