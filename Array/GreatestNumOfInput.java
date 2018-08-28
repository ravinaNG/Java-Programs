//Write a program which takes 3 numbers from user and print the greatest number?
import java.util.Scanner;
public class GreatestNumOfInput
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Type number:-");
		int num=sc.nextInt();
		System.out.println("Type second number:-");
		int num2=sc.nextInt();
		System.out.println("Type third number:-");
		int num3=sc.nextInt();
		if(num>num2 & num>num3){
			System.out.println("Greater number:-"+num);
		}else if(num2>num & num2>num3){
			System.out.println("Greater number:-"+num2);
		}else if(num3>num2 & num3>num){
			System.out.println("Greater number:-"+num3);
		}


	}


}
