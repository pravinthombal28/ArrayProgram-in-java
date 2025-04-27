/*
1. Reverse an Array
Description: Reverse the order of elements in an array.


Input: [1, 2, 3, 4, 5]


Output: [5, 4, 3, 2, 1]
*/

import java.util.*;
public class ReversArrayApp
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the array");
		int a[]=new int[5];
		int end = a.length-1;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length/2;i++)
		{
				int temp=a[i];
				a[i]=a[end];
				a[end]=temp;
			end--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}