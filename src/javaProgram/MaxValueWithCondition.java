package javaProgram;

public class MaxValueWithCondition {
	public static void main(String[] args) {
		int[] arr= {9,68,35,68,21,6,7};
		int fmax=arr[0];
		int smax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=fmax) // for minimum--> if(arr[i]<=fmin)
			{
				if(arr[i]!=fmax) {
					smax=fmax;
				}
				fmax=arr[i];
			}
			else if(fmax==smax||arr[i]<smax) {
				smax=arr[i];
			}
		}
      System.out.println("First max value--"+fmax);
      System.out.println("Second max value--"+smax);//here two values are same max numbers 68  
      no                                               //but we check with condition
	}

}
