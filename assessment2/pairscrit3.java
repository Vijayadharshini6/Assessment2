package assessment2;

import java.util.Scanner;

public class pairscrit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the length of the array:");
	       int len=sc.nextInt();
	       System.out.println("Enter the value of array:");
	       int[] num=new int[len];
	       for(int i=0;i<len;i++) {	    	  
	    	  num[i]=sc.nextInt();
	       }
	       System.out.println("Enter K");
	       int k=sc.nextInt();
	       for(int i=0;i<len;i++) {
	    	   for(int j=1;j<len;j++) {
	    		   int add=num[i]+num[j];
	    		   if(add%k==0){
	    			   if(num[i]<num[j]) {
	    				   System.out.println("("+num[i]+","+num[j]+")") ;
	    			   }
	    		   }
	    	   }
	       }
	}

}
