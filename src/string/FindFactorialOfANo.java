package string;

import java.util.Scanner;

public class FindFactorialOfANo {

	public static void main(String[] args) {

      int n=5;//5*4*3*2*1==>120
      int fact=1;
     
      for( int i=n;i>=1;i--)
      {
           fact=fact*i;
      }
   System.out.println(fact);
	
	
	
	//using Scanner
   int fact1=1;
	for(; ;)
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		for( int j=m;j>=1;j--)
	      {
	           fact1=fact1*j;           
	      }
	   
		  System.out.println(fact1);
	}
 }
}
