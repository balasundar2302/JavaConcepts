package com.polymorphism;

public class OverRiding extends OverLoading {
	@Override
	public void student() {
		// TODO Auto-generated method stub
		super.student();
	}
	@Override
	public void student(int i) {
		// TODO Auto-generated method stub
		super.student(i);
	}
	@Override
	public void student(int j, String i) {
		// TODO Auto-generated method stub
		super.student(j, i);
	}
	@Override
	public void student(String i) {
		// TODO Auto-generated method stub
		super.student(i);
	}
	@Override
	public void student(String i, int j) {
		// TODO Auto-generated method stub
		super.student(i, j);
	}
	
	public static void main(String[] args) {
		OverRiding o=new OverRiding();
		o.student();
		o.student("Bala");
		o.student(11);
		o.student(5, "A");
		o.student("English", 95);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public void student() {
//		// TODO Auto-generated method stub
//		super.student();
//	}
//
//	@Override
//	public void student(int i) {
//		// TODO Auto-generated method stub
//		super.student(i);
//	}
//
//	@Override
//	public void student(int i, String s) {
//		// TODO Auto-generated method stub
//		super.student(i, s);
//	}
//
//	@Override
//	public void student(String s) {
//		// TODO Auto-generated method stub
//		super.student(s);
//	}
//
//	@Override
//	public void student(String s2, int j) {
//		// TODO Auto-generated method stub
//		super.student(s2, j);
//	}
//
//	public static void main(String[] args) {
//		OverRiding or = new OverRiding();
//		or.student();
//		or.student(15);
//		or.student("Bala");
//		or.student(1, "B");
//		or.student("Tamil", 98);
//	}

	
	
	
//	@Override
//	public void student() {
//		super.student();
//	}
//	@Override
//	public void student(int i, String s2) {
//		super.student(i, s2);
//	}
//	@Override
//	public void student(String s) {
//		super.student(s);
//	}
//	@Override
//	public void student(String s3, int i2) {
//		super.student(s3, i2);
//	}
//	public static void main(String[] args) {
//		OverRiding or=new OverRiding();
//		or.student();
//		or.student("Ram");
//		or.student(50012, "B");
//		or.student("Maths", 90);	
//	}
}
