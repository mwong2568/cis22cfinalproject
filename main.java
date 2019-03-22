package project;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// BST fill call
		philzMenu menu = new philzMenu();
		menu.fillMenu();

		// Hash table fill call (Customer/Employee information)

		// Heap fill call (Order information)

		String employeeUsername, employeePassword;
		//Put employee login into local variables(employeeUsername and employeePassword)
		//***Assuming employees all share a single login
		
		String input = "";
		String username, password;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Philz Coffee International!");
		System.out.print("To log in as a Customer, enter C. To log in as an Employee, enter E.\n");
		int index;
		

		while (!input.equals("C") && !input.equals("E")) {
			System.out.print("Enter your choice: ");
			input = in.nextLine();

			switch (input) {
			case "C":
				index = customerIndex();
				//customerPath(customerIndex, hashtable, heap, BST);
				break;
			case "E":
				boolean login = false;
				while (login != true)
				{
				System.out.print("Please enter the username:");
				username = in.nextLine();
				System.out.print("Please enter the password:");
				password = in.nextLine();
				//if (username == employeeUsername && password == employeePassword)
					//login = true;
				}
				// employeePath();
				break;
			default:
				System.out.println("Invalid key!");
				break;
			}
		}
		in.close();
	}
	
	//This function returns the index of the customer in the hash table which we will be using to 
	//keep track of the customer throughout the program.
	public static int customerIndex(/*Pass in hash table*/)
	{
		String input = "";
		Scanner in = new Scanner(System.in);
		String username, password, firstName, lastName, address, phoneNumber;
		
		while (!input.equals("L") && !input.equals("N") && !input.equals("G")) {
			System.out.print("To login, enter L. To create a new account, enter N. "
					+ "To proceed as guest, press G.\n");
			input = in.nextLine();
			switch (input) {
			case "L":
			//User Login
			boolean login = false;
			
			while (login != true) {
				System.out.print("Please enter your username:");
				username = in.nextLine();
				System.out.print("Please enter your password:");
				password = in.nextLine();
				/**
				 *Check if the customers login is correct by creating a temp Customer*
				 Customer C = new Customer(username, password, "", "","","");
				 if (hashtable.search(C) != -1) //If it matches, remember the customer and proceed to menu
				 return hashtable.search(C);
				 else
				 System.out.println("Invalid login. Please try again.");
				**/
				return 1; //temp return statement for testing
			}
			break;
			
			case "N":
				//Create a new account
				System.out.print("Please enter your desired username:");
				username = in.nextLine();
				System.out.print("Please enter your desired password:");
				password = in.nextLine();
				System.out.print("Please enter your first name:");
				firstName = in.nextLine();
				System.out.print("Please enter your last name:");
				lastName = in.nextLine();
				System.out.print("Please enter your address:");
				address = in.nextLine();
				System.out.print("Please enter your phone number(Please do not separate numbers with hyphens):");
				phoneNumber = in.nextLine();
				//Customer C = new Customer(username, password, firstName, lastName, address, phoneNumber)
				//hashtable.insert(C);
				//return hashtable.search(C);
				return 2;//temp return statement for testing
				
			case "G":
				return -1;//if guest, return -1.
				
			default:
				System.out.println("Invalid key!");
				break;
			}
		}
		in.close();
		return 0;
	}

}
