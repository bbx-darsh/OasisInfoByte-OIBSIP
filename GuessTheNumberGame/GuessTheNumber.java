// Project 01 :-     Guessing The Number Game

import java.util.*;
public class GuessTheNumber
{
	public static void guessTheNumber()
	{
		Scanner sc = new Scanner(System.in);
		// Generating a random number
		int number = 1 + (int)(100* Math.random());
		// Given 5 trials
		int i=0, guess, trial=5;
		System.out.println("A number has been chosen between 1 to 100. Guess the number within 5 trials.");

		// Looping over 5 Trials
		for (i = 0; i < trial ; i++) 
        {
			System.out.println("Guess the number:");

			// Take input for guessing the correct number
			guess = sc.nextInt();

			// If the number is guessed correctly
			if (number == guess) {
				System.out.println("Congratulations! You guessed the number.");
				break;
			}
			else if (number > guess && i != trial- 1) 
                    {
				        System.out.println("The number is greater than " + guess);
			        }
			else if (number < guess && i != trial - 1) 
                    {
				System.out.println("The number is less than " + guess);
			        }
		}
	
		if (i == trial) 
        {
			System.out.println("You have exhausted "+ trial +" trials.");
			System.out.println("The number was " + number);
		}
	}
	public static void main(String arg[])
	{
		// Function Call
		guessTheNumber();
	}
}
