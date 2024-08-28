package com.polymorphism;

public class OverLoading {
	public void student() {
		System.out.println("STUDENT DETAILS");
	}

	public void student(String i) {
		System.out.println("Name:" + i);
	}

	public void student(int i) {
		System.out.println("Roll No :" + i);
	}

	public void student(String i, int j) {
		System.out.println("Subject:" + i + " " + "Marks:" + " " + j);
	}

	public void student(int j, String i) {
		System.out.println("Rank:" + j + " " + "Section:" + i);
	}

	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		o.student();
		o.student("Ram");
		o.student(10);
		o.student("Maths", 90);
		o.student(2, "B");

	}

//	public void student() {
//		System.out.println("STUDENT DETAILS");
//	}
//
//	public void student(String s) {
//		System.out.println("Name is :" + s);
//	}
//
//	public void student(int i) {
//		System.out.println("Roll no:" + i);
//	}
//
//	public void student(int i, String s) {
//		System.out.println("Rank :" + i + " " + "Section: " + s);
//	}
//	
//
//	public void student(String s2, int j) {
//		System.out.println("Subject :" + s2 + " " + "Marks :" + j);
//	}
//
//	public static void main(String[] args) {
//		OverLoading o = new OverLoading();
//		o.student();
//		o.student("Ram");
//		o.student(10);
//		o.student(5, "A");
//		o.student("Maths", 90);
//		

}

//	public void student() {
//		System.out.println("1st");
//	}
//	public void student(String s) {
//		System.out.println("Student Name is: "+s);
//	}
//	public void student(int i,String s2) {
//		System.out.println("Roll no:"+i+" "+"Section:"+s2);
//	}
//	public void student(String s3,int i2) {
//		System.out.println("Subject:"+s3+" "+"Marks: "+i2);
//	}
////	
//	public static void main(String[] args) {
//		OverLoading o=new OverLoading();
//		o.student();
//		o.student("Prashanth");
//		o.student(50010,"A");
//		o.student("Tamil", 97);
//	
//		
//	}
