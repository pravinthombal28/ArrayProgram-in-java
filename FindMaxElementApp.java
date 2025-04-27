/*
Find Maximum Element in Array
Description: Find the largest element in an array.


Input: [12, 34, 56, 78, 23]


Output: 78
*/

import java.util.*;
public class FindMaxElementApp
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array");
		int n[]=new int[5];
		int max=0;
		
		for(int j=0;j<n.length;j++)
		{
				n[j]=sc.nextInt();
		}
		
		
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>max)
			{
				max=n[i];
			}
		}
		System.out.println("max number in array :"+max);
	}
}