package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		
		List<Integer> list1=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			
			list1.add(new Integer(arr[i]));
			//System.out.println(list1);
			}
		 for (int j = 0; j < list1.size(); j++) {
			   for (int k =j+1; k < list1.size(); k++) {
				   //System.out.println("list plus 1 "+list1.get(j+1));
				   //System.out.println("list 1 get i "+list1.get(k));
				   if(list1.get(j+1)!=(list1.get(k+1)))
				   {
					   System.out.println(list1.get(k)+1);
					   break;
				   }
			   
	       }
		 }
	}
}
		 
