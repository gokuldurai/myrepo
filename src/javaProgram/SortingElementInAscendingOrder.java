package javaProgram;

public class SortingElementInAscendingOrder {

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
    	  for(int i=0;i<arr.length;i++)
    	  {
    		  System.out.print(arr[i]+" ");
    	  }
    	  
      }

	}


