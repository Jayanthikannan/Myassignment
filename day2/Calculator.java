package week1.day2;

public class Calculator {
	
	public void printEventNumbers() {
		for (int i=1; i <=20; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}
	public int addThreeNumbers(int a,int b,int c) {
		
		int sum;
		sum=a+b+c;
		return sum;
		// TODO Auto-generated method stub

	}
	
	public int multiply(int a,int b) {
		
		int multiply;
		
		multiply=a*b;
		return multiply;
		// TODO Auto-generated method stub

	}
	
	public void divide(int a,int b) {
		// TODO Auto-generated method stub
		
		int divide;
		divide=a/b;
		System.out.println(divide);

	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int sum=cal.addThreeNumbers(5, 60, 7);
		System.out.println(sum);
		int multi=cal.multiply(9, 6);
		System.out.println(multi);
		cal.divide(5, 50);
		System.out.println("=========================");
		cal.printEventNumbers();
	}

}
