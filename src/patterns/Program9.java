package patterns;

public class Program9 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1,k=0;i<=n;i++,k+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}
}
