package javaProgram;

public class ThirdMinimumNumber {

	public static void main(String[] args) {
		int[] a= {4,8,6,9,4,2,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
		}
	}
System.out.println("3 min number is  "+a[a.length-2]);
}
}
