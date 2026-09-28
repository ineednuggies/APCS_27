/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String password = "98.3";
		int rand = (int)(Math.random()*10)+1;

		System.out.println("Welcome to the fortune cookie generator!");
		System.out.println();
		System.out.print("Password : ");
		String guess = scanner.nextLine();
		if(guess.equals(password)){
			System.out.println("Password accepted.");
		} else {
			System.out.println("Password incorect.");
		}

		System.out.println();

		if(rand == 1){
			System.out.println("you suck.");
		} if(rand == 2){
			System.out.println("you should be a box.");
		} if(rand == 3){
			System.out.println("you stink like overcooked sewer drains.");
		} if(rand == 4){
			System.out.println("you look like ajith.");
		} if(rand == 5){
			System.out.println("you might live to 60.");
		} if(rand == 6){
			System.out.println("you look like eto-jan.");
		} if(rand == 7){
			System.out.println("you look like jimothy.");
		}if(rand == 8){
			System.out.println("were doing an exercise today.");
		} if(rand == 9){
			System.out.println("60%.");
		} if(rand == 10){
			System.out.println("220 BF.");
		}

		System.out.println();



	}
}
