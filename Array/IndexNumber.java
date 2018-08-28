//Q No. 5 :- Find the index number of the element entered by user. Here is the array.
// for take Input we have to take Scanner class.
//Q No. 5 :- Find the index number of the element entered by user. Here is the array.
import java.util.Scanner;
public class IndexNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int my_array[]={43,54,76,55,35,86,85,34,53};
		System.out.print("Take one element:-");
		int element = sc.nextInt();
		for(int i=0; i<my_array.length; i++)
		{
			if (element==my_array[i])
    			{
				System.out.println(i);
			}
			else
			{
				System.out.println("Sorry your element is wrong! but you can take another element.");
			}

		}


	}

 
}
