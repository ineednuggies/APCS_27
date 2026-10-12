/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int rand = (int)(Math.random()*1000)+1;

		System.out.println("You have to guess the number 1-1000");
		System.out.print("What is your guess? (1-1000) : ");
		int guess = sc.nextInt();
		while(guess != rand){
			if(guess<rand){
				System.out.print("Wrong, your number is too low. What is your next guess (1-1000) : ");
			} else if(guess>rand){
				System.out.print("Wrong, your number is too high. What is your next guess (1-1000) : ");
			}
			guess = sc.nextInt();
		}
		if(guess == rand){
			System.out.println("You have succesfully guessed the number!");
		}



		
	}
}
