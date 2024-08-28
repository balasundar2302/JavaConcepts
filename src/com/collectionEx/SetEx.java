package com.collectionEx;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	public static void main(String[] args) {
		Set<String>s=new HashSet<String>();
		s.add("Mobile");
		s.add("Tv");
		s.add("Laptop");
		s.add("Tv");
		s.add(null);
		s.add(null);
		System.out.println(s);
		
		
		Set<Integer>s2=new LinkedHashSet<Integer>();
		
		s2.add(200);
		s2.add(null);
		s2.add(200);
		s2.add(null);
		s2.add(100);
		System.out.println(s2);
		
		
		Set<String>s3=new TreeSet<String>();
		s3.add("Tamil");
		s3.add("English");
		s3.add("Maths");
		s3.add("English");
//		s3.add(null);
		System.out.println(s3);
		
		System.out.println("Set");
		
		
		Set<Short> s4=new HashSet<Short>();
		s4.add((short)100);
		
		
		
//		  add()    remove()    retainAll()   
//		 size()   indexof()   removeAll()
//		 get()    contains()
//		 set()    addAll()	
		
		
		
	}

}
