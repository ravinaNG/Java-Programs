import java.util.Scanner;
public class IfStatement7
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("First input :-");
			int firstnum=sc.nextInt();
			System.out.println("Second input :-");
			int secondnum=sc.nextInt();
			if (firstnum>secondnum)
			{
				System.out.println(firstnum);
			}
			else if (secondnum>firstnum)
			{
			System.out.println(secondnum);
			}


		}
												
	}

}


