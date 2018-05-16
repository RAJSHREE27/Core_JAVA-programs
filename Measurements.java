/* 2> the mathematical measurement units are:
					   1 kilometer = 1000 meter
					   1 meter = 100 cm
					   1 meter = 3.28 feet
					   1 inch = 2.5 cm				*/
	
import java.util.Scanner;
 public class Measurements{
	 public static void main(String args[]){
		 Scanner scan = new Scanner(System.in);
		 
		 float distanceKM;
		 float distanceMeter;
		 float distanceCM;
		 float distanceFeet;
		 float distanceInch;
		 
		 System.out.print(" Enter the distance (in kilometer) = ");
		 distanceKM = scan.nextFloat();
		 
		 System.out.println("----------------------------------------------------");
		 distanceMeter = (float)(1000* distanceKM);
		 System.out.println(" the distance (in meter) = " + distanceMeter);
		 System.out.println("-----------------------------------------------------");
		
   		 distanceCM = (float)(100* distanceMeter);
		 System.out.println(" the distance (in centimeter) = " + distanceCM);
		 System.out.println("-----------------------------------------------------");
		 
   		 distanceFeet = (float)(3.28* distanceMeter);
		 System.out.println(" the distance (in feet) = " + distanceFeet);
		 System.out.println("-----------------------------------------------------");
		 
   		 distanceInch = (float)(2.5 * distanceCM);
		 System.out.println(" the distance (in Inch) = " + distanceInch);
		 System.out.println("-----------------------------------------------------");
		 
	 }//end main
 }// end class