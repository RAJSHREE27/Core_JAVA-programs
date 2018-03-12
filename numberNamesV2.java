/* java program to display the number names VERSION-2 between 0 to 20 */

import java.util.Scanner;

public class numberNamesV2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int no;
		String str;
		System.out.println("***************************VERSION-2*********************************");
		System.out.println("Enter a number between 0 - 20  :");
		no = scan.nextInt();
		/* SINCE ALL THE NUMBER NAMES ARE DISTINCT BETWEEN 0 TO 20  */
		/* SO WE NEED TO MAKE ALL THE CASES */
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
		
	}//end main
}//end class