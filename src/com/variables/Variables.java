package com.variables;

public class Variables {

	String s = "Class Variable";
	static int j = 30;

	private void localVariable() {
		int a = 10;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Variables v = new Variables();
		v.localVariable();
		System.out.println(v.s);
		System.out.println(j);
	}
}

// String s="Class Variable";
//	static int j=25;
//	private void localVariable() {
//		int i=10;
//		System.out.println(i);
//	}
//	public void localVariable2() {
//		int i=80;
//		System.out.println(i);
//	}
//	protected void localVariable3() {
//		int i=80;
//		System.out.println(i);
//	}
//	 void localVariable4() {
//		int i=80;
//		System.out.println(i);
//	}
//	
//	public static void main(String[] args) {
//		Variables v=new Variables();
//		v.localVariable();
//		System.out.println(v.s);
//		System.out.println(j);
//		
//		
//	}
