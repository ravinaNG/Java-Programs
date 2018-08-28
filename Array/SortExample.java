import java.util.Arrays;
public class SortExample
{
	public static void main(String[] args)
	{
		int[] arr = {13,7,6,45,21,9,101,102};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ,");
		}
	}
}
