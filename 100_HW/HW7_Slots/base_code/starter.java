/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean continu = true;
		String pa = "";
		int num1, num2, num3;
		int money = 100;

		while(continu == true){
		System.out.print("How much would you like to wager (1-" + money +  ") : ");
		int wager = sc.nextInt();
		sc.nextLine();
		if (wager <= money && wager >= 1){
			money = money - wager;
			num1 = (int)(Math.random() * 15) + 1;
			num2 = (int)(Math.random() * 15) + 1;
			num3 = (int)(Math.random() * 15) + 1;
			System.out.println("Roll 1 : " + num1);
			System.out.println("Roll 2 : " + num2);
			System.out.println("Roll 3 : " + num3);
			if(num1 == num2 && num1 == num3){
				int winning = wager * 3;
				money = money + winning;
				System.out.println("You have 3 matching numbers, Your wager has tripled and you now have $" + money);
				System.out.print("Would you like to play again? (Y/N) - ");
				
			 pa = sc.nextLine();
				if(pa.equals("Yes") || pa.equals("yes") || pa.equals("Y") || pa.equals("y")){
					continu = true;
					break;
				} else if (pa.equals("No") || pa.equals("no") || pa.equals("N") || pa.equals("n")){
					continu = false;
					System.out.println("You have finished with a total of $" + money);
					break;
				}
			}
			else if(num1 == num2 || num1 == num3 || num2 == num3){
				int winning = wager * 2;
				money = money + winning;
				System.out.println("You have 2 matching numbers, Your wager has doubled and you now have $" + money);
				
				if(money != 0){
					System.out.print("Would you like to play again? (Y/N) - ");
					pa = sc.nextLine();
				}
				if(pa.equals("Yes") || pa.equals("yes") || pa.equals("Y") || pa.equals("y")){
					continu = true;
					break;
				} else if (pa.equals("No") || pa.equals("no") || pa.equals("N") || pa.equals("n")){
					continu = false;
					System.out.println("You have finished with a total of $" + money);
					break;
				}			
			} else {
				System.out.println("You lost, you now have $" + money + " remaining");
				if(money != 0){
					System.out.print("Would you like to play again? (Y/N) - ");
					pa = sc.nextLine();
				}
				
				while(money > 0){
					if(pa.equals("Yes") || pa.equals("yes") || pa.equals("Y") || pa.equals("y")){
						continu = true;
						break;
					} else if (pa.equals("No") || pa.equals("no") || pa.equals("N") || pa.equals("n")){
						continu = false;
						System.out.println("You have finished with a total of $" + money);
						break;
					}
				}

			}
		} else {
			System.out.println("Invalid Wager Ammount!");
		}

		if (money == 0){
			continu = false;
			System.out.println("you are fully out of money loser and cant play again!");
		}
		}



	}
}
