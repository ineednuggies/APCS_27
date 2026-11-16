/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[] arr = new int[1001];
		 arr[0] = 3;
		 
		int r = 0;
		while(r < 1001){
			int last = arr[r];
			System.out.println(arr[r]);
			r++;
			if(arr[1000] == 0){
				arr[r] = last+3;
			}
			
			
		}

		int[] arr2 = new int[1001];
		arr2[0] = 1000;

		int r2 = 0;
		while(r2 <1001){
			int last2 = arr2[r2];
			System.out.println(arr2[r2]);
			r2++;
			if(arr2[1000] == 0){
				arr2[r2] = last2-1;
			}
			
		}

	}
}
