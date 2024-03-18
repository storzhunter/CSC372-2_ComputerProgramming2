public class BankAccount {
	protected String firstName;
	protected String lastName;
	protected int    accountID;
	protected double balance;
	
	public BankAccount() {
		balance = 0;
	}
	
	public void deposit (double addAmount) {
		balance = balance + addAmount;
	}
	
	public void withdrawal (double subAmount) {
		balance = balance - subAmount;
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
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public double getBalance() {
		return balance;
	}
}