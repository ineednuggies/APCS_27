/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;


public class BankAccount {
	// -------GLOBAL VARIABLES-------

	String owner;

	static int startingaccountNumber = (int)((Math.random()*1000)+50);
	boolean sanTaken;
	int accountNumber;
	private static int nextaccountNumber;
	double balance;
	boolean isActive;
	static List<Integer> nums = new ArrayList<>();

	// -------CONSTRUCTORS-------

	public BankAccount(String m, double c) {
		owner = m;
		balance = c;
		accountNumber = getAccNumber();
		isActive = true;
		
	}

	
	public BankAccount(String m) {
		owner = m;
		balance = 0;
		accountNumber = getAccNumber();
		isActive = true;
		
	}

	public BankAccount(){
		owner = "No Owner Set!";
		balance = 0;
		accountNumber = getAccNumber();
		isActive = true;
		

	}

	

	// -------METHODS-------

		public int getAccNumber(){
		if(nums.isEmpty()){
			
			nextaccountNumber = (int)((Math.random() * 1000) + 50);
		

		}
		 else {
			
			nextaccountNumber++;
	
			
		} 
		nums.add(nextaccountNumber);
		return nextaccountNumber;
	}

		public void displayAccountInfo(){
			System.out.println("Owner : " + owner);
			System.out.println("Account ID :" + accountNumber);
			System.out.println("Is Active? : " + isActive);
			System.out.println("Balance : " + balance);
			System.out.println("----------------------");
		}

		public void checkBalance(){
			System.out.println("Current Balance : " + balance);
			System.out.println("----------------------------");
		}



		public String getOwner(){
			return owner;
		}
		public void setOwner(String a){
			owner = a;
		}
		public double getBalance(){
			return balance;
		}
		public void closeAccount(){
			isActive = false;
		}
		public double deposit(double a){
			return balance += a;
		}
		public double withdraw(double a){
			return balance -= a;
		}
}