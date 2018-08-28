//Q No. 1 :- Sort the given numeric array .
// First of all we have to import class "Arrays" for sort.
import java.util.Arrays;
public class Sort
{
	public static void main(String args[])
	{
		int[] num = {33,64,24,66,35,67,46,76};
//And we have to call sort mathod from Array.
		Arrays.sort(num);
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i]+", ");
		}
		System.out.println("");

	}
	
}
