package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name=new ArrayList<String>();
		
		name.add("Jayanthi");
		name.add("SAI");
		name.add("Kannan");
		name.remove(0);
		name.add("karthik");
		name.add(2, "jai");
		System.out.println(name);

	}

}
