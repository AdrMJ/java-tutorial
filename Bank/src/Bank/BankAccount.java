package Bank;

public class BankAccount implements Account {

	private int balance;
	
	BankAccount(){
		this(0);
	}
	
	BankAccount(int balance){
		this.balance=balance;
	}
	
	@Override
	public void deposit(int amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("amount must be > 0");
		}
		balance += amount;
		
	}

	@Override
	public void withdraw(int amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("amount must be > 0");
		}
		balance -= amount;
	}

	public int getBalance() {
		return balance;
	}
}
