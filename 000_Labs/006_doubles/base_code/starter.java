/*
 *	Author:  Alex p
 *  Date: 9/2/26
*/
// Done , !apr req!
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your Degrees in Fahrenheit : ");
		float Fahrenheit = scanner.nextFloat();
		float Celsius = (Fahrenheit- 32) * 5 / 9;
		System.out.print("The Celsius Value for " + Fahrenheit + "° Fahrenheit is " + Celsius + "°.");

	}
}
