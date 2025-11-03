package exam1020;

public class BankAccount {
	private static int count = 0;

	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = 0;
		count += 1;
	}
	
	public BankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		count +=1;
	}
	
	public int withdrawal(int amount) {
		if (amount > balance) {
			amount = balance;
		}
		balance -= amount;
		return amount;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalnce() {
		return balance;
	}

	public void setBalnce(int balnce) {
		this.balance = balnce;
	}
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		BankAccount.count = count;
	}
	

}
