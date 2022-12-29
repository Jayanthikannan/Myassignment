//Assignment 1
package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibbinocci fb=new Fibbinocci();
		
		fb.fibbonocci();
		
	}

	private void fibbonocci() {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=1;
		int sum;
		System.out.println(firstnum);
		for(int i=0;i<11;i++)
		{
			sum=firstnum+secondnum;
			System.out.println(sum);
			firstnum=secondnum;
			secondnum=sum;
		}
		

	}
}
