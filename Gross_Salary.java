
// 1> to calculate gross salary when dearness allowance is 40% and rent allowance is 20% of the basic salary

import java.util.Scanner;
public class Gross_Salary{
	public static void main(String args[]){
		float basicSalary;
		float grossSalary;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the basic salary : ");
		basicSalary = scan.nextFloat();
		
		grossSalary = (float)( basicSalary + (0.40)*basicSalary + (0.20)*basicSalary );
		
		System.out.println(" The Gross Salary is : Rs. "+ grossSalary);		
		
		
	}//end main
}//end class