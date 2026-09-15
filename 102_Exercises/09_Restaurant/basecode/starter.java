/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the name of your restaurant : ");
		String rName = scanner.nextLine();
		System.out.print("What is your name : ");
		String name = scanner.nextLine();
		System.out.println();
		System.out.println("Great to see you, " + name + "! Let's set up a menu for " + rName + ".");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");

		System.out.println();

		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String item1 = scanner.nextLine();
		System.out.print("Price of " + item1 + " ($): ");
		double item1p = scanner.nextDouble();
		System.out.print("How many " + item1 + "'s would you like? ");
		int item1q = scanner.nextInt();
		System.out.print("Added " + item1q + "x " + item1 +"'s to your order!" + " ($" + (item1p * item1q) + ")");

		System.out.println();
		scanner.nextLine();

		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String item2 = scanner.nextLine();
		System.out.print("Price of "+ item2 +" ($): ");
		double item2p = scanner.nextDouble();
		System.out.print("How many " + item2 + "'s would you like? ");
		int item2q = scanner.nextInt();
		System.out.print("Added " + item2q + "x " + item2 +"'s to your order!" + " ($" + (item2p * item2q) + ")");

		System.out.println();
		scanner.nextLine();

		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String item3 = scanner.nextLine();
		System.out.print("Price of "+ item3 +" ($): ");
		double item3p = scanner.nextDouble();
		System.out.print("How many " + item3 + "'s would you like? ");
		int item3q = scanner.nextInt();
		System.out.print("Added " + item3q + "x " + item3 +"'s to your order!" + " ($" + (item3p * item3q) + ")");

		
		System.out.println();
		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		int tip = scanner.nextInt();

		System.out.println();

		System.out.println("=================================================");	
		System.out.println("              "+ rName +"- Menu For Today               ");
		System.out.println("=================================================");
		System.out.println("Owner: " + name);
		System.out.println("-------------------------------------------------");
		System.out.println("Item                Qty     Price");
		System.out.println("-------------------------------------------------");
		System.out.println(item1 +"                " + item1q + "     " +  item1p );
		System.out.println(item2 +"                " + item2q + "     " +  item2p );
		System.out.println(item3 +"                " + item3q + "     " +  item3p );
		System.out.println("-------------------------------------------------");
		double subtotal = (item1p * item1q) + (item2p * item2q) + (item3p * item3q);
		System.out.println("Subtotal:                " + subtotal);
		double tipdeci = tip * 0.01;
		double tipsub = subtotal * tipdeci;
		System.out.println("Tip (" + tip + "%):          " + tipsub);
		double taxsub = (0.01 * 9.75) * subtotal;
		System.out.println("Tax (9.75%):           " + taxsub);
		System.out.println("=================================================");
		System.out.println("TOTAL:                 $"  + ( subtotal + tipsub + taxsub));
		System.out.print("=================================================");
	}
}
