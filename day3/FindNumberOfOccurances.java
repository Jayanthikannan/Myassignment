package week3.day3;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

public class FindNumberOfOccurances {

	public static void main(String[] args) {

		int[] nums = {2,3,5,6,3,2,1,4,2,1,6,-1};

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			int key = nums[i];

			if (map.containsKey(key)) {
				Integer value = map.get(key);

				map.put(key, value + 1);
			}

			else {
				map.put(key, 1);
			}

		}

		System.out.println(map);
		
		for (Entry<Integer, Integer> eachentryset :map.entrySet() ) {
			
			if(eachentryset.getValue()==1)
			{
				
			Integer key = eachentryset.getKey();
			System.out.println(key);
			
		}

	}
		
		Integer maxcount=0;
		Integer	maxnumber=0;
		
		for (Entry<Integer, Integer> eachentryset : map.entrySet()) {
			
			if(eachentryset.getValue()>maxcount)
			{
				maxcount=eachentryset.getValue();
				
				maxnumber=eachentryset.getKey();
			}
			
			
		}
		System.out.println("Maxmimun count is " + maxcount + " with the key "+ maxnumber);
	}
}
	


