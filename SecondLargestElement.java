package Array;

import java.util.Scanner;

public class SecondLargestElement {
	public static void main (String[] args)
	 {
	     Scanner s= new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n = s.nextInt();
	         int a[] = new int[n];
	         for(int i=0; i<n; i++)
	         {
	             a[i]= s.nextInt();
	         }
	         int max1=a[0];
	         int max2=-1;
	         for(int i=0; i<n; i++)
	         {
	             if(n==0)
	             {
	                 System.out.println("-1 ");
	                 break;
	             }
	             if(a[i]>max1)
	             {
	                 max2= max1;
	                 max1= a[i];
	             }
	             else if(a[i]>max2 && a[i]!=max1)
	             {
	            	 max2=a[i];
	             }
	         }
	         System.out.println(max2);
	     }
	     s.close();
	 }
}
