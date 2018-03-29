//java program to enter patient information and disease which he/she is suffering from and showing medicine accordingly

import java.util.*;

public class Patient{
	
	int patientNumber;
	String patName;
	String Disease;
	String Gender;
	
	Doctor Dolittle = new Doctor();
	
	Scanner scan = new Scanner(System.in);
	
	
	void EnterPatientInfo(){
		
		System.out.print("Enter the patient number  : ");
		patientNumber = scan.nextInt();
		System.out.print("\n");
		
		System.out.print("Enter the name of patient : ");
		patName = scan.nextLine();
		System.out.println("\n");
		
		System.out.print("Enter the gender of patient (Male/Female) : ");
		Gender = scan.nextLine();
		System.out.print("\n");
		
	}
	void EnterPatientDisease(){
		System.out.println("____________________________________________________________________________________________\n");
		System.out.println("LIST OF DISEASES ->");
		System.out.println("1. Fever ");
		System.out.println("2. Cold and Cough ");
		System.out.println("3. Indigestion ");
		System.out.println("4. Headache ");
		System.out.println("5. Cramps ");
		
		System.out.println("Select the disease which patient "+ patName + " is suffering from -> ");
		Disease = scan.nextLine();
		
		Dolittle.giveMedicines(Disease);
		
	}
	
	
	
	
	
}