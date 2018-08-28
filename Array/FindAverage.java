//Q No. 4 :- Also find the average of all the elements of the array.
public class FindAverage
{
	public static void main(String arg[])
	{
		int sum=0;
		int my_array[] = {1,12,30,14,5,6,7,8,9,10};
		for (int a=0; a<my_array.length; a++)
		{
			sum = sum+my_array[a];
			System.out.println(sum);
		}
		System.out.println("This is Average:- "+sum/5);
	}
}
