package atm;

public class Atm {

	private double balance;
	private String requiredPin = "1234";
	
	public double getBalance() {
		return balance;
	}

	public Atm() {
		//balance = 500.00;
		this(500.00);
	}

	public Atm(double amount) {	
		balance = amount;
	}

	public void withdraw(int amountToWithdraw) {
		balance -= amountToWithdraw;
	}

	public boolean allowAccess(String enteredPin) {
		return enteredPin.equals(requiredPin);
	}

	public void deposit(int amountToDeposit) {
		if (amountToDeposit < 0) {
			System.out.println("Cannot deposit negative amount.");
			System.out.println("Please try again: ");
		}
		balance += amountToDeposit;
		
	}

}