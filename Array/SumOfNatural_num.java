//Write a program to to display n terms of natural numbers and their sum??

import java.util.Scanner;
public class SumOfNatural_Num
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int Sum=0;
		System.out.println("Type one Natural number");
		for(int a=1; a<=100; a++)
		{
			int natural_num=sc.nextInt();
			int Sum=Sum+natural_num;
		}
		System.out.println("This is the sum of natural_number"+Sum);

	}
}
