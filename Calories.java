//this is a program to determine the percentage of calories in a particular food
// 1 gram fat = 9 calories

public class Calories{
	
	float fatContent;
	float totalCalories;
	float calorieContent;
	float percentageCalories ;
	
	void calcCalories()
	{
		calorieContent = (float)((9* fatContent)/totalCalories) ;
		percentageCalories = (float)(calorieContent * 100);

		System.out.println("------------------------------------------------------------");
		System.out.print("\n the total calories in your food is : "+ calorieContent);
		System.out.print("\n this means "+ percentageCalories+"%");
		System.out.println("\n------------------------------------------------------------");
		
	}
	
} // end class