/**
@title		        lotto.java
@description          lottery emulation
@author			Victoria C
@date			02/01/13
@version		1.8
*/

package hi;

import java.util.*;
import java.util.Arrays.*;


public class lotto 
{
	private final int[] lottoNumbers = new int[5]; //winners data members
        private int[] numbersPick = new int[5]; //Picks data members
        
	private void lottery () //score function for private members
	{
		//private final int[] lottoNumbers = new int[5];
	
		//random lotto numbers generator
		for(int i = 0; i < lottoNumbers.length; i++)
		{
			lottoNumbers[i] = (int) (Math.random() *35); //picks 5 random number with max number of 35
		}

		java.util.Arrays.sort(lottoNumbers);
	}
	

	public int[] play() 
	{
		
                int cash = 1;
		
		System.out.println("Connecticut's Crazy Cash 5 Lotto!");
		System.out.println("---------------------------------");
		
		System.out.print("Press GO to begin"); //immitates go function
		Scanner sc = new Scanner(System.in);
                String nextLine = sc.nextLine();
             
	    
	    while(true) 
	    {
	    	System.out.print("Please insert $1:$"); 
			cash = sc.nextInt();
			if (cash == 1) //boundary validation
			{
				break;
			}

			System.out.printf("Incorrect monetary ammount:  %d\n", cash); //validation to ensure proper ammount
			
	    }
	    	
		for(int e = 0; e < 5; e++)
		{
			System.out.print("Enter a number: "); //stores the users 5 numbers as an array
			numbersPick[e] = sc.nextInt();
		}

		java.util.Arrays.sort(numbersPick); //sorts the numbers in ascending order to compare w/ lotto #'s

		for(int i = 0; i < numbersPick.length;i++)
		{       System.out.println("Your Cash 5 Lotto number is: ");
			System.out.println(numbersPick[i] + ""); //prints your array
		}
                
		for(int e = 0; e < lottoNumbers.length;e++)
		{
                        System.out.println("The winning number is: ");
			System.out.println(lottoNumbers[e] + ""); //prints lotterry
		} 
		return lottoNumbers;
		
	}

	public int compare(int[] numbersPick)
	{
            int matches = 0;
	
		if(numbersPick.length == lottoNumbers.length)
		{
			for(int i=0; i < 5; i++)
			{
			
                        if(numbersPick[i] == lottoNumbers[i]) //compares arrays to each other
			{
				matches++; //counts the numbers of matches to each
			}
                        }
			
		}
		if (matches == 0) //losing lotto
		{
			System.out.println("I'm sorry but none of your numbers match...");
                }
                if (matches == 1) //losing lotto
		{
			System.out.println("You have only one match. You do not win a cash prize.");
		}
		if (matches == 2) // 2 matches in the array
		{
			System.out.println("You have two matches! Your cash prize is $3.00.");
		}
		if (matches == 3) // 3 matches
		{
			System.out.println("You have three matches! Your cash price is $20.00.");
		}
		if (matches == 4) // 4 matches
		{
			System.out.println("You have four matches! Your cash price is $100.00.");
		}
		else if (matches == 5) //winning lotto
		{
			System.out.println("You are our GRAND PRIZE WINNER! Your cash prize is $500.00.");
		}
		System.out.println("Thank you for playing CONNECTICUT'S CRAZY CASH 5 LOTTO! Feel free to play again.");
                        return matches;
	}
	
	//main function where the other functions get called into
	public int main () 
	{
            lottery(); //score function for the private members
            int[] playersPick = play();	//play function to get users pics
            int compare = compare(numbersPick); //to compare to each other and return the matches
            return 0;
	}
}

