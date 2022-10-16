package practice;

import java.util.LinkedHashSet;

public class PositionOfEachNumberWithoutDuplicate {

	public static void main(String[] args) {
		int[] a= {4,3,2,3,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		for(int in:set) {
		
			for(int i=0;i<a.length;i++)
			{
				if(in==a[i])
					{
					System.out.println(in+" position is "+(i+1));
					break;
					}
					
	}
}

	}

}
