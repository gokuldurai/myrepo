package string;

public class StringPalindrome {

	public static void main(String[] args) {

     String s="madam";
     String rev="";
     for(int i=s.length()-1;i>=0;i--)
     {
    	 rev=rev+s.charAt(i);
     }
     if(rev.equals(s))
     {
    	 System.out.println("is palyndrome");
     }else{
    	 System.out.println("is not palyndrome");
     }


	}

}
