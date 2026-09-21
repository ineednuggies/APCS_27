/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		//System.out.println();

		int opt = (int)(Math.random()*30) ;

		if(opt <= 10){
			System.out.println("It's a furry animal!");
			System.out.print("What is your guess? ");
			String guess1 = scanner.nextLine();
			if(guess1.equals("cat") || guess1.equals("Cat")){
				System.out.println("You got it! Woo!");
			} else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("Its a feline friend!");
				String guess2 = scanner.nextLine();
					if(guess2.equals("cat") || guess2.equals("Cat")){
						System.out.println("You got it! Woo!");
					}	else{
						System.out.println("The answer was cat, better luck next time!");
					}
			}
		}

		if(opt > 10 && opt <= 20){
			System.out.println("It's a planet in our solar system!");
			System.out.print("What is your guess? ");
			String guess1 = scanner.nextLine();
			if(guess1.equals("earth") || guess1.equals("Earth")){
				System.out.println("You got it! Woo!");
			} else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It's the only one with humans on it!");
				String guess2 = scanner.nextLine();
					if(guess2.equals("earth") || guess2.equals("Earth")){
						System.out.println("You got it! Woo!");
					}	else{
						System.out.println("The answer was earth, better luck next time!");
					}
			}
		}

		if(opt > 20){
			System.out.println("It's a fruit!");
			System.out.print("What is your guess? ");
			String guess1 = scanner.nextLine();
			if(guess1.equals("apple") || guess1.equals("Apple")){
				System.out.println("You got it! Woo!");
			} else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("Its a red fruit!");
				String guess2 = scanner.nextLine();
					if(guess2.equals("apple") || guess2.equals("Apple")){
						System.out.println("You got it! Woo!");
					}	else{
						System.out.println("The answer was apple, better luck next time!");
					}
			}
		}


	}
}
