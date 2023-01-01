package week1.day3;
//Assignment 1
public class ConvertoddIndxUpperCase {
	
	public static void main(String[] args) {
		String name="Jayanthi Kannan";
		String Convertname1="";
		char namechar[]=name.toCharArray();
		for (int i = 0; i < namechar.length; i++) {
			
			if(i%2 !=0)
			{
				namechar[i]=Character.toUpperCase(namechar[i]);
			}
			
		}
			for (int i = 0; i < namechar.length; i++) {
				
				Convertname1=Convertname1+namechar[i];
			}
			System.out.println(Convertname1);
	
		}
	 
	
	}


