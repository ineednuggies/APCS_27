package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String Actor;		// What's the actors name?
	int Age;			// What's the age of the actor?
	String Villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge

	public Spiderman(){
		Actor = "Unknown";
		Age = 0;
		Villain = "Unknown";
	}

	public Spiderman(String actor){
		Actor = actor;
		Age = 0;
		Villain = "Unknown";
	}
	public Spiderman(String actor, int age){
		Actor = actor;
		Age = age;
		Villain = "Unknown";
	}
	public Spiderman(String actor, int age, String villain){
		Actor = actor;
		Age = age;
		Villain = villain;
	}

	public Spiderman(int age){
		Actor = "Unknown";
		Age = age;
		Villain = "Unknown";
	}
	
	public String getActor(){
		return Actor;
	}
	public int GetAge(){
		return Age;
	}
	public String getVillain(){
		return Villain;
	}
	public void setActor(String actor){
		Actor = actor;
	}
	public void setAge(int age){
		Age = age;
	}
	public void setVillain(String villain){
		Villain = villain;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + Villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
