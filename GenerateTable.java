// java program to make a table from 1 to 90 numbers using single and double loop

import java.util.*;

public class GenerateTable {
	public static void main(String args[]){
	
	// USING SINGLE LOOP
	int value=1;
	 int tensDig;
	 System.out.println("------------------using two loops----------------");
	 
	   int temp;
	 for(int row=1; row<= 10; row++)
	 {
		 for(int col=1; col<= 10; col++)
		 {	
			 temp = (((col-1)*10)+ row) ;
			 System.out.printf("%4d", temp );
			 if(col %10==0)
			 {
				 System.out.print("\n");
			 }
		 }
	 }
	 
	  System.out.println("------------------using one loop----------------"); 
	 for(int count=1; count<=90 ; count++)
	 {	
		
		 System.out.printf("%4s" , value);
		 value +=10;
		 tensDig = value/10;
		 if(tensDig == 9)
		 {
			 System.out.printf("%4s", value);
			 if (value==90)
			 {
				 System.out.printf("%4s", value+10);
				 System.exit(0);
			 }
			 int rem = value%10;
			 value = rem+1;
			 System.out.print("\n");
		 }
		 
	 } 
	
	
	}// enc main

}// end class