package week3.day2;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {5,2,8,4,3,9,7};
		
		Set<Integer> setdata = new TreeSet<Integer>();
		

		for (int i = 0; i < data.length; i++) {
			setdata.add(data[i]);

		}
		
		//set to list converstion
		List<Integer> listdata = new ArrayList<Integer>(setdata);
		
		System.out.println(listdata);
		
		for (int i = 0; i < data.length-1; i++) {
			
					
			if(listdata.get(i+1) != (listdata.get(i)+1))
			{
				System.out.println("The missing number is " + (listdata.get(i)+1));
			}
				
			
			
		}

	}

}
