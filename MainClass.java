package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * MainClass serves as the entry point for the program.
 * It demonstrates creating different student types (Freshman and Senior)
 * and handling their specific properties.
 *
 * Author: Moaath Alrajab
 */
public class MainClass {

	public static void main(String[] args) {
		// Creating Student instances to test the functionality:
		Student.Freshman std1 = new Student.Freshman("James", 20, 12); // name, age, credits
		Student.Senior std2 = new Student.Senior("John", 30, 90);

		// Using Scanner to set the GPA for both students
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter GPA for Freshman (James): ");
			double gpa1 = scanner.nextDouble();
			std1.setGpa(gpa1);

			System.out.print("Enter GPA for Senior (John): ");
			double gpa2 = scanner.nextDouble();
			std2.setGpa(gpa2);
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter a valid GPA.");
		} finally {
			// Close the scanner
			scanner.close();
		}

		// Printing out the details
		System.out.println(std1);
		System.out.println(std2);
	}
}
