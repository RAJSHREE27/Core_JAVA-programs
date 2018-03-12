
//Taking a 3 X 3 table
//The user needs to enter a number assigned to each place value and it will be converted to 0
//Computer will be the opponent which arbitrarily generates a number ,
//if the number is present but unmarked then it will be set to 1
//every player gets a single chance only !

import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe{
	public static void main(String args[]){
		
		System.out.println("____________________________LET'S BEGIN!!________________________________________\n\n");
		//Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int [][]placeNumber = null;
		placeNumber = new int [3][3];
		int num = 1;
		int user1Value;
		for(int row=0 ; row<placeNumber.length ; row++)
		{
			for(int column=0 ; column<placeNumber[row].length ; column++)
			{
				placeNumber[row][column] = num;
				num++;
			}
		}
		System.out.println("----------------------------Initial case------------------------------------------\n");
		for(int row=0 ; row<placeNumber.length ; row++)
		{
			for(int column=0 ; column<placeNumber[row].length ; column++)
			{
				System.out.print(placeNumber[row][column] + "   ");
			}
			System.out.println();
		}
		int []usedVal = null;															//user1Value= value added by the first user
		usedVal = new int[9];															//usedVal = array that stores value added by the user and system
		int added = 0;																	//added = counter variable for array usedVal
		System.out.println("----------------------------ROUND ONE------------------------------------------\n");
		System.out.println("FIRST USER'S TURN ----> ");				//-------------------------------------------------------------------------------------------------------
		System.out.print("\n user 1 = ");
		user1Value= scan.nextInt();
		for( int row =0; row<placeNumber.length ; row++)
		{
			for(int column=0; column <placeNumber[row].length ; column++ )
			{
				if(placeNumber[row][column] == user1Value)
				{
					placeNumber[row][column] = 0;
					usedVal[added] = user1Value;
					added++;
				}
			}
		}
		System.out.println("SECOND USER'S TURN ----> ");			//--------------------------------------------------------------------------------------------------------
		System.out.print("\n user 2 = ");
		int user2Val = scan.nextInt();													// user2Val=value added by second user
		int flag = 0;
		int check =0;
		for(check =0; check<usedVal.length ;  check++)								//if it is arleady present in the used array
		{
			if(usedVal[check] == user2Val || user2Val==0)
			{
				System.out.println("choose another number");
				flag=1;
				break;
			}
		}
		if(flag==1)
		{	while(usedVal[0]==user2Val)
			{	System.out.print("\n user 2 = ");
				user2Val = scan.nextInt();
				System.out.println("choose another number");
			}
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(user2Val == placeNumber[row][column])
					{
						placeNumber[row][column] = -1;
						usedVal[added] = user2Val;
						added++;
					}
				}
			}
			
		}
		else
		{
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user2Val)
					{
						placeNumber[row][column] = -1;
						usedVal[added] = user2Val;
						added++;
					}
				}
			}
		}
		System.out.println("*********************CURRENT STATUS OF GAME AFTER FIRST ROUND ************************");
		for(int row=0 ; row<placeNumber.length ; row++)
		{
			for(int column=0 ; column<placeNumber[row].length ; column++)
			{
				System.out.print(placeNumber[row][column] + "   ");
			}
			System.out.println();
		}
		System.out.println("**************************************************************************************");
		System.out.println("\n-----------------------------------ROUND 2------------------------------------------\n");
		System.out.println("FIRST USER'S TURN ----> ");              //------------------------------------------------------------------------------------
		flag=0;
		System.out.print("\n user 1 = ");
		user1Value= scan.nextInt();
		for(check =0; check < usedVal.length ; check++)
		{
			if(user1Value == usedVal[check])
			{
				//int num1 = usedVal[check];
				flag = 1;
				break;
			}
		}
		if(flag==1)
		{	
			System.out.println("choose another number");
			while(user1Value == usedVal[0] || user1Value== usedVal[1] )							//
			{
				System.out.print("\n user 1 = ");
				user1Value = scan.nextInt();
				System.out.println("choose another number");
			}
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user1Value)
					{
						placeNumber[row][column] = 0;
						usedVal[added] = user1Value;
						added++;
					}
				}
			}
		}
		else
		{
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user1Value)
					{
						placeNumber[row][column] = 0;
						usedVal[added] = user1Value;
						added++;
					}
				}
			}
		}
		System.out.println("SECOND USER'S TURN ----> ");     	//-----------------------------------------------------------------------------------------------------------------------
		flag=0;
		System.out.print("\n user 2 = ");
		user2Val = scan.nextInt();
		for(check =0; check < usedVal.length ;  check++)								//if it is arleady present in the used array
		{
			if(usedVal[check] == user2Val)
			{
				System.out.println("choose another number");
				flag=1;
				//int num2 = usedVal[check];
				break;
			}
		}
		if(flag==1)
		{	while( user2Val == usedVal[0] || user2Val == usedVal[1] || user2Val == usedVal[2])
			{	System.out.print("\n user 2 = ");
				user2Val = scan.nextInt();
				System.out.println("choose another number");
			}
			for( int row =0; row < placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(user2Val == placeNumber[row][column])
					{
						placeNumber[row][column] = -1;
						usedVal[added] = user2Val;
						added++;
					}
				}
			}
			
		}
		else
		{
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user2Val)
					{
						placeNumber[row][column] = -1;
						usedVal[added] = user2Val;
						added++;
					}
				}
			}
		}
		System.out.println("*********************CURRENT STATUS OF GAME AFTER SECOND ROUND ************************");
		for(int row=0 ; row<placeNumber.length ; row++)
		{
			for(int column=0 ; column<placeNumber[row].length ; column++)
			{
				System.out.print(placeNumber[row][column] + "   ");
			}
			System.out.println();
		}
		System.out.println("**************************************************************************************");
		// third round begins...
		System.out.println("\n-----------------------------------ROUND 3------------------------------------------\n");
		System.out.println("FIRST USER'S TURN ----> ");              //------------------------------------------------------------------------------------
		flag=0;
		System.out.print("\n user 1 = ");
		user1Value= scan.nextInt();
		for(check =0; check < usedVal.length ; check++)
		{
			if(user1Value == usedVal[check])
			{
				//int num1 = usedVal[check];
				flag = 1;
				break;
			}
		}
		if(flag==1)
		{	
			System.out.println("choose another number");
			while(user1Value == usedVal[0] || user1Value == usedVal[1] || user1Value == usedVal[2] || user1Value == usedVal[3] || user2Val==0)
			{
				System.out.print("\n user 1 = ");
				user1Value = scan.nextInt();
				System.out.println("choose another number");
			}
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user1Value)
					{
						placeNumber[row][column] = 0;
						usedVal[added] = user1Value;
						added++;
					}
				}
			}
		}
		else
		{
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user1Value)
					{
						placeNumber[row][column] = 0;
						usedVal[added] = user1Value;
						added++;
					}
				}
			}
		}
			System.out.println("*********************CURRENT STATUS OF GAME ******************************");
		for(int row=0 ; row<placeNumber.length ; row++)
		{
			for(int column=0 ; column<placeNumber[row].length ; column++)
			{
				System.out.print(placeNumber[row][column] + "   ");
			}
			System.out.println();
		}
		
		System.out.println(" ++++++++++WINNER STATUS ++++++++");
		for( int row =0 ; row< placeNumber.length ; row++)								// checking row wise
		{
			if( placeNumber[row][0]== -1 && placeNumber[row][1]== -1 && placeNumber[row][2]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[row][0]== 0 && placeNumber[row][1]== 0 && placeNumber[row][2]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		for( int column=0; column <placeNumber[1].length ; column++)					//checking columnwise
		{
			if( placeNumber[0][column]== -1 && placeNumber[1][column]== -1 && placeNumber[2][column]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[0][column]== 0 && placeNumber[1][column]== 0 && placeNumber[2][column]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		if( placeNumber[0][0]== -1 && placeNumber[1][1]== -1 && placeNumber[2][2]==-1)				//checking diagonally
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if( placeNumber[0][0]== 0 && placeNumber[1][1]== 0 && placeNumber[2][2]==0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== -1 && placeNumber[1][1]==-1 && placeNumber[2][0]==-1)
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== 0 && placeNumber[1][1]== 0 && placeNumber[2][0]== 0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else
		{
			System.out.println("------- NO WINNER!! GAME CONTINUES----------");
		}
		
		
		
		System.out.println("SECOND USER'S TURN ----> ");     	//-----------------------------------------------------------------------------------------------------------------------
		flag=0;
		System.out.print("\n user 2 = ");
		user2Val = scan.nextInt();
		for(check =0; check < usedVal.length ;  check++)								//if it is arleady present in the used array
		{
			if(usedVal[check] == user2Val)
			{
				System.out.println("choose another number");
				flag=1;
				//int num2 = usedVal[check];
				break;
			}
		}
		if(flag==1)
		{	while(  user2Val == usedVal[0] || user2Val == usedVal[1] || user2Val == usedVal[2] || user2Val == usedVal[3] || user2Val == usedVal[4] || user2Val==0)
			{	System.out.print("\n user 2 = ");
				user2Val = scan.nextInt();
				System.out.println("choose another number");
			}
			for( int row =0; row < placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(user2Val == placeNumber[row][column])
					{
						placeNumber[row][column] = -1;
						usedVal[added] = user2Val;
						added++;
					}
				}
			}
			
		}
		else
		{
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user2Val)
					{
						placeNumber[row][column] = -1;
						usedVal[added] = user2Val;
						added++;
					}
				}
			}
		}
		System.out.println("*********************CURRENT STATUS OF GAME AFTER THIRD ROUND ************************");
		for(int row=0 ; row<placeNumber.length ; row++)
		{
			for(int column=0 ; column<placeNumber[row].length ; column++)
			{
				System.out.print(placeNumber[row][column] + "   ");
			}
			System.out.println();
		}
		System.out.println("**************************************************************************************"); 
		// TO CHECK IF THERE IS ANY STRAIGHT LINE OF 3 (-1)'s OR 0's OR NOT
		System.out.println(" ++++++++++WINNER STATUS ++++++++");
		for( int row =0 ; row< placeNumber.length ; row++)								// checking row wise
		{
			if( placeNumber[row][0]== -1 && placeNumber[row][1]== -1 && placeNumber[row][2]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[row][0]== 0 && placeNumber[row][1]== 0 && placeNumber[row][2]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		for( int column=0; column <placeNumber[1].length ; column++)					//checking columnwise
		{
			if( placeNumber[0][column]== -1 && placeNumber[1][column]== -1 && placeNumber[2][column]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[0][column]== 0 && placeNumber[1][column]== 0 && placeNumber[2][column]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		if( placeNumber[0][0]== -1 && placeNumber[1][1]== -1 && placeNumber[2][2]==-1)				//checking diagonally
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if( placeNumber[0][0]== 0 && placeNumber[1][1]== 0 && placeNumber[2][2]==0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== -1 && placeNumber[1][1]==-1 && placeNumber[2][0]==-1)
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== 0 && placeNumber[1][1]== 0 && placeNumber[2][0]== 0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else
		{
			System.out.println("------- NO WINNER!! GAME CONTINUES----------");
		}
		//*****************************************************************************************************//Round 4 Starting
		
		System.out.println("\n-----------------------------------ROUND 4------------------------------------------\n");
		System.out.println("FIRST USER'S TURN ----> ");              //------------------------------------------------------------------------------------
		flag=0;
		System.out.print("\n user 1 = ");
		user1Value= scan.nextInt();
		for(check =0; check < usedVal.length ; check++)
		{
			if(user1Value == usedVal[check])
			{
				flag = 1;
				break;
			}
		}
		if(flag==1)
		{	
			System.out.println("choose another number");
			while(user1Value == usedVal[0] || user1Value == usedVal[1] || user1Value == usedVal[2] || user1Value == usedVal[3] || user2Val==0 || user1Value== usedVal[4] || user1Value== usedVal[5])
			{
				System.out.print("\n user 1 = ");
				user1Value = scan.nextInt();
				System.out.println("choose another number");
			}
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user1Value)
					{
						placeNumber[row][column] = 0;
						usedVal[added] = user1Value;
						added++;
					}
				}
			}
		}
		else
		{
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user1Value)
					{
						placeNumber[row][column] = 0;
						usedVal[added] = user1Value;
						added++;
					}
				}
			}
		}
			System.out.println("*********************CURRENT STATUS OF GAME ******************************");
		for(int row=0 ; row<placeNumber.length ; row++)
		{
			for(int column=0 ; column<placeNumber[row].length ; column++)
			{
				System.out.print(placeNumber[row][column] + "   ");
			}
			System.out.println();
		}
		
		System.out.println(" ++++++++++WINNER STATUS ++++++++");
		for( int row =0 ; row< placeNumber.length ; row++)								// checking row wise
		{
			if( placeNumber[row][0]== -1 && placeNumber[row][1]== -1 && placeNumber[row][2]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[row][0]== 0 && placeNumber[row][1]== 0 && placeNumber[row][2]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		for( int column=0; column <placeNumber[1].length ; column++)					//checking columnwise
		{
			if( placeNumber[0][column]== -1 && placeNumber[1][column]== -1 && placeNumber[2][column]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[0][column]== 0 && placeNumber[1][column]== 0 && placeNumber[2][column]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		if( placeNumber[0][0]== -1 && placeNumber[1][1]== -1 && placeNumber[2][2]==-1)				//checking diagonally
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if( placeNumber[0][0]== 0 && placeNumber[1][1]== 0 && placeNumber[2][2]==0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== -1 && placeNumber[1][1]==-1 && placeNumber[2][0]==-1)
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== 0 && placeNumber[1][1]== 0 && placeNumber[2][0]== 0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else
		{
			System.out.println("------- NO WINNER!! GAME CONTINUES----------");
		}
		
		
		
		System.out.println("SECOND USER'S TURN ----> ");     	//-----------------------------------------------------------------------------------------------------------------------
		flag=0;
		System.out.print("\n user 2 = ");
		user2Val = scan.nextInt();
		for(check =0; check < usedVal.length ;  check++)								//if it is arleady present in the used array
		{
			if(usedVal[check] == user2Val)
			{
				System.out.println("choose another number");
				flag=1;
				//int num2 = usedVal[check];
				break;
			}
		}
		if(flag==1)
		{	while(  user2Val == usedVal[0] || user2Val == usedVal[1] || user2Val == usedVal[2] || user2Val == usedVal[3] || user2Val == usedVal[4] || user2Val==0 || user2Val == usedVal[5] || user2Val == usedVal[6])
			{	System.out.print("\n user 2 = ");
				user2Val = scan.nextInt();
				System.out.println("choose another number");
			}
			for( int row =0; row < placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(user2Val == placeNumber[row][column])
					{
						placeNumber[row][column] = -1;
						usedVal[added] = user2Val;
						added++;
					}
				}
			}
			
		}
		else
		{
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user2Val)
					{
						placeNumber[row][column] = -1;
						usedVal[added] = user2Val;
						added++;
					}
				}
			}
		}
		System.out.println("*********************CURRENT STATUS OF GAME AFTER FOURTH ROUND ************************");
		for(int row=0 ; row<placeNumber.length ; row++)
		{
			for(int column=0 ; column<placeNumber[row].length ; column++)
			{
				System.out.print(placeNumber[row][column] + "   ");
			}
			System.out.println();
		}
		System.out.println("**************************************************************************************"); 
		// TO CHECK IF THERE IS ANY STRAIGHT LINE OF 3 (-1)'s OR 0's OR NOT
		System.out.println(" ++++++++++WINNER STATUS ++++++++");
		for( int row =0 ; row< placeNumber.length ; row++)								// checking row wise
		{
			if( placeNumber[row][0]== -1 && placeNumber[row][1]== -1 && placeNumber[row][2]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[row][0]== 0 && placeNumber[row][1]== 0 && placeNumber[row][2]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		for( int column=0; column <placeNumber[1].length ; column++)					//checking columnwise
		{
			if( placeNumber[0][column]== -1 && placeNumber[1][column]== -1 && placeNumber[2][column]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[0][column]== 0 && placeNumber[1][column]== 0 && placeNumber[2][column]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		if( placeNumber[0][0]== -1 && placeNumber[1][1]== -1 && placeNumber[2][2]==-1)				//checking diagonally
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if( placeNumber[0][0]== 0 && placeNumber[1][1]== 0 && placeNumber[2][2]==0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== -1 && placeNumber[1][1]==-1 && placeNumber[2][0]==-1)
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== 0 && placeNumber[1][1]== 0 && placeNumber[2][0]== 0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else
		{
			System.out.println("------- NO WINNER !! STILL ONE MORE CHANCE LEFT!!----------");
		}
		//********************************************************************************************************************************************************
		
		System.out.println("\n-----------------------------------ROUND 5------------------------------------------\n");
		System.out.println("FIRST USER'S TURN ----> ");              //------------------------------------------------------------------------------------
		flag=0;
		System.out.print("\n user 1 = ");
		user1Value= scan.nextInt();
		for(check =0; check < usedVal.length ; check++)
		{
			if(user1Value == usedVal[check])
			{
				flag = 1;
				break;
			}
		}
		if(flag==1)
		{	
			System.out.println("choose another number");
			while(user1Value == usedVal[0] || user1Value == usedVal[1] || user1Value == usedVal[2] || user1Value == usedVal[3] || user2Val==0 || user1Value== usedVal[4] || user1Value== usedVal[5] || user1Value== usedVal[6] || user1Value== usedVal[7])
			{
				System.out.print("\n user 1 = ");
				user1Value = scan.nextInt();
				System.out.println("choose another number");
			}
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user1Value)
					{
						placeNumber[row][column] = 0;
						usedVal[added] = user1Value;
						added++;
					}
				}
			}
		}
		else
		{
			for( int row =0; row<placeNumber.length ; row++)
			{
				for(int column=0; column <placeNumber[row].length ; column++ )
				{
					if(placeNumber[row][column] == user1Value)
					{
						placeNumber[row][column] = 0;
						usedVal[added] = user1Value;
						added++;
					}
				}
			}
		}
			System.out.println("*********************CURRENT STATUS OF GAME ******************************");
		for(int row=0 ; row<placeNumber.length ; row++)
		{
			for(int column=0 ; column<placeNumber[row].length ; column++)
			{
				System.out.print(placeNumber[row][column] + "   ");
			}
			System.out.println();
		}
		
		System.out.println(" ++++++++++WINNER STATUS ++++++++");
		for( int row =0 ; row< placeNumber.length ; row++)								// checking row wise
		{
			if( placeNumber[row][0]== -1 && placeNumber[row][1]== -1 && placeNumber[row][2]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[row][0]== 0 && placeNumber[row][1]== 0 && placeNumber[row][2]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		for( int column=0; column <placeNumber[1].length ; column++)					//checking columnwise
		{
			if( placeNumber[0][column]== -1 && placeNumber[1][column]== -1 && placeNumber[2][column]==-1)
			{
				System.out.println(" USER 2 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
			else if( placeNumber[0][column]== 0 && placeNumber[1][column]== 0 && placeNumber[2][column]==0)
			{
				System.out.println(" USER 1 is the winner !!!!!");
				System.out.println(" ==============================GAME OVER======================================");
				System.exit(0);
			}
		}
		if( placeNumber[0][0]== -1 && placeNumber[1][1]== -1 && placeNumber[2][2]==-1)				//checking diagonally
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if( placeNumber[0][0]== 0 && placeNumber[1][1]== 0 && placeNumber[2][2]==0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== -1 && placeNumber[1][1]==-1 && placeNumber[2][0]==-1)
		{
			System.out.println(" USER 2 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else if(placeNumber[0][2]== 0 && placeNumber[1][1]== 0 && placeNumber[2][0]== 0)
		{
			System.out.println(" USER 1 is the winner !!!!!");
			System.out.println(" ==============================GAME OVER======================================");
			System.exit(0);
		}
		else
		{
			System.out.println("------- NO WINNER!! GAME OVER !! BETTER LUCK NEXT TIME !!!----------");
		}
		
		
		
	}//end main
}//end class