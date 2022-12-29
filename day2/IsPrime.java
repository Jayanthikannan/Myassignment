package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime Isprime=new IsPrime();
		Isprime.checkPrime(7);
		Isprime.checkPrime(4);
		Isprime.checkPrime(25);
	}
	public void checkPrime(int a) {
		// TODO Auto-generated method stub
		int flag = 0;
		for(int i=2; i<a; i++)
		{
			
                        
          if(a%i==0)
          {
        	  flag=1;
          break;
          }
        	            
        
	}
		 if(flag==0)
		 {
System.out.println("The give num "+ a +" is prime number");
}
		 else
		 {
			 System.out.println(a+" is not prime number"); 
		 }
}
}