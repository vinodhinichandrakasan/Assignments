package week3.day2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";	
		String result=" ";
		//split the string and put  into a array		
		String[] arr1=text.split(" ");
		//linked hashset creation
		LinkedHashSet<String> set = new LinkedHashSet<String>( Arrays.asList(arr1) );
		//iterate over the collection
		for (String str1 : set) {
			
			result=result+str1+" ";
			
		}
		//printing the output
		System.out.println(result);
	}

}
