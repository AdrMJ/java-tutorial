package Bank;

public class Bank implements BankTransfer {

	public final int TRANSFER_FEE = 1;
	
	@Override
	public void transfer(BankAccount from, BankAccount to, int amount) {
		if(from.getBalance() < TRANSFER_FEE + amount) {
			throw new IllegalArgumentException("Not enough resources!");
		}
		from.withdraw(amount + TRANSFER_FEE);
		to.deposit(amount);	
	}
	public BankAccount openAccount() {
		return new BankAccount();
		
	}
	
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		account1.deposit(500);
		account2.deposit(1000);
		
		bank.transfer(account1, account2, 400);
		
		System.out.println("FirstAccount " + account1.getBalance());
		System.out.println("SecondAccount " + account2.getBalance());

	}

}
