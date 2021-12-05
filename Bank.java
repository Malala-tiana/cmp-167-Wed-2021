import java.util.ArrayList;

public class Bank extends BankAccount {
	private String name;
	private String address;
	ArrayList<CheckingAccount> accounts = new ArrayList<CheckingAccount>();
	ArrayList<BankAccount> accountsOther = new ArrayList<BankAccount>();
	
	public Bank(String name, String address) {
		this.name = name;
		this.address = address;
		System.out.println("A bank has been created");
	}
	
	public void openAccount(char type) {
		if(type == 'c') {
			CheckingAccount acct = new CheckingAccount();
			accounts.add(acct);
			System.out.println("Checking account # " + acct.number + "Has been created");
		}
		else if(type == 's') {
			SavingAccount acct = new SavingAccount();
			accountsOther.add(acct);
			System.out.println("Saving account # " + acct.number + "Has been created");
		}
		else {
			BankAccount acct = new BankAccount();
			accountsOther.add(acct);
			System.out.println("Account"+ acct.number + " has been created ");
		}
	}
	
	public void deposit (double amount) {
		BankOffice acct = new BankOffice();
		acct.deposit(amount);
		
		System.out.println();
	}
	public void withdraw(double amount) {
		BankOffice acct = new BankOffice();
		acct.withdraw(amount);
		
		System.out.println();
	}
	
	public void displayAll() {
		System.out.println("Checking accounts");
		for(CheckingAccount acct : accounts) {
			System.out.println(acct);
		}
		System.out.println(" Rest of the accounts ");
		for(BankAccount acct: accountsOther) {
			System.out.println(acct);
		}
	}
	
	@Override
	public String toString() {
		return "Bank " + name + ", Address: " + address + " Number of Clients: " + (accounts.size() + accountsOther.size());
	}
}
