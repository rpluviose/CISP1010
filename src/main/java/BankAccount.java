public class BankAccount {
	double balance;

	public BankAccount() {
		balance = 0;
	}

	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	double getBalance() {
		return balance; 
        
        }         
}
  

