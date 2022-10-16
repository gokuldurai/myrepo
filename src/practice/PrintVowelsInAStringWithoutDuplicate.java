package practice;

import java.util.LinkedHashSet;

public class PrintVowelsInAStringWithoutDuplicate {

	public static void main(String[] args) {
		String st="india";
		char[] ch=st.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		int count=0;
		for(Character s:set)
		{
			if(s=='a' || s=='e'|| s=='i' || s=='o' || s=='u')
			{
				count++;
				System.out.print(s+" ");
			}
		}
      System.out.println(count);
	}

}
