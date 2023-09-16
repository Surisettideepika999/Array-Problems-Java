package mccp;

import java.util.Scanner;

public class ReverseArrayRecursion {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
	      int n=sc.nextInt();
	      int[] a=new int[n];
	      System.out.println("Enter array elements");
	      for(int i=0;i<n;i++){
	          a[i]=sc.nextInt();
	      }
	      reverse(a,n);
	      for(int i=0;i<n;i++){
	          System.out.print(a[i]+" ");
	      }
	}

	private static void reverse(int[] a,int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return a[0];
		else {
			int 
		}
	}

}
