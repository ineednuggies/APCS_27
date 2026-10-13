/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {

	public static void pow(int a, int b){
		int times = 1;
		int oa = a;
		while (times < b){
			a = oa*a;
			times++;
		}

		System.out.println(a);
		return;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose a number");
		int a = sc.nextInt();
		System.out.println("Choose a number");
		int b = sc.nextInt();

		System.out.println();

		pow(a, b);

		
	}
}
