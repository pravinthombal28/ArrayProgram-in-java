/*
Find the Frequency of an Element in Array
Description: Find how many times an element appears in an array.


Input: [1, 2, 2, 3, 4, 2, 5], element 2


Output: 3
*/
import java.util.*;
public class  FrequencyOfElemntApp
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array");
		int a[]=new int[7];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Element freqency check :");
		int search=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				count++;
			}
		}
			if(count>0)
			{
				System.out.println("Element count :"+count);
			}
			else{
				System.out.println("Elemnet Not Found :"+count);
			}
	}
}