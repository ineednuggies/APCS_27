/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter an integer : ");
		int int1 = scanner.nextInt();
		System.out.print("Please enter another integer : ");
		int int2 = scanner.nextInt();

		System.out.println();

		if (int1 % 2 == 0){
			System.out.println(int1 + " is an even number");
		} else if(int1 % 2 != 0){
			System.out.println(int1 + " is an odd number");
		}


		if (int2 % 2 == 0){
			System.out.println(int2 + " is an even number");
		} else if(int2 % 2 != 0){
			System.out.println(int2 + " is an odd number");
		}

		System.out.println();

		//scanner.nextLine();
		scanner.nextLine();

		if (int1 % 3 == 0){
			System.out.println(int1 + " is divisible by 3!");
		} else if(int1 % 3 != 0){
			System.out.println(int1 + " is not divisible by 3!");
		}
		if (int1 % 4 == 0){
			System.out.println(int1 + " is divisible by 4!");
		} else if(int1 % 4 != 0){
			System.out.println(int1 + " is not divisible by 4!");
		}
		if (int1 % 5 == 0){
			System.out.println(int1 + " is divisible by 5!");
		} else if(int1 % 5 != 0){
			System.out.println(int1 + " is not divisible by 5!");
		}


		System.out.println();


		
		if(int2 % 3 != 0 && int2 % 4 != 0 && int2 % 5 != 0){
			System.out.println( int2 + " is not divisible by 3, 4, or 5!");
		}
		else if (int2 % 3 == 0){
			System.out.println(int2 + " is divisible by 3!");
			if (int2 % 4 == 0){
				System.out.println(int2 + " is divisible by 4!");
				if (int2 % 5 == 0){
					System.out.println(int2 + " is divisible by 5!");
				} else if(int2 % 5 != 0){
					System.out.println(int2 + " is not divisible by 5!");
				}
			} else if(int2 % 4 != 0){
				System.out.println(int2 + " is not divisible by 4!");
			}
		} else if(int2 % 3 != 0){
			System.out.println(int2 + " is not divisible by 3!");
						if (int2 % 4 == 0){
				System.out.println(int2 + " is divisible by 4!");
				if (int2 % 5 == 0){
					System.out.println(int2 + " is divisible by 5!");
				} else if(int2 % 5 != 0){
					System.out.println(int2 + " is not divisible by 5!");
				}
			} else if(int2 % 4 != 0){
				System.out.println(int2 + " is not divisible by 4!");
			}
	}

		

	}
}
