/*
Find Minimum Element in Array
Description: Find the smallest element in an array.


Input: [10, 20, 30, 5, 15]


Output: 5
*/

import java.util.*;
public class FindMinElmtArrayApp
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array");
		int p[]= new int[5];
		
		for(int s=0;s<p.length;s++)
		{
			p[s]=sc.nextInt();
		}
		int minElement=p[0];
		for(int s=0;s<p.length;s++)
		{
			if(p[s]<minElement)
			{
				minElement=p[s];
			}
		}
		System.out.println("Minimum element in Array :"+minElement);
	}
}



