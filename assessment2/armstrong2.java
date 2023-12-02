package assessment2;

import java.util.Scanner;

public class armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	       System.out.print("Enter the number:");
	       String num=sc.next();
	       int receive=0;
	       for(int i=0;i<num.length();i++) 
	       {
	       char k=num.charAt(i);
	       int number=Integer.parseInt(k+"");
	       int mul=number*number;
	        receive +=mul*number;
	       }
	       int input=Integer.parseInt(num);
	       if(input==receive) {
	    	   System.out.println("The number is Armstrong");
	       }
	       else {
	    	   System.out.println("The number is not Armstrong");
	       }
	}

}
