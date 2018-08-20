import java.util.Scanner;
public class IfStatement4
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("put water as you want any litter"); 
			int water =sc.nextInt();
			if(water<1)
			{
				System.out.println("we should put more water.");
			}
			else if (water<10)
			{
				System.out.println("it's enough,don't should be put any more water.");
			}
			else if (water>10)
			{
				System.out.println("overflow....");
			}

		}

	}

}
			
