package com.keywords;

public class Keywords {

	static int d=10;
	public static void staticMethod() {
		System.out.println("STATIC METHOD");
	
	}
	public void method2() {
		this.staticMethod();
		System.out.println(this.d);
	}
	
	public final void finalMethod() {
		System.out.println("FINAL METHOD");
		final int c=10;
//		c=20;
		System.out.println(c);
		this.staticMethod();
	}
	
	private int returnMethod() {
		int b=27;
		return b;
	}
	private int returnMethod2() {
		int d=40;
		return d;
	}
	
	
	public static void main(String[] args) {
		Keywords k=new Keywords();
//		staticMethod();
//		System.out.println(d);
		k.finalMethod();
		System.out.println(k.returnMethod()+k.returnMethod2());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	static int a=10;
//
//	public static void staticMethod() {
//		System.out.println("STATIC METHOD");
//	}
//
//	public void method2() {
//		System.out.println("METHOD 2");
//		this.staticMethod();
//		System.out.println(this.a);
//	}	
//	public  void finalMethod() {
//		
//		
//		final int l=20;
////		 l=25;
//		System.out.println(l);
//	}
//	
//	private int returnMethod() {
//		int c=25;
//		return c;
//	}
//	
//	private int returnMethod2() {
//		int d=20;
//		return d;
//	}
//	
//	
//	public static void main(String[] args) {
//		staticMethod();
//		System.out.println(a);
//		
//		Keywords k=new Keywords();
//		k.finalMethod();
//		
//		System.out.println(k.returnMethod()+k.returnMethod2() );
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
