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
		showInfo(accountNumber, owner, isActive, balance);
	}

	
	public BankAccount(String m) {
		owner = m;
		balance = 0;
		accountNumber = getAccNumber();
		isActive = true;
		showInfo(accountNumber, owner, isActive, balance);
	}

	public BankAccount(){
		owner = "No Owner Set!";
		balance = 0;
		accountNumber = getAccNumber();
		isActive = true;
		showInfo(accountNumber, owner, isActive, balance);

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

		public void showInfo(int id, String owner, boolean active, double balance){
			System.out.println("Owner : " + owner);
			System.out.println("Account ID :" + id);
			System.out.println("Is Active? : " + active);
			System.out.println("Balance : " + balance);
			System.out.println("----------------------");
		}

}