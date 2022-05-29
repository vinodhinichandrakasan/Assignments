package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring an array
		int[] data = {3,2,11,4,6,7};
		List<Integer> list1=new ArrayList<Integer>();
		//iterating over the array and add the element to the list 1 	
			for (int i = 0; i < data.length; i++) {
				
				list1.add(new Integer(data[i]));
				
				System.out.println(list1);
								
			}
			//sorting the list
			Collections.sort(list1);
			//printing the sorted list
			System.out.println("second largest number:"+list1);
			//printing the second largest number
			System.out.println(list1.get(list1.size()-2));
	}

}
