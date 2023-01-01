package week1.day3;

import org.apache.poi.util.SystemOutLogger;

public class SumOfNumericalValueInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String text = "Tes12Le79af65";
		int sum = 0;
		for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            
            if (Character.isDigit(ch)) {
                
                int value = Character.getNumericValue(ch);
             
                sum += value;
              
            }
		}
		  System.out.println("The Sum of numerical value in the string is" + sum);
	}
}
			
		
		
	


