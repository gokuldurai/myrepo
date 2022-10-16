package string;

public class ReverseTheGivenSentence {

	public static void main(String[] args) {
		
		//1 method
		String s1="I love Covai";//Covai love I
		String[] s=s1.split(" ");
		for(int k=s.length-1;k>=0;k--)
		{
			System.out.print(s[k]+" ");//remove space
		}
		
		
		System.out.println();
		//2 method
		String st="I love Covai";//I evol iavoC
		String[] str=st.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			String a=str[i];
			for(int j=a.length()-1;j>=0;j--)
			{
				System.out.print(a.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
