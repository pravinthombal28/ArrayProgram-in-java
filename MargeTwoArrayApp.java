/* 
Merge Two Arrays
Description: Merge two arrays into one.

Input: [1, 2, 3], [4, 5, 6]

Output: [1, 2, 3, 4, 5, 6]
*/

import java.util.*;
public class MargeTwoArrayApp
{
	public static void MargeTwoArray(int a[],int b[])
	{
		int k=0;
		int margeArray[]=new int [a.length+b.length];
			
		for(int i=0;i<a.length;i++)
		{
			margeArray[k++]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			margeArray[k++]=b[j];
		}
		
		for(int i=0;i<margeArray.length;i++)
		{
			System.out.print(margeArray[i]+" ");
		}
	}
	public static void main(String x[])
	{
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter the first Array");
		int first[]=new int[5];
		
		for(int i=0;i<first.length;i++)
		{
			first[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Second Array");
		int Second[]=new int[5];
		
		for(int j=0;j<Second.length;j++)
		{
			Second[j]=sc.nextInt();
		}
		
		MargeTwoArray(first,Second);
	}
}

