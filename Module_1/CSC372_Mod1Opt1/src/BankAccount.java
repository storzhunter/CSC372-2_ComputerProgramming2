
public class BankAccount {
	protected String firstName;
	protected String lastName;
	protected int    accountID;
	protected double balance;
	
	public void constructor() {
		balance = 0;
	}
	
	public void deposit (double addAmount) {
		balance = balance + addAmount;
		System.out.printf("You have deposited $%.2f.\n", addAmount);
		System.out.printf("Your new balance is $%.2f.\n", balance);
	}
	
	public void withdrawal (double subAmount) {
		if (balance <= subAmount) {
			System.out.println("Insufficient funds");
		}
		else {
			balance = balance - subAmount;
			System.out.printf("You have withdrawn $%.2f.\n", subAmount);
			System.out.printf("Your remaining balance is $%.2f.\n", balance);
		}
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName (String newLastName) {
		lastName = newLastName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public void setAccountID(int newAccountID) {
		accountID = newAccountID;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	public void accountSummary() {
		System.out.println("\nName: " + firstName + " " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.printf("Balance: $%.2f\n", balance);
	}
	
	
}
