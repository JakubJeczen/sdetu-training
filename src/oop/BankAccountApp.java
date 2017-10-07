package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		/*BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "09234454";*/
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.gender = "F";
		acc2.balance = 1000;
		acc2.accountNumber = "09234454";
		acc2.setName("Jeczen");
		acc2.setSsn("223009");
		
		acc2.checkBalance(); 
		System.out.println("Social Security ID is " + acc2.getSsn());
		
		acc2.deposit(300);
		acc2.deposit(100);
		acc2.withdraw(1000);

		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "09234454";
		acc3.checkBalance();
		
		CDAccount acc4 = new CDAccount();
		acc4.gender="M";
		acc4.setName("Jakub");
		acc4.setSsn("40001");
		acc4.balance = 15000;
		acc4.cdTax = 200;
		acc4.accountType = "Savings Account";
		acc4.showCDBalance();
		acc4.increaseRate();
		
		acc4.showCDBalance();
		
		//acc4.checkBalance();*/
		
		//Polymorphism via overloading:
		BankAccount acc5 = new BankAccount("Investment Account");
		BankAccount acc6 = new BankAccount("Savings Account", 390);
		
		
		acc4.showCDBalance();
		
		CDAccount acc7 = new CDAccount();
		acc7.balance = 15000;
		
		//Polymorphism via overriding:
		acc7.deposit(1000);

	}

}
