package string;

import java.util.LinkedHashSet;

public class PrintDuplicateWordWithCounts {

	public static void main(String[] args) {
		String str="I love Covai I Covai";
		String[] s=str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		
		for(String stri:set)
		{
			int count=0;
			for(int i=0;i<s.length;i++) {
				if(stri.equals(s[i]))
				{
					count++;
				}
			}
			if(count>1) {
		System.out.println(stri+" is repeating "+count+" time");
		}
			
	}
	}

}
