//Write a program to input 5 numbers from keyboard and find their sum and average?

import java.util.Scanner;
public class SumAndAverage
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Type any number:-");
		for(int a=0; a<5; a++)
		{
			int number=sc.nextInt();
			sum=sum+number;	
		}
		System.out.println(sum);
		System.out.println("This is Average:- "+sum/5);
		
	}


}
