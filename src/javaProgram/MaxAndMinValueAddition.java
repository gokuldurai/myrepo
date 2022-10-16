package javaProgram;

public class MaxAndMinValueAddition {

	public static void main(String[] args) {
		int[] arr= {5,8,2,4,46,35};
	      for(int i=0;i<arr.length;i++) {
	    	  for(int j=i;j<arr.length;j++)
	    		  {
	    		  if(arr[i] >arr[j])
	    			  {
	    			  int temp=arr[i];
	    			  arr[i]=arr[j];
	    			  arr[j]=temp;
	    		   }
	    		 }
	    	  }
	      int sum=0;
	      for(int i=0;i<3;i++) //adding only first 3 minimum values
	      {
	    	  sum=sum+arr[i];
	      }
            System.out.println(sum);
	}

}
