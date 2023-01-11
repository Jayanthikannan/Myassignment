package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="PayPal India";
		
		char name1[]=name.toCharArray();
		
		Set<Character> nameset=new LinkedHashSet<Character>();
		Set<Character> duplicateset=new LinkedHashSet<Character>();
		for (int i = 0; i < name1.length; i++) {
			
			boolean add = nameset.add(name1[i]);
			
			if(!add)
				
			{
	
				duplicateset.add(name1[i]);
			}
			
		}
		System.out.println(duplicateset);
		System.out.println(nameset);

	}

}
