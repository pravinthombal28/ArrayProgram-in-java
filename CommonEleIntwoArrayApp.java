/*
Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.

Input: [1, 2, 3, 4], [3, 4, 5, 6]

Output: [3, 4]
*/

import java.util.*;
public class CommonEleIntwoArrayApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Array");
		int first[]=new int[4];
		
		for(int i=0;i<first.length;i++)
		{
			first[i]=sc.nextInt();
		}
		System.out.println("Enter the second Array");
		int sec[]=new int[4];
		
		for(int i=0;i<sec.length;i++)
		{
			sec[i]=sc.nextInt();
		}
		
		for(int i=0;i<first.length;i++)
		{
			for(int j=0;j<sec.length;j++)
			{
				if(first[i]==sec[j])
				{
					System.out.println("common element: "+first[i]);
				}
			}
		}
		
	}
}
