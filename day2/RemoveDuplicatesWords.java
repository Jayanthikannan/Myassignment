package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] splittext = text.split(" ");
		
		Set<String> setdata = new LinkedHashSet<String>();
		
			for (int i = 0; i < splittext.length; i++) {
		
		setdata.add(splittext[i]);
		
	}
	
		System.out.println(setdata);
		
		String Convertedtext = "";
		
		for (String string : setdata) {
			
			
			
			Convertedtext=Convertedtext+string +" ";
			
		}
		
		System.out.println(Convertedtext);
		
		
		

	}

}
