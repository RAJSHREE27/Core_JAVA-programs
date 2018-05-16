//to add the digits of number

import java.util.*;
public class addDigit{
	public static void main(String args[]){
		
		Scanner scan= new Scanner(System.in);
		
		int number;
		int sumOfDigits=0;
		System.out.print("Enter a 5-digit number : ");
		number= scan.nextInt();
		
		while(number>0){
			
			int temprory = number%10;
			sumOfDigits += temprory;
			number /=10;
			
		}
		System.out.println("the sum of digits of a 5-digit number is : "+sumOfDigits);
		
		
	}//end main
}//end class