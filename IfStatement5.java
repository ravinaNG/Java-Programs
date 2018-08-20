import java.util.Scanner;
public class IfStatement5
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Write a number :-");
		int number=sc.nextInt();
		if (number%2==0)
		{
			System.out.println("This is a even number means number is divisible by 2.");
		}
		else 
		{
			System.out.println("This is not a even number because number is not divisible by 2.");
		}

	}

}	
