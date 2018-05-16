//9> to find the sum of first and last digit of a 4-digit number

import java.util.*;

public class sumFirstLast{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int number;
		int num1;
		int num2;
		int sumDigits;
		System.out.print("enter a 4 digit number : ");
		number = scan.nextInt();
		num1 = number%10;
		
		num2 = (int)(number/1000);
		
		sumDigits= num1+num2;
		
		System.out.println("the sum of first and last digit of a 4digit number is : "+ sumDigits);
		
	}
} 