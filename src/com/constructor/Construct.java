package com.constructor;

public class Construct {

	public Construct() {
		this(10);
		System.out.println("CONSTRUCTOR");
	}
	public Construct(int a) {
		this(100, "Rank");
		System.out.println(a);
	}
	public Construct(int a,String b) {
		this("Surya", 25);
		System.out.println(a+b);
	}
	public Construct(String c,int d) {
		System.out.println(c+d);
	}
	public static void main(String[] args) {
		Construct c=new Construct();
	}
}
