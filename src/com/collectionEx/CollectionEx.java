package com.collectionEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionEx {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(100);
		System.out.println(l);
		
		
		List<Integer> l2=new LinkedList<Integer>();
		l2.add(100);
		l2.add(20);
		l2.add(30);
		System.out.println(l2);
		
		
//		l2.addAll(l);
//		System.out.println(l2);
		
//		l2.retainAll(l);
//		System.out.println(l2);
		
		l2.removeAll(l);
		System.out.println(l2);
		
		
		
		
//		int size = l.size();
//		System.out.println(size);
//		
//		Integer integer = l.get(0);
//		System.out.println(integer);
//		
//		Integer set = l.set(1, 500);
//		System.out.println(l);
//		
//		Integer remove = l.remove(2);
//		System.out.println(l);
//		
//		int indexOf = l.indexOf(500);
//		System.out.println(indexOf);
//		
//		boolean contains = l.contains(500);
//		System.out.println(contains);
//		
		
		
		
		
		
//		List<Integer> l=new ArrayList<Integer>();
//		l.add(100);
//		l.add(300);
//		l.add(200);
//		l.add(100);
//		System.out.println(l);
//		
//		
//		List<Integer>l2=new LinkedList<Integer>();
//		l2.add(10);
//		l2.add(20);
//		l2.add(100);
//		System.out.println(l2);
		
		
//		l2.addAll(l);
//		System.out.println(l2);
		
		
//		l2.retainAll(l);
//		System.out.println(l2);
		
//		l2.removeAll(l);
//		System.out.println(l2);
//		
		
//		int size = l.size();
//		System.out.println(size);
//		
//		Integer integer = l.get(2);
//		System.out.println(integer);
//		
//		Integer set = l.set(1, 500);
////		System.out.println(set);
//		System.out.println(l);
//		
//		Integer remove = l.remove(3);
////		System.out.println(remove);
//		System.out.println(l);
//		
//		int indexOf = l.indexOf(100);
//		System.out.println(indexOf);
//		
//		boolean contains = l.contains(500);
//		System.out.println(contains);
		
		
		
	}

}
