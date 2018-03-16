//this is a java code to convert a decimal value into hexadecimal and octal form

import java.util.*;

public class NumConversion{
	public static void main(String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a decimal number :");
		int decimalVal = scan.nextInt();
		int oct_dec;
		int method2_dec = decimalVal;
		oct_dec = decimalVal;
		System.out.println("-----------------METHOD 1------------------");
		System.out.println("converting it into Hexadecimal form --->>>");
		long et1= System.nanoTime();
		String answer =  " ";
		while(decimalVal!=0)
		{
			
			if(decimalVal%16 == 10)
			{
				answer = "A" + answer;
			}
			else if(decimalVal%16 == 11)
			{
				answer = "B" + answer;
			}
			else if(decimalVal%16 == 12)
			{
				answer = "C" + answer;
			}
			else if(decimalVal%16 == 13)
			{
				answer = "D" + answer;
			}
			else if(decimalVal%16 == 14)
			{
				answer = "E" + answer;
			}
			else if(decimalVal%16 == 15)
			{
				answer = "F" + answer;
			}
			else
			{
				answer = decimalVal%16 + answer;
			}
			decimalVal=decimalVal/16;
			
		}
		for(int counter =0; counter<5; counter++)
		{
			System.out.print("*");
			Thread.sleep(500);
		}
		System.out.println("\n the equivalent hexadecimal value is : "+ answer );
		System.out.println("\n converting it into Octal form --->>>");
		String ans=" ";
		while(oct_dec!=0)
		{
			ans= oct_dec%8 + ans;
			oct_dec = oct_dec/8;
		}
		for(int counter =0; counter<5; counter++)
		{
			System.out.print("*");
			Thread.sleep(500);
		}
		System.out.println("\n the equivalent octal value is : "+ ans );
		long et2= System.nanoTime();
		System.out.println("----------------METHOD 2------------------");
		long et3= System.nanoTime();
		String HEX = Integer.toHexString(method2_dec);
		String OCT = Integer.toOctalString(method2_dec);
		
		for(int counter =0; counter<5; counter++)
		{
			System.out.print("*");
			Thread.sleep(500);
		}
		System.out.println("\n the equivalent Hexadecimal value is : "+ HEX );
		for(int counter =0; counter<5; counter++)
		{
			System.out.print("*");
			Thread.sleep(500);
		}
		System.out.println("\n the equivalent octal value is : "+ OCT );
		long et4= System.nanoTime();
		System.out.println("--------------------------------------------");
		System.out.println("the time taken for first method to execute is : "+ (et2-et1));
		System.out.println("the time taken for second method to execute is : "+ (et4-et3));
		System.out.println("--------------------------------------------");
	}//end main
}// end class