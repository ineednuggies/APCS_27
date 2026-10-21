/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String GetObject(){
        int num = (int)(Math.random()*3)+1;
        if(num == 1){
            return "Rock";
        } else if(num == 2){
            return "Paper";
        } else if(num == 3){
            return "Scissors";
        }
    }

    public static String compare2(String a1, String b1, String a2, String b2){
        if(a1.equals("Rock") && b1.equals("Scissors")){
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play (y/n)");
        String start = sc.nextLine();
            while(true){
                
            }

    }
}
