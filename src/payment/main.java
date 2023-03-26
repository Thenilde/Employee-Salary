package payment;

import java.util.Scanner;

import entite.employee;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		employee emp = new employee();

		System.out.println("--------------------------------------------------------");
		System.out.println("---------------Welcome to the Salary sistem-------------");
		System.out.println("--------------------------------------------------------");

		System.out.print("Name: ");
		emp.name = sc.nextLine();

		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
		} 
		}
