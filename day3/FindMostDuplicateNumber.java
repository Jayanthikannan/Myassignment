package week3.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abbaba";
		char[] strarray = str.toCharArray();
		Map<Character, Integer> strmap = new HashMap<Character, Integer>();
		for (int i = 0; i < strarray.length; i++) {

			char key = strarray[i];

			if (strmap.containsKey(key)) {

				Integer value = strmap.get(key);

				strmap.put(key, value + 1);

			} else

			{
				strmap.put(key, 1);
			}
		}
		System.out.println(strmap);
		
		int mostduplicate=0;
		char maxoccurance=0;
		
		for (Entry<Character, Integer> c : strmap.entrySet()) {
			
			if(c.getValue()>=mostduplicate)
			
				maxoccurance=c.getKey();
			
			mostduplicate=c.getValue();
			
		}
		
		System.out.println("most duplicate occurance " + maxoccurance);

	}

}
