
package javaProgram;

public class FirstMaximumWithoutSorting {

	public static void main(String[] args) {
		int[] arr= {9,68,35,68,21,6,7};
		int fmax=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fmax) {
				fmax=arr[i];
			}
		}
      System.out.println("First max value--"+fmax+" ");
	}

}
