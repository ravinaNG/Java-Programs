import java.util.Scanner;
public class SecondSwitch
{
	public static void main(String[] hii)
	{
		System.out.println("type any number:-\n");
		Scanner scan=new Scanner(System.in);
		int month=scan.nextInt();
		switch (month)
		{
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			default:
				System.out.println("March");

		}


	}

}
		
