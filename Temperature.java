//program to convert a temperature from  fahrenheit to centigrade and vice versa

import java.util.Scanner;
 
public class Temperature{
	public static void main(String args[]){
		
		Scanner scan= new Scanner(System.in);
		float tempFahrenheit;
		float tempCelsius;
		System.out.print("enter temperature value in fahrenheit : ");
		tempFahrenheit = scan.nextFloat();
		
		tempCelsius = (float)((tempFahrenheit - 32)/1.8);
		
		System.out.print("\n the temperature in centigrade is : "+tempCelsius);
		
		
	}//end main
}//end class