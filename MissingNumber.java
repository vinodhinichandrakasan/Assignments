package week3.day2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.bouncycastle.util.Integers;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		List<Integer> list = Arrays.asList(numbers);
		Set<Integer> set = new TreeSet<Integer>(list);
		    // Show Set elements
		  System.out.println("The Set elements are :");
		  
		  for(Integer var : set)
			  if(var<var+1)
			  {
		        System.out.println(var);
			  }
		
	}

}
