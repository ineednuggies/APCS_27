/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {


	public static void print(String a){
		System.out.println(a);
		return;
	}

	public static void combine(String a, String b){
		System.out.println(a + " " + b);
		return;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence");
		String sent1 = sc.nextLine();
		System.out.println("Write a sentence");
		String sent2 = sc.nextLine();

		print(sent1);
		combine(sent1, sent2);

		
	}
}
