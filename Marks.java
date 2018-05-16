//3> to enter the marks scored by student in 5 subjects and to calculate the aggregate marks as well as percentage

import java.util.Scanner;
public class Marks{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		float sub1;
		float sub2;
		float sub3;
		float sub4;
		float sub5;
		float totalMarks;
		float aggMarks ;
		float percent;
		
		
		System.out.println("************* MARKS IN FIVE SUBJECT (OUT OF 100)**************\n");
		System.out.println(" The marks in 5 subjects are :");
		
		
			
			System.out.print("\n enter marks in subject 1 (out of 100) : ");
			sub1 = scan.nextFloat();
			System.out.print("\n enter marks in subject 2 (out of 100) : ");
			sub2 = scan.nextFloat();
			System.out.print("\n enter marks in subject 3 (out of 100) : ");
			sub3 = scan.nextFloat();
			System.out.print("\n enter marks in subject 4 (out of 100) : ");
			sub4 = scan.nextFloat();
			System.out.print("\n enter marks in subject 5 (out of 100) : ");
			sub5 = scan.nextFloat();
		
			totalMarks =(sub1+sub2+sub3+sub4+sub5);
			
			
		
		aggMarks = (float)(totalMarks/ 500);
		System.out.println("****************************************************************\n");
		System.out.println("The aggregate marks of student is : "+ aggMarks	);
		percent = (float)(aggMarks*100);
		System.out.println("The percentage scored by student is : "+ percent+"%");
		System.out.println("****************************************************************\n");
		
	}//end main
}// end class
 