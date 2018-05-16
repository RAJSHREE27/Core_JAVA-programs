//6> perform swapping operation

import java.util.Scanner;

public class swap{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int c;
		int d;
		int temprory;
		System.out.print("\n enter first values = ");
		c=scan.nextInt();
		System.out.print("\n enter second values = ");
		d=scan.nextInt();
		System.out.print("\n the values before swapping are a = "+c+" and b = "+d);
		
		temprory=c;
		c=d;
		d=temprory;
		
		System.out.print("\n the values after swapping  are a = "+c+" and b = "+d);
		
	}//end main
}//end class