/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What would you like your character to be named : ");
		//System.out.println();
		String name = scanner.nextLine();
		
		
		

		System.out.print("What will be your title  " + name + " : ");
		String title = scanner.nextLine();
		System.out.println("Would you like to be a wizard, warrior, or rogue");
		//System.out.println();

	



			//System.out.print("What is your guess? ");
			String chosen = scanner.nextLine();
			if(chosen.equals("Wizard") || chosen.equals("wizard")){
				System.out.println("You have chosen to be a wizard");
			} else if(chosen.equals("warrior") || chosen.equals("Warrior")){
				System.out.println("You have chosen to be a warrior");
			} else if(chosen.equals("rogue") || chosen.equals("Rogue")){
				System.out.println("You have chosen to be a rogue");
			} else {
				System.out.println("that is not an option you chud");
			}

			
			int sp = 20;
			int osp = sp;
			System.out.println("YOU CURRENTLY HAVE 20 STAT POINTS (SP) TO SPEND ON THE FOLLOWING : ");
			System.out.print("Strength - Be buff and be able to carry larger objects. (0-20) - ");
			int strength = scanner.nextInt();
			if (strength <= sp){
				osp = sp;
				sp = sp - strength;
			} else {
				System.out.println("Invalid Ammount. value [strength] exceeds the ammount of SP you currently have | Auto Set to 0");
				strength = 0;
				sp = osp;
			}
			System.out.println("You currently have " + sp + " SP left");

			System.out.print("Dexterity - Agile and moves quick. (0-"+ sp +") - ");
			int Dexterity = scanner.nextInt();
			if (Dexterity <= sp){
				osp = sp;
				sp = sp - Dexterity;
			} else {
				System.out.println("Invalid Ammount. value [dexterity] exceeds the ammount of SP you currently have | Auto Set to 0");
				Dexterity = 0;
				sp = osp;
			}
			System.out.println("You currently have " + sp + " SP left");

			System.out.print("Intelligence - Better at magic spells. (0-"+ sp +") - ");
			int Intelligence = scanner.nextInt();
			if (Intelligence <= sp){
				osp = sp;
				sp = sp - Intelligence;
			} else {
				System.out.println("Invalid Ammount. value [intelligence] exceeds the ammount of SP you currently have | Auto Set to 0");
				Intelligence = 0;
				sp = osp;
			}
			System.out.println("You currently have " + sp + " SP left");

			System.out.print("Charisma - How personable. (0-"+ sp +") - ");
			int charisma = scanner.nextInt();
			if (charisma <= sp){
				osp = sp;
				sp = sp - charisma;
			} else {
				System.out.println("Invalid Ammount. value [charisma] exceeds the ammount of SP you currently have | Auto Set to 0");
				charisma = 0;
				sp = osp;
			}
			System.out.println("You finished setting your stats with " + sp + " SP leftover");
			System.out.println("Welcome " + name + " " +title + ". You are a " + chosen + " , Your stats are | " + strength + " Strength | " + Dexterity + " Dexterity | " + Intelligence + " Intelligence | " + charisma + " Charisma ");


	}
}
