//main program for calories

import java.util.*;
public class CaloriesMain{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		Calories Cal = new Calories();
		boolean answer= true;
		
		while(answer){
			System.out.print("\n Enter the total amount of calories per serving : ");
			Cal.totalCalories = scan.nextFloat();
			System.out.print("\nEnter the total fat content in you food (in grams) : ");
			Cal.fatContent = scan.nextFloat();
			
			Cal.calcCalories();
			
			System.out.print("\n Do you want to continue (true/false) : ");
			answer = scan.nextBoolean();
		}
	}
}