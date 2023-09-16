package mccp;

import java.util.Scanner;

public class Reverse {

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
	      for(int i=0;i<n/2;i++) {
	    	  int t=a[i];
	    	  a[i]=a[n-i-1];
	    	  a[n-i-1]=t;
	      }
	      System.out.println("Array elements are : ");
	      for(int i=0;i<n;i++){
	          System.out.print(a[i]+" ");
	      }
	}

}
