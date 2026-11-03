/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog one = new Dog("Bob", 3);
		Dog two = new Dog("Bobbie", "Golden Retriever");

		boolean oneasleep = one.isSleeping();
		boolean twoasleep = two.isSleeping();

		if (oneasleep == true){
			one.asleep();
		} else { 
			one.bark();
		}

		if (twoasleep == true && oneasleep == false){
			two.bark();
		} else if(twoasleep = false && oneasleep == false){
			two.bark();
		}
	


	}
}
