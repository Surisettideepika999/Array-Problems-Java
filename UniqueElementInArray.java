package mccp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class UniqueElementInArray {

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
	      int r=0;
	      HashSet<Integer>h=new HashSet<>();
	      for(int i=0;i<n;i++) {
	    	  if(h.contains(a[i])) {
	    		  h.remove(a[i]);
	    	  }
	    	  else
	    		  h.add(a[i]);
	      }
	      Iterator<Integer>i=h.iterator();
	      System.out.print(i.next());
	}

}
