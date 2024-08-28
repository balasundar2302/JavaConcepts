package com.string;

public class StringTypes {
public static void main(String[] args) {

	//immutable:
	String s="Selenium";
	String s2="Selenium";
	System.out.println(s);
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s2));
	
	String s3=s.concat(s2);
	System.out.println(s3);
	
	System.out.println(System.identityHashCode(s3));
	
	//mutable:
	StringBuffer sb=new StringBuffer("Java");
	StringBuffer sb2=new StringBuffer("Java");
	System.out.println(sb);
	
	System.out.println(System.identityHashCode(sb));
	System.out.println(System.identityHashCode(sb2));
	
	StringBuffer sb3=sb.append(sb2);
	System.out.println(sb3);
	System.out.println(System.identityHashCode(sb3));
	 
//	System.err.println(sb3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	//Immutable:
//	String s="Java";
//	String s2="Java";
//	System.out.println(s);
//	System.out.println(System.identityHashCode(s));
//	System.out.println(System.identityHashCode(s2));
//	
//	String s3=s.concat(s2);
//	System.out.println(s3);
//	System.out.println(System.identityHashCode(s3));
//	
//	System.out.println("=================");
//	
//	//Mutable:
//	StringBuffer sb=new StringBuffer("Selenium");
//	StringBuffer sb2=new StringBuffer("Selenium");
//	System.out.println(sb);
//	System.out.println(System.identityHashCode(sb));
//	System.out.println(System.identityHashCode(sb2));
//	
//	StringBuffer sb3=sb.append(sb2);
//	System.out.println(sb3);
//	System.out.println(System.identityHashCode(sb3));
	
	
	
//	String s="java selenium";
//	String[] words = s.split(" ");
//	for (String word : words) {
//		System.out.println(word);
//	}
	
	
	
	

}
}
