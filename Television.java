// object oriented program to show properties of television

import java.util.*;

public class Television{
	
			String []channelList ;
			int []channel_num  ;
			int numberOfChannels;
			
			// Scanner scan = new Scanner(System.in);
			
		  void Enter_Channel()	{
			for(int i=1; i<= numberOfChannels ; i++){
				System.out.print("Channel Number : ");
				channel_num[i-1] = new Scanner(System.in).nextInt();
				System.out.print("\n");
				System.out.print("Channel Name : ");
				channelList[i-1] = new Scanner(System.in).nextLine();
				System.out.print("\n");
			}//loop
			
		}//  method

			// same class data members are not required to be set as arguments of member function 
			 void Display_Channel(){	
				
				System.out.println("-----------------The channels available are ----------------");
				for(int i=1; i<= numberOfChannels ;  i++){
					System.out.println(" Channel "+ channelList[i-1] + " comes in channel number "+ channel_num[i-1]);
				}
				System.out.println("------------------------------------------------------------");
			}//method
			
} // end class