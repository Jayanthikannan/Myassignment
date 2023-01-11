package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		Set<Integer> setdata = new TreeSet<Integer>();
		List<Integer> listdata = new ArrayList<Integer>();

		for (int i = 0; i < data.length; i++) {
			setdata.add(data[i]);

		}

		System.out.println(setdata);
		// set to list convertion
		listdata.addAll(setdata);

		System.out.println("My list data :" + listdata);

		Integer secondlargest = listdata.get(listdata.size() - 2);

		System.out.println("My second last element : " + secondlargest);

	}
}