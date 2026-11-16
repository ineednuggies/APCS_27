/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int rand(){
		return (int)((Math.random()*100)+1);
	}
	public static void main(String args[]) {
		// Your code goes below here
		//BaseClass test = new BaseClass();
		int min = 101;
		int max = 0;
		double avg = 0;
		double t = 0;
		int last = 0;
		int length = (int)((Math.random()*150)+51);

		int[] arr = new int[length];
		for(int check = 0; check<arr.length; check++){
			if(check>0){
				last = check-1;
			}
			arr[check] = rand();
			t = t+(arr[check]);
			System.out.print(arr[check] + ",");


			if(arr[check] < min){
				min = arr[check];
			}
			if(arr[check] > max){
					max = arr[check];
			}

		
			

		} 

			if(arr[arr.length-1] != 0){
				avg = t/length;
				System.out.println();
				System.out.println("---------------");
				System.out.println("avg is " +avg);
				System.out.println("max is "+max);
				System.out.println("min is "+min);
				System.out.println("arr length is " + length);
			}


		
	}
}
