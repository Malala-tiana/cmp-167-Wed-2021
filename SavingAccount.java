//Inherit from bank account
//Have unique extra methods and instance variables
// toString matches with the SavingAccount
//Test it out
// in order to inherit parent class, you must add extends
public class SavingAccount extends BankAccount {
	private double depositInterest = 0.55;
	public int depositCounter = 6;
	
	public static void main(String[] args) {
		SavingAccount userAccount = new SavingAccount();
		
		userAccount.deposit(2300);
		
		for(int i = 0; i < 6; ++i) {
			userAccount.withdraw(390);
		}
		
	}
	public void deposit(double amount) {
		if(depositCounter < 5) {
			super.deposit(amount);
			++depositCounter;
		}
		else {
			double counterInterest = amount * depositInterest;
			System.out.println("$" + counterInterest + " of interest will be charged");
			amount -= counterInterest;
			super.deposit(amount);
			depositCounter = 0;
		}
	}
	public String toString() {
		//String statement;
		
		
		return "Type : Saving, " + toString() + ", Interest: %" + depositInterest;
	}
}
