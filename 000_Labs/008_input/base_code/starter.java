/*
 *	Author: alex p 
 *  Date: 9/2/2026
*/
 // done !apr req!
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("What is your name : ");
		String naem = scanner.nextLine();
		System.out.print("What is your age : ");
		String is = scanner.nextLine();
		System.out.print("What month were you born (1-12) : ");
		String the = scanner.nextLine();
		System.out.print("What day were you born (1-31) : ");
		String game = scanner.nextLine();
		System.out.print("What year were you born : ");
		String koti = scanner.nextLine();
		System.out.print("How much is a buck fifty (0.0) : ");
		String manishi = scanner.nextLine();
		System.out.println();
		System.out.println("Your name is " + naem + " & you were born on " + the + "/" + game + "/" + koti + ".");
		System.out.println("You are " + is + " years old!");

		float mon = Float.parseFloat(manishi);
		System.out.println("You have $" + mon + " in your wallet.");
		

	}
}
