// Write a program to input 5 numbers from keyboard and find their sum and average?

import java.util.Scanner;
public class SumAndAverageByInput
{
	public static void main(String []args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Take first input");
		for(int input=0; input<5; input++)
		{
			int Input=sc.nextInt();
			sum=sum+Input;
			System.out.println(sum);	
		}
		System.out.println(sum/5);

	}


}

