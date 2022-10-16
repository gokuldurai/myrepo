package string;

public class FindMaxlengthInNumberArray {

	public static void main(String[] args) {
		String[] s= {"12365","1","568","7895","3654"};//12365
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
