/*_________________________________HANGMAN GAME____________________________________________*/

/* The word to guess is represented by a row of dashes, representing each letter of the word. In most variants,
 proper nouns, such as names, places, and brands, are not allowed. Slang words, sometimes referred to as informal or
 shortened words, are also not allowed. If the guessing player suggests a letter which occurs in the word, the other player
 writes it in all its correct positions. If the suggested letter or number does not occur in the word, the other player draws one 
 element of a hanged man stick figure as a tally mark.

The player guessing the word may, at any time, attempt to guess the whole word. If the word is correct, the game is over
 and the guesser wins. Otherwise, the other player may choose to penalize the guesser by adding an element to the diagram.
 On the other hand, if the other player makes enough incorrect guesses to allow his opponent to complete the diagram, the game 
 is also over, this time with the guesser losing. However, the guesser can also win by guessing all the letters or numbers that
 appears in the word, thereby completing the word, before the diagram is completed. (here diagram is represented by number of chances)*/
 
 import java.util.Scanner;
 
 public class HangMan_Game{
	 public static void main(String args[]){
		 
		 Scanner scan = new Scanner(System.in);
		 java.io.Console con = System.console();
		 int chance =8;
		 int countStar =0;                                   
		  System.out.println("++++++++++++++ Game for 2 players only+++++++++++\n");
		  
		 System.out.println("-----------------GAME BEGINS-----------------\n");
		  
		
		 System.out.println("player 1 's turn ------------------------>");
		 System.out.print("enter the word to be recognised by second player : ");
		 char []actualWord = con.readPassword(); 
		 String ACTUALWORD = new String(actualWord);
		 char []secondTime = new char[ACTUALWORD.length()];
		 
		 System.out.print(" the given word by player1 is : ");
		 
		 for(int index =1; index<= ACTUALWORD.length(); index++){
			 if(actualWord[index-1] == 'a' || actualWord[index-1] == 'A' || actualWord[index-1] == 'e'|| actualWord[index-1] == 'E' ||
					actualWord[index-1] == 'i' || actualWord[index-1] == 'I' || actualWord[index-1] == 'o' || actualWord[index-1] == 'O'
					|| actualWord[index-1] == 'u' || actualWord[index-1] == 'U')
					{
						System.out.print(actualWord[index-1]+" ");
						secondTime[index-1] = actualWord[index-1];
					}
					else
					{
						System.out.print(" _ ");
						secondTime[index-1]='_';
						countStar++;                                
					}
		 }
		 int rounds =1;
		 while(countStar !=0 && chance !=0){
			 
				   System.out.println("\n ......... Round "+ rounds +" ........\n");
				   System.out.println("player 2 's turn ------------------------>");
				   char inputPlayer2;
				   System.out.print("Enter a letter : ");
				   inputPlayer2 = scan.nextLine().charAt(0);
				   
				   int flag =0;
				   
				   for( int index=1; index<= ACTUALWORD.length(); index++){
					   
					   if(secondTime[index-1]=='_')
					   {
						   if(inputPlayer2 == actualWord[index-1]){
							   secondTime[index-1] = inputPlayer2;
							   countStar--;
							   flag=1;
							   break;
						   }
						   else{
							   flag=0;
						   }
					   }
					   
				   }
				  if(flag==0)		//didn't match
				  {
					  chance--;
				  }
				  System.out.print("\n the current status of the game is : ");
				  
				  for(int i=1; i<=ACTUALWORD.length();  i++){
					  System.out.print(secondTime[i-1]+" ");
				  }
				  if(chance ==0 && countStar !=0){
					  System.out.println("\n all the chances are out!! ");
					  System.out.println("################ PLAYER 2 LOST ###############");
					  System.out.println("\n ------------------GAME OVER!------------------\n");
					  System.out.println(" the correct answer is : "+ ACTUALWORD);
					  System.exit(0);
				  }
				  else if(chance!=0 && countStar==0){
					  System.out.println("\n ################# PLAYER 2 WON ###################");
					  System.out.println("\n ------------------GAME OVER!------------------\n");
					  System.exit(0);
				  }
				  else if(chance==0 && countStar==0){
					  System.out.println("\n ################# NO WINNER ###################");
					  System.out.println("\n ------------------GAME OVER!------------------\n");
					  
					  System.exit(0);
				  }
				  else{
					  System.out.println("\n Round 1 over!!  The Game Continues ......");
					  rounds++;
				  }
		 } 
//_____________________________________________________________________________________________________________________________
		
	
	 }// end main
 }// end class