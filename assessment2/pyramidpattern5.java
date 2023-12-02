package assessment2;

import java.util.Scanner;
public class pyramidpattern5 {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	       System.out.print("Enter the number of rows: ");
	       int row=sc.nextInt();
		   int n=1;
	       int space=row-1;
	        for(int i=1;i<=row;i++)
	        {
	            int k=0;
	            for(int j=1;j<=space;j++)
	            {
	              System.out.print(" "); 
	            }
	            for(int j=1;j<=n;j++)
	            {
	                if(j<=i)
	                {
	                    k=k+1;
	                }
	                else
	                {
	                    k=k-1;
	                }
	                System.out.print(k);
	            }
	                 System.out.println();
	                 n=n+2;
	                 space=space-1;
	        }

	}

}
