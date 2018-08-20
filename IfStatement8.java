import java.util.Scanner;
public class IfStatement8
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Guese my number");
		int number=sc.nextInt();
		if (number%5==0)
			if (number%15==0)
			{
				System.out.println("it's divisible.");
		}
		else
		{
			System.out.println("it's not divisible.");
		}

	}

}
