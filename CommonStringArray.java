package array;

import java.util.Scanner;

public class CommonStringArray {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String a[] = new String[n];
		for(int i=0; i<n; i++)
		{
			a[i] = s.next();
		}
		
		int m = s.nextInt();
		String b[] = new String[m];
		for(int i=0; i<m; i++)
		{
			b[i] = s.next();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(a[i].equals(b[j]))
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
		s.close();
	}
}
