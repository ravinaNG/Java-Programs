import java.util.Scanner;
public class Age
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=5)
		{
			System.out.println("Aap school ja sakte ho");
			if(age>=15)
			{
				System.out.println("Aaap shadi kr sakte ho");
				if(age>=18)
				{
					System.out.println("Aaap Drive kr sakte ho");
				}
			}
		}
		else
		{
			System.out.println("Beta sahi number to daalo");
		}
	}
}
