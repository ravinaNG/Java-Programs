import java.util.Scanner;
public class WhatYouCan
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("write your age for what you have to do? :-");
		int number=sc.nextInt();
		if (number>=25)
		{
			System.out.println("legally drink kar sakte ho.");
			System.out.println("shaadi kar sakte ho.");
			System.out.println("car drive kar sakte ho.");
			System.out.println("vote de sakte ho.");
			System.out.println("school ja sakte ho.");
		}
		else if(number>=24)
		{
			System.out.println("shaadi kar sakte ho.");
			System.out.println("car drive kar sakte ho.");
			System.out.println("vote de sakte ho.");
			System.out.println("school ja sakte ho.");
		}
		else if(number>=21)
		{
			System.out.println("car drive kar sakte ho.");
			System.out.println("vote de sakte ho.");
			System.out.println("school ja sakte ho.");
		}
		else if(number>=18)
		{
			System.out.println("vote de sakte ho.");
			System.out.println("school ja sakte ho.");
		}
		else if(number>5)
		{
			System.out.println("school ja sakte ho.");
		}

	}

}

