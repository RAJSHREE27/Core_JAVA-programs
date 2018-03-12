/* java program to display the number names VERSION-3 between 0 to 100 */

import java.util.Scanner;

public class numberNamesV3{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int no;
		String str;
		System.out.println("***************************VERSION-3*********************************");
		System.out.println("Enter a number between 0 - 100  :");
		no = scan.nextInt();
		
		if(no==100)
		{	System.out.println("-----------------------------------------------------------------------");
			System.out.println("OUTPUT");
			System.out.println("One Hundred !");
			System.out.println("**********************************************************************");
		}// end if
		
		else if(no<21)
		{
			switch(no)
			{	
					case 0 : str = "zero";
							break;
					case 1 : str = "one";
							break;
					case 2 : str = "two";
							break;
					case 3 : str = "three";
							break;
					case 4 : str = "four";
							break;
					case 5 : str = "five";
							break;
					case 6 : str = "six";
							break;
					case 7 : str = "seven";
							break;
					case 8 : str = "eight";
							break;
					case 9 : str = "nine";
							break;
					case 10 : str = "ten";
							break;
					case 11 : str = "eleven";
							break;
					case 12 : str = "twelve";
							break;
					case 13 : str = "thirteen";
							break;
					case 14 : str = "fourteen";
							break;
					case 15 : str = "fifteen";
							break;
					case 16 : str = "sixteen";
							break;
					case 17 : str = "seventeen";
							break;
					case 18 : str = "eighteen";
							break;
					case 19 : str = "nineteen";
							break;
					case 20 : str = "twenty";
							break;
					default : str="invalid";
							break;
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("OUTPUT");
			System.out.println(no + " = " + str);
			System.out.println("**********************************************************************");
		}// end else if
		else if(no>20 && no<100)
		{
			int num1;
			int num2;
			String str2;
			num1 = no%10;
			num2 = no - num1;
			switch(num2)
			{
					case 20 : str = "twenty";
							break;
					case 30 : str = "thirty";
							break;
					case 40 : str = "forty";
							break;
					case 50 : str = "fifty";
							break;
					case 60 : str = "sixty";
							break;
					case 70 : str = "seventy";
							break;
					case 80 : str = "eighty";
							break;
					case 90 : str = "ninety";
							break;
					default : str="invalid";
							break;
			}
			switch(num1)
			{
					case 1 : str2 = "one";
							break;
					case 2 : str2 = "two";
							break;
					case 3 : str2 = "three";
							break;
					case 4 : str2 = "four";
							break;
					case 5 : str2 = "five";
							break;
					case 6 : str2 = "six";
							break;
					case 7 : str2 = "seven";
							break;
					case 8 : str2 = "eight";
							break;
					case 9 : str2 = "nine";
							break;
					default: str2="";
							break;
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("OUTPUT");
			System.out.println(no + " = " + str +" " + str2);
			System.out.println("**********************************************************************");
			
			
			
		}//end else if
		else
		{
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("OUTPUT");
			System.out.println("VALUE OUT OF RANGE ");
			System.out.println("**********************************************************************");
			
		}
			
	}//end main
}//end class