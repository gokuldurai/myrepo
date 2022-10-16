package string;

public class PositionOfEachChar {

	public static void main(String[] args) {
		String s="tester";
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i)+" Position is "+(i+1));
		}
         
		//reverse method
		System.out.println();
		for(int i=s.length()-1;i>0;i--)
		{
			System.out.println(s.charAt(i)+" Position is "+(i+1));//from reverse
		}

	}

}
