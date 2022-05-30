package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		//sorting an array
		Arrays.sort(arr);
		//List creation		
		List<Integer> list1=new ArrayList<Integer>();
		//iterate over the array and adding the element to the list
		for (int i = 0; i < arr.length; i++) {
			
			list1.add(new Integer(arr[i]));
			//System.out.println(list1);
			}
		//printing size of array
		System.out.println(list1.size());
		for (int j = 1; j < list1.size()+2; j++) {
			 
				//conditional statement to check the missing element of array 				   
				   if(!list1.contains(j))
				   {
					   //printing the missing element
					   System.out.println("missing element in an Array is "+j);
					   break;
				   }
				 
	       }
		 
	}
}

		 

		 
