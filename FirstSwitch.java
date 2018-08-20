import java.util.Scanner;
public class FirstSwitch
{
	public static void main(String abc[])
	{
		Scanner scan=new Scanner(System.in);
		String month=scan.next();
		switch(month)
		{
			case ("january") :
				System.out.println("January ka mahina hai");
				break;
			case ("february"):
				System.out.println("February ka mahina hai");
				break;
			default:
				System.out.println("Tu kya kr rha hai");
		}
	}
}
			
