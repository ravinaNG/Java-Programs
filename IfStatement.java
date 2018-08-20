import java.util.Scanner;
public class IfStatement
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("write any number");
			int num = sc.nextInt();
			if (num<=10)
			{
				System.out.println("num is smallenthen 10.");
			}
			else if (num>10 || num<=20)
			{
				System.out.println("num is smallerthen 20");
			}
			else if (num>20)
			{
				System.out.println("num is greaterthen 20");
			}

		}

	}

}
