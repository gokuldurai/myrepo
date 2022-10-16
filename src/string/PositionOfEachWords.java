package string;

import java.util.LinkedHashSet;

public class PositionOfEachWords {

	public static void main(String[] args) {
		String str="I love Covai I Covai";
		String[] s=str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}	
		
		for(String stri:set) {
			for(int i=0;i<s.length;i++)
			{
				if(stri.equals(s[i]))
				{
					System.out.println(stri+" is present in "+(i+1)+" position");
					break;
				}
			}
		}
		
	}

}
