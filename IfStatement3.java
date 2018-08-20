import java.util.Scanner;
public class IfStatement3
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("type any number as you want!");
			int number = 44*30;
			int num = sc.nextInt();
			if (num>=number)
			{
				System.out.println("it is Graterthen or equalto number");
			}
			else
			{
				System.out.println("it is smallerthen number");
			}

		}

	}

}
