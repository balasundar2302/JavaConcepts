package com.dayOne;

import java.util.ArrayList;
import java.util.List;

public class JavaEx {
	public static void main(String[] args) {
//		List<Integer> l=new ArrayList<Integer>();
//		l.add(10);
//		l.add(11);
//		l.add(13);
//		for (Integer integer : l) {
//			if (integer%2!=0) {
//				System.out.println(integer);
//			}
//		}
//		
		
	
//	List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//    // Get the list of odd numbers
//    List<Integer> oddNumbers = filterOddNumbers(numbers);
//
//    // Print the list of odd numbers
//    System.out.println("Odd numbers: " + oddNumbers);
//}
//
//// Function to filter odd numbers from a list
//public static List<Integer> filterOddNumbers(List<Integer> numbers) {
//    List<Integer> oddNumbers = new ArrayList<>();
//    for (Integer number : numbers) {
//        if (number % 2 != 0) {
//            oddNumbers.add(number);
//        }
//    }
//    return oddNumbers;
//}


//	String str="reverse";
//	
//	for (int i = str.length()-1; i >=0; i--) {
//		System.out.print(str.charAt(i));
//	}
	
		String str="reverse string";
		
		String[] sp = str.split(" ");
		for (int i = sp.length-1; i >=0; i--) {
			String[] sp2 = sp[i].split(" ");
			for (int j = sp2.length-1; j >=0; j--) {
				System.out.print(sp2[j].charAt(j));
			}
			
//			System.out.print(sp[i]+" ");
		}
		
//		System.out.println(str);
//		String str2=str;
//		System.out.println(str2);
//		
	
	
	}
}
