/*
 Count Odd Numbers in Array
Description: Count how many odd numbers are in an array.


Input: [1, 2, 3, 4, 5, 6]


Output: 3
*/
import java.util.*;
public class CountOddNumberApp
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array");
		int arr[]=new int[5];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				count++;
			}
		}
		System.out.println("Count odd Number :"+count);
	}
}


