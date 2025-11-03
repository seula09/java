package exam1020;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("김자바", "111-222-333");
		BankAccount account2 = new BankAccount("이자바", "111-222-444");
		
		System.out.println(BankAccount.getCount());
		
		int  currentBalance = account.deposit(10000);
		System.out.println(currentBalance);
		System.out.println(account.getBalnce());
		
		int  amount = account.withdrawal(5000);
		System.out.println(amount);
		System.out.println(account.getBalnce());
		
		amount = account.withdrawal(6000);
		System.out.println(amount);
		System.out.println(account.getBalnce());

	}

}
