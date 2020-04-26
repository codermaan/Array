package array;

import java.util.Scanner;

public class SortArray {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}
		
		int temp;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[j]<a[i])
				{
					temp = a[i];
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
