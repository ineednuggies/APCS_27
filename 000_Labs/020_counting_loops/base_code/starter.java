/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("whats your name");
		String name = sc.nextLine();
		System.out.println("How many time you want to print your name");
		int num = sc.nextInt();
		int x = 0;

		while( x < num){
			x = x + 1;
			System.out.println(name);
			if(x == num){
				break;
			}
		}



		
	}
}
