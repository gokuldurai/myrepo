package javaProgram;

public class Swapping  {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		int temp;
		System.out.println("Before swap-- a value is="+a+" Before swap-- b value is="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap-- a value is="+a+" After swap-- b value is="+b);
		
		
		//another way for swap
		
		/**System.out.println("Before swap-- a value is="+a+" Before swap-- b value is="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap-- a value is="+a+" After swap-- b value is="+b);
		**/
	

	}

}
