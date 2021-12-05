
public class CheckingAccount extends BankAccount{
	private double interest = 0.75;
	public int withdrawCounter;
	
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount();
		
		acct.deposit(1000000);
		CheckingAccount acct2 = new CheckingAccount();
		acct2.deposit(500);
		
		//acct.withdraw(1000);
		//acct2.withdraw(1000);
		
		System.out.println();
		for(int i = 0; i < 5; ++i) {
			acct.withdraw(1000);
		}
		
		
		//System.out.println(acct);
	}
	
	public void Withdraw(double amount) {
		if(withdrawCounter < 4) {
			super.withdraw(amount);
			++withdrawCounter;
		}
		else {
			double chargedInterest = amount * interest;
			System.out.println("Interest to be charged $" + chargedInterest);
			amount = amount - chargedInterest;
			super.withdraw(amount);
			withdrawCounter = 1;
		}
	}
	
	public String toString() {
		return "Type : Checking, " + super.toString() + ", Interest: %" + interest;
		// super refers to parent class, in this case BankAccount
	}
}
