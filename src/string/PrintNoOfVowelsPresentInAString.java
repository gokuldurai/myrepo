package string;

public class PrintNoOfVowelsPresentInAString {

	public static void main(String[] args) {
      String str="india";// 3 vowels are present in india
      int count=0;
      char[] ch=str.toCharArray();
      for(int i=0;i<ch.length;i++) {
    	  if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='0'||ch[i]=='u')
    	  {
    		  count++;
    	  }
      }
      System.out.println(count+" vowels are present in "+str);

	}

}
