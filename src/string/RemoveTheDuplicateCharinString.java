package string;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharinString {

	public static void main(String[] args) {

     String s="tester";
     LinkedHashSet<Character> set=new  LinkedHashSet<Character>();
     for(int i=0;i<s.length();i++) {
    	set.add(s.charAt(i)); 
     }
     
     for(Character ch:set) {
    	 System.out.print(ch);
     }

	}

}
