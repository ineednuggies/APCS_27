/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first int");
		int one = sc.nextInt();
		System.out.println("Enter your 2nd int");
		int two = sc.nextInt();
		System.out.println("Enter your 3rd int");
		int tree = sc.nextInt();

		if(one > two && one > tree){
			System.out.println(one + " is the largest integer");
		} else if(two > tree && two > one){
			System.out.println(two + " is the largest integer");
		} else if (tree > two && tree > one){
			System.out.println(tree + " is the largest integer");
		}

		if(one < two && one < tree){
			System.out.println(one + " is the smallest integer");
		} else if(two < tree && two < one){
			System.out.println(two + " is the smallest integer");
		} else if (tree < two && tree < one){
			System.out.println(tree + " is the smallest integer");
		}
	}
}
