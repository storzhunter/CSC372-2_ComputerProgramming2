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
		
		String transaction;
		double deposit;
		double withdrawal;
		
		System.out.println("Open a bank account.");
		newBankAccount = new BankAccount();
		
		System.out.print("Enter first Name: ");
		userFirstName = scnr.next();
		newBankAccount.setFirstName(userFirstName);
		
		System.out.println("\nYou entered " + newBankAccount.getFirstName());
		System.out.println();
		
		System.out.print("Enter last Name: ");
		userLastName = scnr.next();
		newBankAccount.setLastName(userLastName);
		
		System.out.println("\nYou entered " + newBankAccount.getLastName());
		System.out.println();
		
		System.out.print("Enter account ID: ");
		userAccountID = scnr.nextInt();
		newBankAccount.setAccountID(userAccountID);
		
		System.out.println("\nYou entered: " + newBankAccount.getAccountID());
		System.out.println();
		
		System.out.println("Enter \"withdraw\" to make a withdrawal.");
		System.out.println("Enter \"deposit\" to make a deposit.");
		System.out.println("Enter \"done\" to exit.");
		
		System.out.print("What would you like to do? ");
		transaction = scnr.next().toLowerCase();
		
		while (!transaction.equals("done")) {
			
			if (transaction.equals("withdraw")) {
				System.out.print("\nHow much would you like to withdraw? ");
				withdrawal = scnr.nextDouble();
				newBankAccount.withdrawal(withdrawal);
			}
			
			else if (transaction.equals("deposit")) {
				System.out.print("\nHow much would you like to deposit? ");
				deposit = scnr.nextDouble();
				newBankAccount.deposit(deposit);
			} else {
				System.out.println("Invalid entry. please enter \"withdraw\", \"deposit\", or \"done\".");
			}
			
			System.out.print("\nWhat would you like to do? ");
			transaction = scnr.next().toLowerCase();
			System.out.println();
		}
		
		newBankAccount.accountSummary();
		
		System.out.println("\nOpen a checking account.");
		newCheckAccount = new CheckingAccount();
		
		System.out.print("Enter first Name: ");
		userFirstName = scnr.next();
		newCheckAccount.setFirstName(userFirstName);
		
		System.out.println("\nYou entered " + newCheckAccount.getFirstName());
		System.out.println();
		
		System.out.print("Enter last Name: ");
		userLastName = scnr.next();
		newCheckAccount.setLastName(userLastName);
		
		System.out.println("\nYou entered " + newCheckAccount.getLastName());
		System.out.println();
		
		System.out.print("Enter account ID: ");
		userAccountID = scnr.nextInt();
		newCheckAccount.setAccountID(userAccountID);
		
		System.out.println("\nYou entered: " + newCheckAccount.getAccountID());
		System.out.println();
		
		System.out.println("Enter \"withdraw\" to make a withdrawal.");
		System.out.println("Enter \"deposit\" to make a deposit.");
		System.out.println("Enter \"done\" to exit.");
		
		System.out.print("What would you like to do? ");
		transaction = scnr.next().toLowerCase();
		
		while (!transaction.equals("done")) {
			
			if (transaction.equals("withdraw")) {
				System.out.print("\nHow much would you like to withdraw? ");
				withdrawal = scnr.nextDouble();
				newCheckAccount.withdrawal(withdrawal);
			}
			
			else if (transaction.equals("deposit")) {
				System.out.print("\nHow much would you like to deposit? ");
				deposit = scnr.nextDouble();
				newCheckAccount.deposit(deposit);
			} else {
				System.out.println("Invalid entry. please enter \"withdraw\", \"deposit\", or \"done\".");
			}
			
			System.out.print("\nWhat would you like to do? ");
			transaction = scnr.next().toLowerCase();
			System.out.println();
		}
		
		newCheckAccount.accountSummary();
		
		

		scnr.close();

	}

}
