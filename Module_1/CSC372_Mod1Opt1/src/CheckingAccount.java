
public class CheckingAccount extends BankAccount {
	double interestRate;
	
	public CheckingAccount() {
		interestRate = 0.0;
	}
	
	public void setInterestRate(double rate) {
		interestRate = rate;
		System.out.printf("Iterest rate set to %.2f%%.\n", interestRate);
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	@Override
	public void withdrawal(double subAmount) {
		balance = balance - subAmount;
		if (balance < 0) {
			balance = balance - 30.00;
			System.out.println("Account overdrawn! You have been charged a $30 overdraft fee.");
			System.out.printf("Your new balance is $%.2f.", balance);
		} else {
			System.out.printf("You have withdrawn $%.2f.\n", subAmount);
			System.out.printf("Your remaining balance is $%.2f.\n", balance);
		}
	}
	
	@Override
	public void deposit(double addAmount) {
		balance = balance + addAmount;
		System.out.printf("You have deposited $%.2f.\n", addAmount);
		System.out.printf("Your new balance is $%.2f.", balance);
	}
	
	@Override
	public void accountSummary() {
		super.accountSummary();
		System.out.printf("Interest rate: %.2f%%", interestRate);
	}
	

}
