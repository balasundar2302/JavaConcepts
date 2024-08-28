package com.exceptions;

public class NewException {
	public static void main(String[] args) throws BalaException {
		int i=10;
		if (i<20) {
			System.out.println(i);
		}
		else {
			throw new BalaException();
		}
	}
}
