package week1.day3;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			if((i+1)!=arr[i])
				
			{
				int missNum=i+1;
				System.out.println("The missing number is "+ missNum);
				break;
			}
			
		}

	}

}
