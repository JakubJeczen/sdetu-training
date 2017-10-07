package oop;

public class CDAccount extends BankAccount implements IRate {

	double cdTax;
	
	void showCDBalance() {
		double cdTotalBalance = balance - cdTax;
		System.out.println("Name: " + getName() + " .... ssid: " + getSsn());
		System.out.println("Total balance with taxes: " + cdTotalBalance);
		System.out.println("Account type : " + accountType);
	}
	
	public void deposit(double amount) {
		balance = balance + amount - 10;
		showActivity("DEPOSIT");
	}

	
}
