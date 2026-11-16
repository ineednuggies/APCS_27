/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static int rand(){
		return (int)((Math.random()*10)+1);
	}
	public static void main(String args[]) {
		int[] arr = new int[21];
		int last=0;
		int count = 0;
		int target = rand();


		for(int check = 0; check < arr.length; check++){
			if(check>0){
				last = check-1;
			}
			
			arr[check] = rand();
			int num = arr[check];
			if(num == target){
				count++;
				System.out.println("Index #" + check + " has the same value as the Target Value which is " + target);
			}
			if(arr[last] == arr[check]){
				System.out.println("Index #" + last + " has the same value as Index #" + check +" which is a value of " + arr[check]);
			}

		}

	}
}
