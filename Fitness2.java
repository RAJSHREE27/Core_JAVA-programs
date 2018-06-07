
import java.util.Scanner;
public class Fitness2{
	public static void main(String args[]){
		
		boolean isFit;
		
		System.out.print(" a man is fit or not?(true/false) : ");
		
		while(true){
			
				try{
					isFit = new Scanner(System.in).nextBoolean();
								//InputMismatchException
					if(isFit){
						System.out.print("the person is fit");
					}else{
						System.out.print("the person is not fit");
					}
					break;
				
				}
				catch( java.util.InputMismatchException i){
					System.out.print("invalid input!!!");
					System.out.print("enter again : ");
				}catch( RuntimeException E){
					 System.out.println("problem  " + E.getMessage());
				}catch( Exception e){
					System.out.println(" problem found in code " + e.getMessage());
	  
				}
		}// wnd while	
	}//end main
}//end class