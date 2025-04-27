/*
Count Even Numbers in Array
Description: Count how many even numbers are in an array.


Input: [1, 2, 3, 4, 5, 6]


Output: 3
*/
import java.util.*;
public class CountEvenNumberApp
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[]= new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
				count++;
			}
		}
		System.out.println("Count of Sum Numbers :"+count);
	}
}