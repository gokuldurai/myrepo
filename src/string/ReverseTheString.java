package string;

public class ReverseTheString {

	public static void main(String[] args) {
		String s="welcome";
		//1
		for(int i=s.length()-1;i>=0;i--)
		{
		System.out.print(s.charAt(i)); 
		}
		
		System.out.println();
		//2
		char[] a=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		//3
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
		
		System.out.println();
		
		//4
		char[] b=s.toCharArray();
		int count=0;
		for(char c:b) {
			count++;
		}
		
		for(int i=count-1;i>=0;i--) {
			System.out.print(b[i]);
		}
		
		System.out.println();
		
		//5
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.print(sb);
				
	}

}
