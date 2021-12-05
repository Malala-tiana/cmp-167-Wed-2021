
public class BankAccount {
	//private int number;
	private double balance;
	private static int accountNumbers;
	public int number;
	
	public BankAccount() {
		this.number = ++accountNumbers;
	}
	
	/*
	 * public void deposit(double amount) {
		if(amount >= 0.0) {
			this.balance += amount;
			System.out.println(amount + " has been deposited to account " + number + "\nYou now have a balance of $" + balance);
		}
		else {
			System.out.println("Unsuccessfull transaction, invalid amount");
		}
	}
	 */
	
	public void deposit (double amount) {
		if(amount >= 0.0) {
			balance += amount;
			displayMessage('d', true, amount);
		}
		else {
			displayMessage('d', false, amount);
		}
	}
	
	public void withdraw(double amount) {
		if((balance - amount) >= 0.0) {
			balance -= amount;
			System.out.println("$" + amount + " has been withdrawn " + number + "\nYou have a new balance of $" + balance);
		}
		else {
			System.out.println("Unsuccessful transaction, insufficient balance");
		}
	}
	@Override
	public String toString() {
		return "Account # " + number +", balance: " + balance;
	}
	
	public void displayMessage(char type, boolean state, double amount) {
		String message1 = "";
		String message2 = "";
		
		if(type == 'd') {
			message1 = "have been deposited to ";
			message2 = "Invalid amount";
		}
		else {
			message1 = "have been withdrawn from";
			message2 = "insufficient amount";
		}
		if(state) {
			System.out.println("Transaction successful, $" + amount + message1 + "account # " + number + ".\nNew Balance: $" + balance);
		}
		else {
			System.out.println("Transaction Unsuccessful" + message2);
		}
	}
}
