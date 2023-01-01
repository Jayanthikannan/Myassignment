package week1.day3;

public class FindOccurance {

	public static void main(String[] args) {
		
		String name="Jayanthi kannan";
				char[] nameArray = name.toCharArray();
				int count=0;
		for (int i = 0; i < nameArray.length; i++) {
			
			if( nameArray[i]=='a')
			{
				count++;
				
			}
			
			
		}
		System.out.println("The occurance of a is " + count);
		// TODO Auto-generated method stub

	}

}
