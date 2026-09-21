/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int int1 = scanner.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int int2 = scanner.nextInt();

		System.out.println();

		System.out.println("Your range is " + int1 + " to " + int2 + ".");
		System.out.println("Here are 5 numbers generated in that range.");

		int rand = (int)(Math.random()*(int2 - int1) + int1);

		System.out.print(rand + ",");
		rand = (int)(Math.random()*(int2 - int1) + int1);
		System.out.print(rand + ",");
		rand = (int)(Math.random()*(int2 - int1) + int1);
		System.out.print(rand + ",");
		rand = (int)(Math.random()*(int2 - int1) + int1);
		System.out.print(rand + ",");
		rand = (int)(Math.random()*(int2 - int1) + int1);
		System.out.print(rand);
	}
}
