package assessment2;

import java.util.Scanner;

public class reversefibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the endpoint Fibonacci series: ");
	        int n=sc.nextInt();
	        int[] fibonacci=new int[n];
	        fibonacci[0]=0;
	        fibonacci[1]=1;
	        for (int i=2;i<n;i++) {	        	
	            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
	        }
	        System.out.println("Fibonacci series in reverse order:");
	        for (int i=n-1;i>=0;i--) {
	        	if(n>=fibonacci[i]) {
	            System.out.println(fibonacci[i]+" ");
	        	}
	        }
	}

}
