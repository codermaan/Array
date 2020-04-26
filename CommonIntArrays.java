package array;

import java.util.Scanner;

public class CommonIntArrays {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		//input no of elements of 1st array 
		int n = s.nextInt();
		int a[] = new int[n];
		
		//input elements of 1st array 
		for(int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}
		
		//input length of 2nd array
		int m= s.nextInt();
		int b[] = new int[m];
		
		//input elements of 2nd array
		for(int i=0; i<m; i++)
		{
			b[i] = s.nextInt();
		}
		
		//compare the arrays to find common elements
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
		s.close();
	}

}
