package mccp;

import java.util.Scanner;

public class linearSearch {

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
	      System.out.println("Enter element to be searched");
	      int f=0,i=0;
	      int key=sc.nextInt();
	      for(i=0;i<n;i++) {
	    	  if(a[i]==key) {
	    		  f=1;
	    		  break;
	    	  }
	      }
	      if(f==1)
	    	  System.out.println("Element found at index : "+i);
	      else
	      System.out.println("Element not found");
	}

}
