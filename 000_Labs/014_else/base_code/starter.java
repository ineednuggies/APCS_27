/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("The goal of the game is to guess the random number correctly on your first try");
		//System.out.println();

		int opt = (int)(Math.random()*1000) ;



			System.out.print("What is your guess? ");
			int guess1 = scanner.nextInt();
			if(guess1 == opt){
				System.out.println("You got it! Woo!");
			} else{
				System.out.println("You sadly didn't guess right, the number was " + opt + "!");
			}

	}
}
