// java program to print pattern

import java.util.*;

public class pattern{
	public static void main(String args[]){
		
		 int temp;
		 int temp1;
		 int temp2;
		 int sum;
		 for(int row=1; row< 10; row++)
		 {
			 for(int col=1; col<=9; col++)
			 {	
				 temp = (((col)*10)+ row) ;
				 temp2 = temp%10;    //stores units place
				 temp1 = temp/10;
				 sum = temp1 + temp2;
				 // System.out.printf("%4d", temp )
				 if (temp%11==0 || sum== 10 || temp1 == 5 || temp2==1 || temp2==9 ||(temp1==6 && temp!=65) || 
				 (temp1==4 && temp!=45) || ((temp2==2 || temp2==8)&&(temp1==7 || temp1==3)))
				 {
					System.out.printf("   *"); 
				 }
				 /*if(sum == 10)
				 {
					System.out.printf("    *"); 
				 }*/
				 
				 else
				 {
					 System.out.printf("    ");
				 }
				 if(temp /10==9)
				 {
					 System.out.print("\n");
				 }
			 }
		 }
		 
		 
	}// end main
}// end class