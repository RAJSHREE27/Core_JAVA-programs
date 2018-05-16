//8> program to reverse a 5-digit number

import java.util.Scanner;

public class ReverseNumber{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int number;
		String value;
		int n = 5;
		String reverseNumber="";
		
		System.out.print("Enter the 5-digit number : ");
		number = scan.nextInt();
		value= Integer.toString(number);				//*****important*******//
	
		while(n!= 0){
			reverseNumber = reverseNumber+ value.charAt(n-1);
			n--;
			
		}
		System.out.println(" the reversed number is : "+ reverseNumber);
		
	}//end main
}//end class