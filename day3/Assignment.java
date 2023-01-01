package week1.day3;



public class Assignment {
	
	public static void main(String[] args) {
		Assignment FIS=new Assignment();
		//Assignment 2
		FIS.FindIntersection1();
		System.out.println("======================");
		//Assignment 3
		FIS.plaindrome("Madam");
		FIS.plaindrome("Jayanthi");
	}
	
	
	private void plaindrome(String name) {
		
		
		String rev="";
		char charName[] =name.toCharArray();
		for (int i =charName.length-1 ; i >=0 ; i--) {
			
			rev=rev+charName[i];
		}
		if(name.equalsIgnoreCase(rev))
		System.out.println(name+" is plaindrome");
		// TODO Auto-generated method stub
		else
			System.out.println(name + " is not plaindrome");
	}
	public void FindIntersection1() {
		
	
		int arr1[]= {3,2,11,4,6,7};
		int arr2[]={1,2,8,4,9,7};
		System.out.println("Intersection of the two arrays ::");
		for(int i=0;i<arr1.length;i++)
		{
			for(int i1=0;i1<arr2.length;i1++)	
			{
				if(arr1[i]==arr2[i1])
					
				{
					
					System.out.println(arr1[i]);
					
				}
				
				
				
			}
			
		}
		}
		
		// TODO Auto-generated constructor stub
	}





