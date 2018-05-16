//to find the area and perimeter of rectangle and circle

import java.util.Scanner;
public class Area_Perimeter{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		float radius;
		float length;
		float breadth;
		float rectangleArea;
		float circleArea;
		float perimeter;
		float circumference;
		
		System.out.print(" Enter the length of rectangle (in meters): ");
		length = scan.nextFloat();
		System.out.print("\n Enter the breadth of rectangle (in meters) : ");
		breadth = scan.nextFloat();
		System.out.print("\n Enter the radius of circle (in meters) : ");
		radius = scan.nextFloat();
		
		rectangleArea = length * breadth;
		circleArea = (float)(3.14 * radius* radius);
		perimeter = (float)(2* (length + breadth));
		circumference = (float)(2* 3.14*radius);
		
		System.out.print("\n the perimeter of rectangle is : "+ perimeter+ " m");
		System.out.print("\n the area of rectangle is : " + rectangleArea+ " sq.m");
		
		System.out.println("\n------------------------------------------------------------------");
		
		System.out.print("\n the circumference of circle is : "+ circumference +" m");
		System.out.print("\n the area of circle is : " + circleArea+" sq.m");
		
		
		
		
	}//end main
}//end class