/*
 *	Author:
 *  Date:
*/
		

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number and we'll print out every prime until that number: ");
		int number = sc.nextInt();
		System.out.println();
		printPrimes(number);


		
	}

	public static boolean checkPrime(int num){
				int check = 2;
				if(num <= 1){
					return false;
				} else{
				while (check <= num /2){
					if(num%check==0){
						return false;	
					}
					check++;
				}
				}
				return true;
	}

	 public static void printPrimes(int num){
	 	int check = num;
		while(check > 1){
			boolean isp = checkPrime(check);
			if(isp == true){
				System.out.println(check);
			}
			check--;
		}
	 }
}
