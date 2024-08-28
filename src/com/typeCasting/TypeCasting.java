package com.typeCasting;

public class TypeCasting {
	
	public void casting() {
		System.out.println("CAST");
	}
	
	public static void main(String[] args) {
		byte b = 100;

//		short s = b;
//		System.out.println(s);   //widening
		
		short s=(short)b;
		System.out.println(s);
		
		long l=2389219l;
		int i=(int)l;
		System.out.println(i);   //narrowing
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// public void casting() {
//		System.out.println("CAST");
//	}
//
//	public static void main(String[] args) {
//		short s = 123;
//
////		int i=s;
////		System.out.println(i);   //widening
//
//		double d = (double) s;
//		System.out.println(d);
//
//		long l = 1275467l;
//
////		byte b=l;
//		int b = (int) l;
//		System.out.println(b); // narrowing
//	}
}
