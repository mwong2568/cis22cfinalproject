package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice;
		String username, password, firstName, lastName, address, phoneNumber;

		// BST fill call
		philzMenu menu = new philzMenu();
		menu.fillMenu();

		// Hash table fill call (Customer/Employee information)

		// Heap fill call (Order information)

		String employeeUsername = "";
		String employeePassword = "";
		try {
			Scanner x = new Scanner(new File("employeelogin.txt"));

			employeeUsername = x.nextLine();
			employeePassword = x.nextLine();

			x.close();
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find the file.");
		}

		// Put employee login into local variables(employeeUsername and
		// employeePassword)
		// ***Assuming employees all share a single login
		System.out.println(employeeUsername);
		System.out.println(employeePassword);

		System.out.println("Welcome to the Philz Coffee Storefront.\n");
		System.out.print("Press C to login as a customer or E to login as employee: ");

		choice = input.nextLine();
		// Character.toUpperCase(choice);

		// Allow user to keep entering a choice until input is valid
		if (!choice.equals("C") && !choice.equals("E")) {
			System.out.println("User choice was not a valid option. " + "Enter C or E only.");

			System.out.print("Enter your choice: ");
			choice = input.nextLine();

			while (!choice.equals("C") && !choice.equals("E")) {
				System.out.println("\nUser choice was not a valid option. " + "Enter C or E only.");
				System.out.print("Enter your choice: ");
				choice = input.nextLine();

				// Character.toUpperCase(choice);
			}
		}

		// If user chooses to login as customer, display customer options
		if (choice.equals("C")) {
			String option;

			System.out.println("\n-Press '1' to enter account details to login.");
			System.out.println("-Press '2' to create a new account.");
			System.out.println("-Press '3' to login as guest");
			System.out.print("\nOption: ");
			option = input.nextLine();

			if (!option.equals("1") && !option.equals("2") && !option.equals("3")) {
				System.out.println("User choice was not a valid option. " + "Enter 1, 2, or 3 only.");

				System.out.print("Enter your choice: ");
				option = input.nextLine();

				while (!option.equals("1") && !option.equals("2") && !option.equals("3")) {
					System.out.println("\nUser choice was not a valid option. " + "Enter 1, 2, or 3 only.");
					System.out.print("Enter your choice: ");
					option = input.nextLine();

					// Character.toUpperCase(choice);
				}
			}

			switch (option) { // Customer enters login details
			case "1":
				boolean login = false;

				while (login != true) {
					System.out.print("Please enter your username:");
					username = input.nextLine();
					System.out.print("Please enter your password:");
					password = input.nextLine();
					/**
					 * Check if the customers login is correct by creating a temp Customer* Customer
					 * C = new Customer(username, password, "", "","",""); if (hashtable.search(C)
					 * != -1) //If it matches, remember the customer and proceed to menu return
					 * hashtable.search(C); else System.out.println("Invalid login. Please try
					 * again.");
					 **/
				}

				// if verified, print message
				System.out.println("Login successful!");

				// else continue asking for account details until user inputs valid info
				break;

			case "2":
				System.out.print("Please enter your desired username: ");
				username = input.nextLine();

				System.out.print("Please enter your desired password: ");
				password = input.nextLine();

				System.out.print("Please enter your first name:");
				firstName = input.nextLine();

				System.out.print("Please enter your last name:");
				lastName = input.nextLine();

				System.out.print("Please enter your address:");
				address = input.nextLine();

				System.out.print("Please enter your phone number(Please do not separate numbers with hyphens):");
				phoneNumber = input.nextLine();
				// Write account details to account text file
				// Customer C = new Customer(username, password, firstName, lastName, address,
				// phoneNumber)
				// hashtable.insert(C);
				break;

			case "3":
				System.out.println("Logging in as guest!");
				break;

			}

			// Display menu options for customer
			do {
				System.out.println("Choose from the following options.\n");
				System.out.println("-Press 'S' to search for a product");
				System.out.println("-Press 'L' to list the product database");
				System.out.println("-Press 'P' to place an order");
				System.out.println("-Press 'V' to view purchases");
				System.out.println("-Press 'Q' to quit the program");

				System.out.print("\nUser choice: ");
				choice = input.nextLine();

				// Allow user to keep entering a choice until input is valid
				if (!choice.equals("S") && !choice.equals("L") && !choice.equals("P") && !choice.equals("V")
						&& !choice.equals("Q")) {
					System.out.println("\nUser choice was not a valid option. " + "Enter S, L, P, V, or Q only.");

					System.out.print("Enter your choice: ");
					choice = input.nextLine();

					while (!choice.equals("S") && !choice.equals("L") && !choice.equals("P") && !choice.equals("V")
							&& !choice.equals("Q")) {
						System.out.println("\nUser choice was not a valid option. " + "Enter S, L, P, V, or Q only.");
						System.out.print("Enter your choice: ");
						choice = input.nextLine();

					}
				}
				// Perform action based on user's choice
				switch (choice) {
				case "S":
					break;

				case "L":
					break;

				case "P":
					break;

				case "V":
					break;

				case "Q":
					System.out.print("\nExiting application. Goodbye!");
					System.exit(0);
					break;
				}

			} while (choice.equals("S") || choice.equals("L") || choice.equals("P") || choice.equals("V"));
		}

		// If user chooses to login as employee, display employee options
		if (choice.equals("E")) {

			boolean login = false;
			System.out.print("Please enter the username:");
			username = input.nextLine();
			System.out.print("Please enter the password:");
			password = input.nextLine();

			while (login != true) {
				if (username.equals(employeeUsername) && password.equals(employeePassword))
					login = true;
				else {
					System.out.println("Incorrect login.");
					System.out.print("Please enter the username:");
					username = input.nextLine();
					System.out.print("Please enter the password:");
					password = input.nextLine();
				}
			}

			// Verify login details

			// if verified, print message
			System.out.println("Login successful!");

			// else continue asking for account details until user inputs valid info

			// Display menu options for customer
			do {
				System.out.println("Choose from the following options.\n");
				System.out.println("-Press 'S' to search for a customer by name");
				System.out.println("-Press 'D' to display unsorted customer information");
				System.out.println("-Press 'V' to view orders by priority");
				System.out.println("-Press 'O' to ship an order");
				System.out.println("-Press 'L' to list the product database");
				System.out.println("-Press 'A' to add a new product");
				System.out.println("-Press 'R' to remove a product");
				System.out.println("-Press 'Q' to quit the program");

				System.out.print("\nUser choice: ");
				choice = input.nextLine();

				// Allow user to keep entering a choice until input is valid
				if (!choice.equals("S") && !choice.equals("D") && !choice.equals("V") && !choice.equals("O")
						&& !choice.equals("L") && !choice.equals("A") && !choice.equals("R") && !choice.equals("Q")) {
					System.out.println(
							"\nUser choice was not a valid option. " + "Enter S, D, V, O, L, A, R, or Q only.");

					System.out.print("Enter your choice: ");
					choice = input.nextLine();

					while (!choice.equals("S") && !choice.equals("D") && !choice.equals("V") && !choice.equals("O")
							&& !choice.equals("L") && !choice.equals("A") && !choice.equals("R")
							&& !choice.equals("Q")) {
						System.out.println(
								"\nUser choice was not a valid option. " + "Enter S, D, V, O, L, A, R, or Q only.");
						System.out.print("Enter your choice: ");
						choice = input.nextLine();

					}
				}
				// Perform action based on user's choice
				switch (choice) {
				case "S":
					break;

				case "D":
					break;

				case "V":
					break;

				case "O":
					break;

				case "L":
					break;

				case "A":
					break;

				case "R":
					break;

				case "Q":
					System.out.print("\nExiting application. Goodbye!");
					System.exit(0);
					break;
				}

			} while (choice.equals("S") || choice.equals("D") || choice.equals("V") || choice.equals("O")
					|| choice.equals("L") || choice.equals("A") || choice.equals("R") || choice.equals("Q"));
		}

		input.close();

	}

}
