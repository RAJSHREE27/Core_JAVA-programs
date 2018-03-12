/* java program to display the number names VERSION-1 between 0 to 10 */

import java.util.Scanner;

public class numberNamesV1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int no;
		String str;
		System.out.println("***************************VERSION-1*********************************");
		System.out.println("Enter a number between 0 -10 :");
		no = scan.nextInt();
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
			default : str="invalid";
					break;
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("OUTPUT");
		System.out.println(no + " = " + str);
		System.out.println("**********************************************************************");
		
	}//end main
}//end class