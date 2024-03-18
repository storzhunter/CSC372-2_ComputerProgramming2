
public class CheckingAccount extends BankAccount {
	double interestRate;
	double interestEarned;
	
	public CheckingAccount() {
		interestRate = 0.0;
	}
	
	public void setInterestRate(double rate) {
		interestRate = rate;
		System.out.printf("Iterest rate set to %.2f%%.\n", interestRate);
	}
	
	public void calcInterestEarned() {
		interestEarned = balance * (interestRate / 100);
		balance = balance + (balance * (interestRate / 100));
	}
	
	public double getInterestEarned() {
		return interestEarned;
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
	public void accountSummary() {
		super.accountSummary();
		System.out.printf("Interest rate: %.2f%%\n", interestRate);
		System.out.printf("Interest earned: $%.2f\n", interestEarned);
	}
	

}
