package array;

import java.util.Scanner;

public class SortStringArray {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String a[] = new String[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = s.next();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		s.close();
	}
}
