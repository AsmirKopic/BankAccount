import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
	Account testAccount = new Account("asmir", 1234, 1500);
	
	boolean quit=false;
	
		do {
			
		System.out.println("***Welcome to ATM ***\nPlease enter user name and 4 digit pasword.");
		Scanner input = new Scanner(System.in);
		System.out.println("Username:");
		String username= input.next();
		
		System.out.println("Password:");
		int password=input.nextInt();
		
		acces:
		if(testAccount.getUsername().equalsIgnoreCase(username) && testAccount.getPassword()==password) {
			System.out.println("Access grant!");
		} else {
			System.out.println("Wrong username or password, please try again.");
			break acces;	
		}
		
		// Code for user input and password
		// Connection to data base
		// Validation
		
		
			// Display menu
			System.out.println("Please enter your option.\n 1. Check balance status. \n 2. Deposit amount. \n 3. Withdraw amount. \n 4.Quit.");
		
			Scanner optInput = new Scanner(System.in);
			int option = optInput.nextInt();
		
			switch(option) {
			case 1: System.out.println("Balance status of your account is " + testAccount.getBalance());
				break;
			case 2: System.out.println("Deposit amount");	//deposit method
				break;
			case 3: System.out.println(" Withdraw amount");	//withdraw method
				break;
			case 4: System.out.println("Exiting system.");
				break;
			}
		
	
		
		} 
		while(!quit);
		
		
			
		
		
		
		
	}
	
	

}
