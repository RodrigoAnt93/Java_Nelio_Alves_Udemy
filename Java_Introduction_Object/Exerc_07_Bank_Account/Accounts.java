package entities;

public class Accounts {
	
	private int account_number;
	public String name;
	private double balance;
	
	public Accounts(int account_number, String name, double balance) {
		this.account_number = account_number;
		this.name = name;
		this.balance = balance;
	}

	public Accounts(int account_number, String name) {
		this.account_number = account_number;
		this.name = name;
	}
	
	public int getAccount_number() {
		return account_number;
	}
	
	public void deposit(double values) {
		this.balance += values;
	}
	
	public int draw(double values) {
		if (values <= balance) {
			this.balance -= (values + 5);
			return 1;}
		else {
			return 0;}
	}
	
	public String toString()  {
		return "Account: " + account_number + ", Holder: " + name + ", Balance: $" + String.format("%.2f", balance); 
	}

	}


