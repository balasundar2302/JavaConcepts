package com.typeCasting;

public class Class2 extends TypeCasting {

	@Override
	public void casting() {
		// TODO Auto-generated method stub
		super.casting();
	}

	private void casting2() {
		System.out.println("CAST2");
	}

	public static void main(String[] args) {
		Class2 c2 = new Class2();
		c2.casting();

		TypeCasting t = new TypeCasting();
		t.casting();

		TypeCasting t2 = new Class2();
		t2.casting();
		// upcasting
		

		Class2 c3 =(Class2) new TypeCasting();
		c3.casting();
		c3.casting2(); // downcasting not possible

	}

//	private void method1() {
//		System.out.println("METHOD1");
//	}
//	public static void main(String[] args) {
//		Class2 c2=new Class2();
//		
//		TypeCasting t=new TypeCasting();
//		t.casting();   		//accessing parent class property
//		//into child class without extends
//		
//		TypeCasting t2=new Class2();
//		t2.casting();    //upcasting
//		
//		Class2 c3=(Class2) new TypeCasting();
//		c3.casting();    //downcasting not possible
//	}

}
