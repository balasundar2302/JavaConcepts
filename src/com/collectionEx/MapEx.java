package com.collectionEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx {
	public static void main(String[] args) {

		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("Laptop", 25000);
		m.put("Mobile", 20000);
		m.put("Mobile", 18000);
		m.put(null, 25000);
		m.put("Earphone", 3000);
		m.put("Charger", 3000);
		m.put("Mouse", null);
		m.put("Remote", null);
		System.out.println(m);
		
		Map<Integer, String>m2=new LinkedHashMap<Integer, String>();
		m2.put(100, "A");
		m2.put(200, "B");
		m2.put(200, "C");
		m2.put(null, "D");
		m2.put(null, "E");
		
		m2.put(300, "F");
		m2.put(400, "F");
		m2.put(500, null);
		m2.put(600, null);
		System.out.println(m2);
		
		Map<String, Integer>m3=new TreeMap<String, Integer>();
		m3.put("Tamil", 90);
		m3.put("English", 89);
		m3.put("English", 95);
//		m3.put(null, 93);
		
		m3.put("Maths", 88);
		m3.put("Science", 88);
		m3.put("Social", null);
		m3.put("PET", null);

		System.out.println(m3);
		
		System.out.println(m3.size());
		
		Integer integer = m3.get("Tamil");
		System.out.println(integer);
		
		Set<String> keySet = m3.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = m3.values();
		System.out.println(values);
		
		boolean containsKey = m3.containsKey("English");
		System.out.println(containsKey);
		
		boolean containsValue = m3.containsValue(90);
		System.out.println(containsValue);
		
		Set<Entry<String, Integer>> entrySet = m3.entrySet();
		System.out.println(entrySet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Map<String, Integer> m = new Hashtable<String, Integer>();
//		
//		
//		m.put("English", 90);
//		m.put("Tamil", 98);
//		m.put("Science", 96);  //reverse order
////		m.put("Maths", 92);
////		m.put("Social", 99);
////		m.put("Chem", 91);
//
//		System.out.println(m);
//
//		
//		
//		Map<Integer, String> m3 = new ConcurrentHashMap<Integer, String>();
//		m3.put(11, "zb");
//		m3.put(90, "nb");
//		m3.put(12, "cd");
		
		
//		m2.put(100, "cs");
//		m2.put(null, "nn");
//		m2.put(null, "xyz");
//		m2.put(300, "git");
//		m2.put(400, "git");
//		m2.put(150, null);
//		m2.put(250, null);

//		System.out.println(m3);
//
//		Map<String, Integer> m3=new TreeMap<String, Integer>();
//		m3.put("Mobile", 20000);
//		m3.put("Laptop", 25000);
//		m3.put("Laptop", 22000);
////		m3.put(null, 19000);
//		m3.put("Charger", 2000);
//		m3.put("Camera", 2000);
//		m3.put("Mouse", null);
//		m3.put("Pendrive", null);
//		System.out.println(m3);
//		
//		Map<Integer, String> m4=new HashMap<Integer, String>();
//		m4.put(20, "Java");
//		m4.put(15, "Selenium");
//		int size = m4.size();
//		System.out.println(size);
//		
//		String string = m4.get(20);
//		System.out.println(string);
//		
//		Set<Integer> keySet = m4.keySet();
//		System.out.println(keySet);
//		
//		Collection<String> values = m4.values();
//		System.out.println(values);
//		
//		boolean containsKey = m4.containsKey(20);
//		System.out.println(containsKey);
//		
//		boolean containsValue = m4.containsValue("selenium");
//		System.out.println(containsValue);
//		
//		Set<Entry<Integer, String>> entrySet = m4.entrySet();
//		System.out.println(entrySet);
		
		
		
		
//		Map<String, Integer> map1=new HashMap<String, Integer>();
//		map1.put("Mobile", 20000);
//		map1.put("Laptop", 25000);
//		map1.put("Laptop", 30000);
//		map1.put(null, 22000);
//		map1.put(null, 23000);
//		map1.put("Tv", 18000);
//		map1.put("Charger", 18000);
//		map1.put("Headphone", null);
//		map1.put("Speaker", null);
//		System.out.println(map1);
//		
//		
//		Map<Integer, String> map2=new LinkedHashMap<Integer, String>();
//		map2.put(100, "tamil");
//		map2.put(90, "Maths");
//		map2.put(80, "Maths");
//		map2.put(null, "Science");
//		map2.put(null, "Social");
//		map2.put(86, null);
//		map2.put(88, null);
//		System.out.println(map2);
//		
//		Map<Integer, String> map3=new TreeMap<Integer, String>();
//		map3.put(10, "ram");
//		map3.put(8, "bala");
//		map3.put(8, "prashanth");
////		map3.put(null, "mukesh");
//		map3.put(7, "prashanth");
////		map3.put(6, null);
////		map3.put(5, null);
//		System.out.println(map3);
//		
//		int size = map3.size();
//		System.out.println(size);

//		List<Byte>l=new ArrayList<Byte>();
//		l.add((byte) 10000);
//		System.out.println(l);
//		
//		byte b=10;
//		short s=b;
//		
//		short s2=100;
//		byte b2=(byte)s2;

//		Map<String, Integer>m=new HashMap<String, Integer>();
//		m.put("Java", 1);
//		m.put("Selenium", 2);
//		m.put("Selenium", 4);
//		System.out.println(m);
//		
//		int size = m.size();
//		System.out.println(size);
//		
//		Integer integer = m.get("Java");
//		System.out.println(integer);
//		
//		Set<String> keySet = m.keySet();
//		System.out.println(keySet);
//		
//		Collection<Integer> values = m.values();
//		System.out.println(values);
//		
//		boolean containsKey = m.containsKey("Selenium");
//		System.out.println(containsKey);
//		
//		boolean containsValue = m.containsValue(4);
//		System.out.println(containsValue);
//		
//		Set<Entry<String, Integer>> entrySet = m.entrySet();
//		System.out.println(entrySet);

	}

}
