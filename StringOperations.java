//assignment

import java.util.Scanner;
import java.lang.String;

public class StringOperations{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		char again ='y';
		
		String sentence = "The word to guess is represented by a guess row of row dashes guess representing true each guess letter same of the word ";
						 
		int choice;

		System.out.println(" the string on which, operation is to be performed is : ");
		System.out.println();
		System.out.println(sentence);
		
		System.out.println("\n	********************* OPTIONS **********************\n");
		System.out.println("	1) To find a particular word in the given sentence");	//done
		System.out.println("	2) To find the number of times it is present ");
		System.out.println("	3) To replace a particular word with other ");	//done	
		System.out.println("	4) To replace a all the words with another word ");	//done
		System.out.println("	5) To insert a word at mid"); 	// done
		System.out.println("	6) To append a string ");		//done
		System.out.println("	7) To prepend a String");		//done
		System.out.println("	8) Delete any word single time");	//done
		System.out.println("	9) Delete all the similar words in sentence ");	//done
		System.out.println("\n	******************************************************\n");
		
		while(again == 'y' || again == 'Y'){
			
				System.out.print("\n choose any option from the above alternatives : ");
				choice = scan.nextInt();
				
				
				switch(choice){
					
					case 1 :
							System.out.println("\n___________________________________________________________________________\n");
							
							 System.out.println("\n------ to find a particular word from sentence -----\n");
							 String userText;
							 Scanner s =  new Scanner(System.in);
							 System.out.print("Enter the word which you want to search, is present or not : ");
							 userText  = s.nextLine();
							 
							 boolean answer = sentence.contains(userText);		// input a character sequence means string
							 System.out.println(answer);
							 
							 if(answer == true){
								 System.out.println("Yes ! the word '"+ userText +"' is present in the given sentence ");
							 }
							 else{
								 System.out.println("No ! the word '"+ userText +"' is not present in the given sentence");
							 }
							 System.out.println("\n_________________________________________________________________________________\n");
							 break;
					
					case 2 : System.out.println("\n------ To find the number of times a string is present in the sentence -----\n");
								/* splitting the sentence into string array and then comparing each element ith the entered string and counting*/
								
								Scanner second = new Scanner(System.in);
								System.out.print("Enter the string you want to count in the given sentence : ");
								String substrings = second.nextLine();
								int count = 0;
								String []strngArray = sentence.split(" ");		// split as per space encountered
								//System.out.println(strngArray);
								for(int index =1; index <= strngArray.length ; index++ ){
									
									if(strngArray[index-1] == substrings){
										
										count++;
										
									}
								}
								
								System.out.println("The number of times the word '"+ substrings + "' is present in the sentence is : "+count);
								System.out.println("\n_________________________________________________________________\n");
								
								break;
							 
					case 3 : 	System.out.println("\n________________________________________________________________\n");
								Scanner third = new Scanner(System.in);
								System.out.println("\n-------- To replace a particular word with other ----------\n");
								System.out.print("Enter a word which you want to replace from the given sentence : ");
								String word = third.nextLine();
								System.out.print("Enter the word which you want to replace with : ");
								String replaceWord = third.nextLine();
								
								if(sentence.contains(word)==true){
									sentence = sentence.replace(word , replaceWord);
									System.out.println("\n The new sentence is : "+sentence);
								}
								else{
									System.out.println("\n word not found, hence it cannot be replaced ! \n");
								}
								System.out.println("\n__________________________________________________________________\n");
								
								break;
							
					case 4	:   System.out.println("\n__________________________________________________________________\n");
								System.out.println("\n--------to replace all the words by a given word -------\n ");
								Scanner fourth = new Scanner(System.in);
								System.out.print("Enter a word which you want to replace from the given sentence : ");
								String word2 = fourth.nextLine();
								System.out.print("Enter the word which you want to replace with : ");
								String replaceWord2 = fourth.nextLine();
								
								if(sentence.contains(word2)==true){
									sentence = sentence.replaceAll(word2 , replaceWord2);
									System.out.println("\n The new sentence is : "+sentence);
								}
								else{
									System.out.println("\n word not found, hence it cannot be replaced ! \n");
								}
								System.out.println("\n__________________________________________________________________\n");
								
								break;
								
					case 5 	:  System.out.println("\n__________________________________________________________________\n");
								Scanner fifth = new Scanner(System.in);
								System.out.println("------ To insert a word at mid -------");
								String str ;
								int mid ;
								System.out.print("Enter a word which you want to insert at mid of sentence: ");
								str = fifth.nextLine();
								
								StringBuffer sen = new StringBuffer(sentence);
								
								mid = (sen.length())/2;
								
								sen = sen.insert(mid,str);
								sentence = sen.toString();
								System.out.println("The changed sentence is : "+sentence);
								
								System.out.println("\n__________________________________________________________________\n");
								break;
								
					case 6 :	System.out.println("\n__________________________________________________________________\n");
								Scanner sixth = new Scanner(System.in);
								System.out.println("\n------- To append a string ------ \n");
								System.out.print("Enter a word which you want to append at the end of sentence: ");
								String value = sixth.nextLine();
								StringBuffer stapp = new StringBuffer(sentence);
								
								stapp = stapp.append(value);
								sentence = stapp.toString();
								System.out.print("\n The changed sentence is : "+sentence);
								
								System.out.println("\n__________________________________________________________________\n");
								break;
								
					case 7	:	System.out.println("\n__________________________________________________________________\n");
								System.out.println("\n------- To prepend a String --------\n");
								Scanner seventh = new Scanner(System.in);
								System.out.print("Enter a word which you want to prepend at the beginning of sentence: ");
								String preString = seventh.nextLine();
								
								sentence = preString +" "+sentence;
								System.out.print("\n The changed sentence is : "+sentence);
								
								System.out.println("\n__________________________________________________________________\n");
								break;
								
					case 8 	:	System.out.println("\n__________________________________________________________________\n");
								Scanner eight = new Scanner(System.in);
								System.out.print("\n------ To delete any word single time ----------\n");
								System.out.print("Enter a word which you want to delete from the given sentence : ");
								String delString = eight.nextLine(); 
								
								if(sentence.contains(delString)==true){
									
									sentence = sentence.replaceFirst(delString , "");
									System.out.println("\n The new sentence is : "+sentence);
								}
								else{
									System.out.println("\n word not found, hence it cannot be deleted ! \n");
								}
								System.out.println("\n__________________________________________________________________\n");
								
								break;
								
					case 9	:	System.out.println("\n__________________________________________________________________\n");
								Scanner nine = new Scanner(System.in);
								System.out.print("\n------ To delete all the similar words ----------\n");
								System.out.print("Enter a word which you want to delete from the given sentence : ");
								String delStringAll = nine.nextLine(); 
								
								if(sentence.contains(delStringAll)==true){
									
									sentence = sentence.replace(delStringAll , "");
									System.out.println("\n The new sentence is : "+sentence);
								}
								else{
									System.out.println("\n word not found, hence it cannot be deleted ! \n");
								}
								System.out.println("\n__________________________________________________________________\n");
								
								break;
								
					default : System.out.println("INVALID CHOICE ");
				}
				Scanner ag = new Scanner(System.in);
				System.out.print("\n Do you want to continue further ?(y/n) : ");
				again =  ag.nextLine().charAt(0);
		
		
		}//end while
	}//end main
}//end class