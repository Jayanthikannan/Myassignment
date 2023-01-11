package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String Companyname[]= {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> Companylist=new ArrayList<String>(Arrays.asList(Companyname));
		
		Collections.sort(Companylist);
		
		System.out.println(Companylist);
		
		List<String> sortedcompany=new ArrayList<String>();
		
		for (int i = Companylist.size()-1; i >= 0; i--) {
			
			String string = Companylist.get(i);
			
			System.out.println(string);
			sortedcompany.add(string);
			//// Required Output: Wipro, HCL , CTS, Aspire Systems
			
			
		}
		
		System.out.println(sortedcompany);
		
		

	}

}
