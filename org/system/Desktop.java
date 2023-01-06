package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("I am from Desktop class-desktopSize");
	}
	public static void main(String[] args) {
		
		Desktop dp=new Desktop();
		dp.computerModel();
		dp.desktopSize();
	}


}
