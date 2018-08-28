import java.util.Scanner;
public class SumOfNatural_Num
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int Sum=0;
		System.out.println("Type one Natural number");
		int natural_num=sc.nextInt();
		for(int a=1; a<=natural_num; a++)
		{
			Sum=Sum+a;
		}
		System.out.println("This is the sum of natural_number:- "+Sum);

	}


}
