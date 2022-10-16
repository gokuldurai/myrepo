package string;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateWords {


	public static void main(String[] args) {
		String s1="I love covai Covai";
		String str = s1.toLowerCase();
		String[] s=str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		
		for(String stri:set) {
			System.out.print(stri+" ");
		}
		
		
	}

}
