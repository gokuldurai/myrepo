package string;

import java.util.LinkedHashSet;

public class UniqueCharWithCount {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
					{
					count++;
					}
					
			}
			if(count==1) {
		System.out.println(ch+" is unique char repeating "+ count+" time");	
		}	
		
	}

	}
	}


