package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a) Declare An array for {3,2,11,4,6,7};	
		
			int[] arr1={3,2,11,4,6,7};
		// b) Declare another array for {1,2,8,4,9,7};
			
			int[] arr2={1,2,8,4,9,7};
			
		//declaring 2 seperate array	
			
			List<Integer> list1=new ArrayList<Integer>();
			List<Integer> list2=new ArrayList<Integer>();
		//iterating over the array and add the element to the list 1 	
			for (int i = 0; i < arr1.length; i++) {
				
				list1.add(new Integer(arr1[i]));
				System.out.println(list1);
						
			}
       //iterating over the array and add the element to the list 2		
			for (int j = 0; j < arr2.length; j++) 
			{
							
				list2.add(new Integer(arr2[j]));
				System.out.println(list2);
									
			}
		//comparing the 2 list to find intersection	
			for (int i = 0; i < list1.size(); i++) {
				for (int j = 0; j < list2.size(); j++) {
					
					if(list1.get(i).equals(list2.get(j)))
					{
						//printing the intersection
						System.out.println(list1.get(i));
					}
					
				}
				
			}
			
			
	}

}
