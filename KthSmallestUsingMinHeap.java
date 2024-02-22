
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestUsingMinHeap {
	private static int kth(int[] a, int n, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i=0;i<n;i++)
			pq.add(a[i]);
		for(int i=1;i<k;i++)
			pq.poll();
		return pq.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
	      int n=sc.nextInt();
	      System.out.println("Enter k value");
	      int k=sc.nextInt();
	      int[] a=new int[n];
	      System.out.println("Enter array elements");
	      for(int i=0;i<n;i++){
	          a[i]=sc.nextInt();
	      }
	      int p=kth(a,n,k);
	      System.out.print("Kth smallest : "+p);
	}

}
