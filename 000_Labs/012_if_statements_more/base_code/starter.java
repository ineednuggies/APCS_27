/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number : ");
		int one = sc.nextInt();
		System.out.println("enter 2nd number : ");
		int two = sc.nextInt();

		if(one!=two){
			System.out.println("values are diff");
		} else { 
			System.out.println("values are same");
		}
	}
}
