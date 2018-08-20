import java.util.Scanner;
public class IfStatement6
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("Take first number :- ");
			int varx=sc.nextInt();
			System.out.println("Take Second number :-");
			int vary=sc.nextInt();
			if (varx%vary==0)
			{
			System.out.println("It is divisible.");
			}
			else
			{
			System.out.println("It is not divisible.");
			}
	
		}

	}

}
