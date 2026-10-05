/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose any number : ");
        int num = sc.nextInt();

        int multi = 1;
        int num2 = num;

        for (; num2 <= (num * 9); multi++){
            num2 = num*multi;
            System.out.println(num2);
        }
    }
}
