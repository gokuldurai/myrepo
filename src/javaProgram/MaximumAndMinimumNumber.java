package javaProgram;

public class MaximumAndMinimumNumber {

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
	    	 
	    		  System.out.println("First maximum element--"+arr[arr.length-1]);
	    		  System.out.println("First minimum element--"+arr[0]);
	    		  System.out.println("second maximum element--"+arr[arr.length-2]);
	    		  System.out.println("second minimum element--"+arr[1]);
	      }


	}


