package javaProgram;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		int[] a= {4,8,5,3,6,4};
		int[] b= {2,3,4,1,4};
		int length=a.length;
		if(a.length<b.length) {
			length=b.length;
		}
		
		for(int i=0;i<length;i++)
		{
			try {
				System.out.print(a[i]+b[i]);
			}
			catch(Exception e){
				if(a.length<b.length)
				{
				 System.out.print(b[i]);	
				}
				else{
					 System.out.print(a[i]);	
					}
			}
		}

	}

}
