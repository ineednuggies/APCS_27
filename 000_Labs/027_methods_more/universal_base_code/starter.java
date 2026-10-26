/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to ATM!");
		System.out.println("--------------------");
		System.out.println("Would You like to : ");
		System.out.println("1 - make a bank account with no info?");
		System.out.println("2 - Create an empty bank account with a name?");
		System.out.println("3 - Create a bank account with a name and an initial deposit?");
		System.out.print("What is your choice? : ");

		int choice = sc.nextInt();
		sc.nextLine();

		if(choice == 1){
			BankAccount x = new BankAccount();
		} else if(choice == 2){
			System.out.println("What is the name under the bank account?");
			String name = sc.nextLine();
			BankAccount x = new BankAccount(name);
		} else if(choice == 3){
			System.out.println("What is the name under the bank account?");
			String name = sc.nextLine();
			System.out.print("How much would you like to deposit? : ");
			double deposit = sc.nextDouble();
			BankAccount x = new BankAccount(name, deposit);
		}








		
	}
}
