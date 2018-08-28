//Q No. 2 :- Sort the given string array .
// First of all we have to import class "Arrays" for sort.
import java.util.Arrays;
public class StringSort
{
	public static void main(String args[])
	{
		String []name={"Ram","Shyam","Golu","Ravina","Rupa","Monu","Sanjay","Mamta","priya"};
//And we have to call sort mathod from Array.
		Arrays.sort(name);
		for (int i=0  ; i<name.length; i++)
		{
			System.out.print(name[i]+", ");
		}
		System.out.println("");
	}
}
