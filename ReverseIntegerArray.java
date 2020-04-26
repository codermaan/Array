//Reverse an array of Integer elements

package array;

import java.util.Scanner;

public class ReverseIntegerArray {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		/*
		 * input the no of elements of array 
		 * and create an array of given length
		 */
		int n = s.nextInt();
		int a[] = new int[n];
		
		//input the elements of array
		for(int i=0; i<n ; i++)
		{
			a[i] = s.nextInt();
		}
		
		/*
		 * create a variable temp 
		 * swap the 1st element with last element
		 * 2nd element with last 2nd element 
		 * and so on till the middle is reached or i<j
		 */		
		int temp;
		for(int i=0, j=n-1; i<j ; i++, j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
		// print the reversed array
		for(int i=0; i<n ; i++)
		{
			System.out.println(a[i]);
		}
		
		s.close();
	}

}
