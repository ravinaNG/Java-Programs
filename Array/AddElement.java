//Q No. 3 :- Add all the elements of the given array using loop.
public class AddElement
{
	public static void main(String args[])
	{
		int sum=0;
		int my_array[]={1,12,30,14,5,6,7,8,9,10};
		for(int a=0; a<my_array.length; a++)
		{
			sum = sum+my_array[a];	
		}
		System.out.println(sum);

	}	
		
}
