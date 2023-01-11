package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	
	public static void main(String[] args) {
		
		String Myname="Jayanthi";
		
		char ch[]=Myname.toCharArray();
		
		Set<Character> setMyname = new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			
			setMyname.add(ch[i]);
			
		}
				
		System.out.println(setMyname);
		String modifiedname = "";
		
		for (Character eac : setMyname) {
			
			modifiedname=modifiedname+eac;
		}
		
		System.out.println(modifiedname);
	}
	
	
	

			

}

