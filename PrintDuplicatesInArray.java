package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;



public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		List<Integer> list1=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			
			list1.add(new Integer(arr[i]));
			
		}
	   for (int j = 0; j < list1.size(); j++) {
		   for (int k =j+1; k < list1.size(); k++) {
			
			   if(list1.get(k).equals(list1.get(j)))
			   {
				   System.out.println(list1.get(j));
			   }
		   
		   }
	    }
		
	}

}