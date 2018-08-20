import java.util.Scanner;
public class IfStatement2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("write number:-");
			int varx = 300-123;
			int num=sc.nextInt();
			if (num==varx)
			{
				System.out.println("num is equalto varx");
			}
			else if (num != varx)
			{
				System.out.println("num is notequalto varx");
			}

		}

	}

}  
