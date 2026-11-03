package pkg;
import java.util.Scanner;
import java.util.Random;



public class Dog {
	String name;
	int age;
	String breed;
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String Name) {
		name = Name;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String Name, String Breed) {
		name = Name;
		age = 1;
		breed = Breed;
	}
	public Dog(String Name, int Age) {
		name = Name;
		age = Age;
		breed = "dog dog";
	}

	public void setName(String Name){
		name = Name;
	}
	public void setBreed(String Breed){
		breed = Breed;
	}
	public void setAge(int Age){
		age = Age;
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}

	public void bark(){
		System.out.println(name + ": Woof Woof!");
	}
	public void asleep(){
		System.out.println(name + " is sleeping, SHHHHh!");
	}

	public boolean isSleeping(){
		int random = (int)(Math.random() * 2);
		if (random == 1){
			return true;
		} else {
			return false;

		}
	}



}
