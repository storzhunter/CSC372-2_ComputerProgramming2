import java.util.Scanner;

public class BankTest {
// This class is to test the different methods of the superclass BankAccount and its subclass CheckingAccount.
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		BankAccount newBankAccount;
		CheckingAccount newCheckAccount;
		
		String userFirstName;
		String userLastName;
		int    userAccountID;
		double interestRate;
		
		String transaction;
		double deposit;
		double withdrawal;
		
		//Creates a new BankAccount object
		System.out.println("Open a bank account.");
		newBankAccount = new BankAccount();
		
		//Sets first name
		System.out.print("Enter first Name: ");
		userFirstName = scnr.next();
		newBankAccount.setFirstName(userFirstName);
		
		//Gets first name
		System.out.println("\nYou entered " + newBankAccount.getFirstName());
		System.out.println();
		
		//Sets last name
		System.out.print("Enter last Name: ");
		userLastName = scnr.next();
		newBankAccount.setLastName(userLastName);
		
		//Gets last name
		System.out.println("\nYou entered " + newBankAccount.getLastName());
		System.out.println();
		
		//Sets account ID
		System.out.print("Enter account ID: ");
		userAccountID = scnr.nextInt();
		newBankAccount.setAccountID(userAccountID);
		
		//Gets account ID
		System.out.println("\nYou entered: " + newBankAccount.getAccountID());
		System.out.println();
		
		//Prompts user to enter a command
		System.out.println("Enter \"withdraw\" to make a withdrawal.");
		System.out.println("Enter \"deposit\" to make a deposit.");
		System.out.println("Enter \"done\" to exit.");
		
		//Takes user command
		System.out.print("What would you like to do? ");
		transaction = scnr.next().toLowerCase();
		
		while (!transaction.equals("done")) {
			
			//Takes withdrawal amount and subtracts that amount from the account balance
			if (transaction.equals("withdraw")) {
				System.out.print("\nHow much would you like to withdraw? ");
				withdrawal = scnr.nextDouble();
				newBankAccount.withdrawal(withdrawal);
			}
			
			//Takes deposit amount and adds that amount to the account balance
			else if (transaction.equals("deposit")) {
				System.out.print("\nHow much would you like to deposit? ");
				deposit = scnr.nextDouble();
				newBankAccount.deposit(deposit);
			}
			
			//Handles invalid user commands by printing a message for the user
			else {
				System.out.println("Invalid entry. please enter \"withdraw\", \"deposit\", or \"done\".");
			}
			
			//Takes new user command
			System.out.print("\nWhat would you like to do? ");
			transaction = scnr.next().toLowerCase();
			System.out.println();
		}
		
		//Prints account owner name, account ID, and account balance
		newBankAccount.accountSummary();
		
		//Creates a new CheckingAccount object
		System.out.println("\nOpen a checking account.");
		newCheckAccount = new CheckingAccount();
		
		//Sets first name
		System.out.print("Enter first Name: ");
		userFirstName = scnr.next();
		newCheckAccount.setFirstName(userFirstName);
		
		//Gets first name
		System.out.println("\nYou entered " + newCheckAccount.getFirstName());
		System.out.println();
		
		//Sets last name
		System.out.print("Enter last Name: ");
		userLastName = scnr.next();
		newCheckAccount.setLastName(userLastName);
		
		//Gets last name
		System.out.println("\nYou entered " + newCheckAccount.getLastName());
		System.out.println();
		
		//Sets account ID
		System.out.print("Enter account ID: ");
		userAccountID = scnr.nextInt();
		newCheckAccount.setAccountID(userAccountID);
		
		//Gets account ID
		System.out.println("\nYou entered: " + newCheckAccount.getAccountID());
		System.out.println();
		
		//Sets interest rate
		System.out.print("Enter interest rate: ");
		interestRate = scnr.nextDouble();
		newCheckAccount.setInterestRate(interestRate);
		
		//Gets interest rate
		System.out.printf("\nYou entered: %.2f%%\n", newCheckAccount.getInterestRate());
		System.out.println();
		
		
		//Prompts user to enter a command
		System.out.println("Enter \"withdraw\" to make a withdrawal.");
		System.out.println("Enter \"deposit\" to make a deposit.");
		System.out.println("Enter \"done\" to exit.");
		
		//Takes user command
		System.out.print("What would you like to do? ");
		transaction = scnr.next().toLowerCase();
		
		while (!transaction.equals("done")) {
			
			//Takes withdrawal amount and subtracts that amount from the account balance
			if (transaction.equals("withdraw")) {
				System.out.print("\nHow much would you like to withdraw? ");
				withdrawal = scnr.nextDouble();
				newCheckAccount.withdrawal(withdrawal);
			}
			
			//Takes deposit amount and adds that amount to the account balance
			else if (transaction.equals("deposit")) {
				System.out.print("\nHow much would you like to deposit? ");
				deposit = scnr.nextDouble();
				newCheckAccount.deposit(deposit);
			}
			
			//Handles invalid user commands by printing a message for the user
			else {
				System.out.println("Invalid entry. please enter \"withdraw\", \"deposit\", or \"done\".");
			}
			
			//Calculates interest earned and gets the interest earned
			newCheckAccount.calcInterestEarned();
			System.out.printf("interest earned: $%.2f\n", newCheckAccount.getInterestEarned());
			
			//Takes new user command
			System.out.print("\nWhat would you like to do? ");
			transaction = scnr.next().toLowerCase();
			System.out.println();
		}
		
		//Prints account owner name, account ID, account balance, and the interest rate for the account
		newCheckAccount.accountSummary();
		
		

		scnr.close();

	}

}
