/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {

	public static boolean isLeapYear(int year){
		if(year % 4 == 0){
			return true;
		} else {
			return false;
		}
	}

	public static int getDigitSum(int a){
    int one = a % 10;
    int left = a / 10;
    int two = left % 10;
    int left2 = left / 10;
    int three = left2 % 10;
    int left3 = left2 / 10;
    int four = left3 % 10;
    int five = left3 / 10;
	int total = one + two + three + four + five;
	return total;
	}

	public static void printIfConsecutive(int a, int b, int c){
		if((a - b == 1 || a - b == -1) && (a - c == -2 || a - c == 2)){
			System.out.println("they are consecutive");
		} else {
			System.out.println("they arent consecutive");
		}
	}
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
