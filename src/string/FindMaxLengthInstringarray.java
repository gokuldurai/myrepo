package string;

public class FindMaxLengthInstringarray {

	public static void main(String[] args) {
		String[] s= {"asdf","awe","as","asgrt","gsr"};//asgrt
		String maxlength=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>maxlength.length())
			{
				maxlength=s[i];
			}
		}
        for(int i=0;i<s.length;i++)
        {
        	if(s[i].length()==maxlength.length())
        	{
        	System.out.println(s[i]);
        }
	}

}

}
