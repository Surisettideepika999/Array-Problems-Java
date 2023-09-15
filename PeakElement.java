package mccp;

import java.util.Scanner;

public class PeakElement {
	public static int peak(int[] a,int n){
        if(n==1)
        return -1;
        if(a[0]>=a[1])
        return 0;
        if(a[n-2]>a[n-1])
        return n-2;
        for(int i=1;i<n-1;i++){
            if((a[i]>=a[i-1]) && (a[i]>=a[i+1]))
            return i;
        }
        return -1;
    }
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
	      int p=peak(a,n);
	      System.out.print("Index : "+p);
	}

}
