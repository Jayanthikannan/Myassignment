package week1.day1;
// Assignment 2
public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stubactionb0
		
		Mobile action = new Mobile();
		System.out.println("This is my Mobile");
		action.makeCall();
		action.sendMsg();

	}
	
	public void makeCall() {
		String mobileModel="Samsung";
		float mobileWeight=0.538f;
		
		// TODO Auto-generated method stub
		System.out.println("Make call to the client");
		System.out.println("My mobile Model is "+ mobileModel);
		
		System.out.println("My mobile weight is "+ mobileWeight);
	}
	
	public void sendMsg() {
		
		boolean isfullycharged=false;
		int mobileCost=17000;
		
		// TODO Auto-generated method stub
System.out.println("send sms to the client");
System.out.println("mobile charge status "+ isfullycharged);

System.out.println("My mobile cost is "+ mobileCost);

	}

}
