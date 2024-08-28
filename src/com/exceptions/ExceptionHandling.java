package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExceptionHandling {
	public static void main(String[] args) {
//	int a=10;

//	Scanner s=new Scanner(System.in);

//	String s="ExceptionHandling";

		try {
//		System.out.println(a/0);

//		int nextInt = s.nextInt();
//		System.out.println(nextInt);

//		char charAt = s.charAt(20);
//		System.out.println(charAt);
			Set<Integer> se = new TreeSet<Integer>();
			se.add(10);
			se.add(null);
			System.out.println(se);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatch Exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBound");
		}
//	catch (Exception e) {
//		System.out.println("Exception");
//	}
		catch (NullPointerException e) {
			System.out.println("Null pointer");
		}

		finally {
			System.out.println("Finally");
		}

	}
}
