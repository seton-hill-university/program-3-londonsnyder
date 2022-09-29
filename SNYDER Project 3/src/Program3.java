// Project:  Project 3
// Author:   London Snyder 
// GitHub:   londonsnyder 
// Date:     Sept 26, 20222
// Version:  1.0
// Desc:     This program collects a user's number, determines whether it fits in the 0-100 range,
// and counts down from the user's input number 

// Initializing scanner
import java.util.Scanner;


public class Program3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// connecting keyboard to scanner to collect user input 
				Scanner keyboard = new Scanner(System.in); 
				
		// Asking user for name and number between 0 and 100
				System.out.println("Enter your name: ");
				String name = keyboard.next();
				System.out.println("Enter a number between 0 and 100:  ");
				int enteredNumber = keyboard.nextInt();
				
				
				
				
		//***********************************************************************
		// if the user enters a valid number 
		while (enteredNumber>0 && enteredNumber<100)
			{
	//Thanks user and starts count down
				System.out.println("Thank you for your input, " + name + ".");
				for(int countDown = enteredNumber; countDown>0; countDown--)
				{
					System.out.println("There is a remainder of " + countDown);
					

				}break; }
	// If user enters an invalid number
		if(enteredNumber<0 || enteredNumber>100)
			{
	//re-asks user for number 
			System.out.println("Please enter a valid number: ");
			int tryAgain = keyboard.nextInt();
	// counts down form new number 
			for(int countDown2 =tryAgain; countDown2>0; countDown2--)
			{
				System.out.println("There is a remainder of " + countDown2); 
			} 
			}
		
	}
			}
