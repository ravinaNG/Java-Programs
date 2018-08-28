import java.util.Scanner;
public class WMultiply
{
	public static void main(String For[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("take first number");
		int a=sc.nextInt();
		System.out.println("take second number");
		int b=sc.nextInt();
		for(;a>=1; a--)
		{
			c=c+b;
		}
		System.out.println(c);

	}

}
