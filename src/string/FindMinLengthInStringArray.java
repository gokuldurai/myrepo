package string;

public class FindMinLengthInStringArray {

	public static void main(String[] args) {
		String[] s= {"asdf","awe","as","asgrt","gsr"};//as
		String minlength=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<minlength.length())
			{
				minlength=s[i];
			}
		}
        for(int i=0;i<s.length;i++)
        {
        	if(s[i].length()==minlength.length())
        	{
        	System.out.println(s[i]);
        }
	}
 }
}
