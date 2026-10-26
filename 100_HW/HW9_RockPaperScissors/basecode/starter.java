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

        return "invalid";

    }

    public static int compare(String a1, String b1){

        

        if(a1.equals("Rock") && b1.equals("Scissors")){
            return 1;
        }else if(a1.equals("Paper") && b1.equals("Rock")){
            return 1;
        } else if(a1.equals("Scissors") && b1.equals("Paper")){
            return 1;
        }
        if(b1.equals("Rock") && a1.equals("Scissors")){
            return 2;
        }else if(b1.equals("Paper") && a1.equals("Rock")){
            return 2;
        } else if(b1.equals("Scissors") && a1.equals("Paper")){
            return 2;
        }  else if(!a1.equals("Scissors") && !a1.equals("Paper") && !a1.equals("Rock")){
            return 0;
        }


        return 3;

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play (yes/no/done)");
        String start = sc.nextLine();
                int aipoints = 0;
                int points = 0;
                boolean continu = true;
                if(start.equals("no")){
                    continu = false;
                }
            while(start.equals("yes") && continu == true){
                String aiChose = GetObject();
                System.out.println("What Would You Like To Choose : ");
                System.out.println(" - Rock");
                System.out.println(" - Paper");
                System.out.println(" - Scissors");
                String chose = sc.nextLine();
                System.out.println("---------------");
                System.out.println("You have chosen " + chose);
                System.out.println("Your opponent has chosen " + aiChose);
                int point = compare(chose, aiChose);
                if(point == 2){
                    aipoints++;
                    System.out.println("Current Score : " + points +"-"+ aipoints);
                    System.out.println("Would you like to play another round? (y/n)");
                    String again = sc.nextLine();
                    if(again.equals("n")){
                        continu = false;
                        break;
                    }
                } else if (point == 1){
                    points++;
                    System.out.println("Current Score : " + points +"-"+ aipoints);
                                        System.out.println("Would you like to play another round? (y/n)");
                    String again = sc.nextLine();
                    if(again.equals("n")){
                        continu = false;
                        break;
                    }

                } else if (point == 0){
                    aipoints++;
                    System.out.println("Invalid input, opponenet gains a points!");
                    System.out.println("Current Score : " + points +"-"+ aipoints);
                                        System.out.println("Would you like to play another round? (y/n)");
                    String again = sc.nextLine();
                    if(again.equals("n")){
                        continu = false;
                        break;
                    }
                }
                 else {
                    System.out.println("Tie, Current Score : " + points +"-"+ aipoints);
                                        System.out.println("Would you like to play another round? (y/n)");
                    String again = sc.nextLine();
                    if(again.equals("n")){
                        continu = false;
                        break;
                    }
                 
  
                }
            }
            while(continu == false){
                System.out.println("how many times would you like the computer to play itself");
                int times = sc.nextInt();

                int played = 0;
                int play1p = 0;
                int play2p = 0;
                int playt = 0;
                while(played < times){
                    String play1 = GetObject();
                    String play2 = GetObject();
                    int compared = compare(play1, play2);
                    played++;

                    if(compared == 1){
                        play1p++;
                    } else if(compared == 2){
                        play2p++;
                    } else if(compared ==3){
                        playt++;
                    }
                }
                System.out.println("Player 1 wins: " + play1p);
                System.out.println("Player 2 wins: " + play2p);
                System.out.println("Ties: " + playt);
            }

    }
}

