package com.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExceptionsEx {
	
	
	public static void main(String[] args) {
		
		//Arithmetic Exception:
		
		int a=10;
		
		System.out.println(a);
//		System.out.println(a/0);
		
		//Null pointer:
		Set<Integer> s=new TreeSet<Integer>();
		s.add(10);
//		s.add(null);
		System.out.println(s);
		
		
		//Input mismatch:
//		Scanner sc=new Scanner(System.in);
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
		
		//ArrayIndex out of bound:
		int v[]= {1,2,3};
//		System.out.println(v[4]);
		
		//String out of bound:
		String str="Exceptions";
//		char charAt = str.charAt(10);
//		System.out.println(charAt);
		
		//Number Format exception:
//		String st="12345abc";
//		int int1 = Integer.parseInt(st);
//		System.out.println(int1);
		
		int a4=100;
		String valueOf = String.valueOf(a4);
		System.out.println(valueOf);
		
		//Indexoutof bound:
		List<String> li=new ArrayList<String>();
		li.add("Abc");
		li.add("def");
		li.add("ghi");
		System.out.println(li.get(3));
		
		
		
		
		
		
	}
	

}
