package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "babu";
		//* 1) Convert String to Character array
		char[] arr1=input.toCharArray();
		//* 2) Create a new Set -> HashSet
		Set<Character> str1=new HashSet<Character>();
		for (char c : arr1) {
			// * 3) Add each character to the Set and if it is already there, remove it
			System.out.println(c);
			str1.add(c);
			
		}
		// * 4) Finally, print the set
		System.out.println(str1);
				 
	}

}
