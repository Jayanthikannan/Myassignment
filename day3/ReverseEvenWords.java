package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String result="";
		
			String text = "I am a software tester";
			
			String[] splittext = text.split(" ");
			
			for (int i = 1; i < splittext.length; i=i+2) {
				
				String rev="";
				char charName[] =splittext[i].toCharArray();
				for (int j =charName.length-1 ; j >=0 ; j--) {
					
					rev=rev+charName[j];
					
				}
				splittext[i]=rev;
			}
			for (int j = 0; j < splittext.length; j++) {
				
				
					
				result=result+ " " +splittext[j];
				
				
			}
			
			System.out.println(result);	
				
			}

		

	}


