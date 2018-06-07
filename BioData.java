//BIO-DATA

import java.util.Scanner;

public class BioData{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		String course;
		float weight;
		int rollNumber;
		
		try{
		
				System.out.print("Enter Name : ");
				name = scan.nextLine();
				System.out.print("Enter age : ");
				age = scan.nextInt();	//InputMismatchException
				System.out.print("Enter course persuaded : ");
				course = new Scanner(System.in).nextLine();
				System.out.print("Enter roll number : ");
				rollNumber = scan.nextInt();//InputMismatchException
				System.out.print("Enter weight : ");
				weight = scan.nextFloat();
				
				System.out.println("+++++++++++++++++++++++");
				System.out.println("NAME : "+name);
				System.out.println("AGE : "+age);
				System.out.println("COURSE : "+course);
				System.out.println("ROLL NUMBER : "+rollNumber);
				System.out.println("WEIGHT : "+weight);
		}
		catch( java.util.InputMismatchException E){
			System.out.println("values not matching with the datatypes defined");
			System.out.println("try again!");
		}catch(RuntimeException E){
			System.out.println("problem found - "+ E.getMessage());
		}catch(Exception E){
			System.out.println("wrong value entered !");
		}
		
		
		
	}//end main
}//end class