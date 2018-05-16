// 10> to find the total number of illiterate men and women in the population of 80000


public class Illiteracy{
	public static void main(String args[]){
		
		
		System.out.println("\n---------------------- The population of the city is 80000 -------------------");
		System.out.println("out of this, 52% are men ");
		System.out.println("literacy rate of population is 48%");
		System.out.println("35% of men are literate");
		
		int illiterateMen;
		int totalMen;
		int literatePeople;
		int totalWomen;
		int illiterateWomen;
		
		totalMen = (int)(0.52*80000);
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("total number of men in population : "+ totalMen);
		totalWomen = 80000 - totalMen;
		
		System.out.println("total number of women in population : "+ totalWomen);
		
		int literateMen = (int)(0.35*totalMen);
		literatePeople = (int)(0.48*80000);
		
		int literateWomen = literatePeople - literateMen;
		
		illiterateMen = totalMen- literateMen;
		illiterateWomen = totalWomen - literateWomen;
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("\n total number of illiterate men = "+ illiterateMen);
		System.out.println("\n total number of illiterate women = " + illiterateWomen);
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
		
	}//end main
} // end class