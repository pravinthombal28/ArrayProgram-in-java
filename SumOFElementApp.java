/*
Sum of Elements in Array
Description: Calculate the sum of all elements in an array.


Input: [1, 2, 3, 4, 5]


Output: 15
*/
import java.util.*;
public class SumOFElementApp
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[]= new int[5];
	int sum=0;	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("Sum of Elements is :"+sum);
	}
}