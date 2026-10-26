/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee DS = new Employee(1987, "Dwight", "Schrute", 4416.66);
		DS.employeeToString();
		Employee JH = new Employee(2474, "Jim", "Halpert", 4416.66);
		JH.employeeToString();
		Employee PB = new Employee(2011, "Pam", "Beesly", 2250);
		PB.employeeToString();
		Employee JD = new Employee(2010, "John", "Doe", 1);
		JD.employeeToString();

		DS.raiseSalary(50);
		JH.raiseSalary(50);
		PB.raiseSalary(50);
		JD.raiseSalary(50);

		System.out.println(DS.getSalary());
		System.out.println(DS.getAnnualSalary());
		System.out.println(JH.getSalary());
		System.out.println(JH.getAnnualSalary());
		System.out.println(PB.getSalary());
		System.out.println(PB.getAnnualSalary());
		System.out.println(JD.getSalary());
		System.out.println(JD.getAnnualSalary());
		
	}
}
