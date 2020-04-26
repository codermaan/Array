import java.util.Scanner;

public class InsertElement {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		//input the length of array
		int n= s.nextInt(); 
		
		//array of size n
		int a[] = new int[n];
		
		//input elements of array of length n
		for(int i=0; i<n; i++)
		{
			a[i]= s.nextInt();
		}
		
		//input element to be added and position to be added
		int elem = s.nextInt();
		int pos = s.nextInt();
		
		//create an array of size n+1
		int arr[] = new int[n+1];
		
		//insert the elements in the new array with new element at given position
		for(int i=0; i<n+1; i++)
		{
			if(i<pos-1)
				arr[i] = a[i];
			
			else if(i== pos-1)
				arr[i] = elem;
			
			else
				arr[i] = a[i-1];
		}
		
		//print the elements of array
		for(int i=0; i<n+1; i++)
		{
			System.out.println(arr[i]);
		}
		s.close();
	}

}

