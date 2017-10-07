package oop;

public class BankAccount implements IRate {
	
	String accountNumber;
	String gender;
	private static final String routingNumber = "013455";
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	//Constructors:
	
	BankAccount() {
		System.out.println("\nNEW ACCOUNT CREATED");
	}
	
	BankAccount(String accountType) {
		this.accountType = accountType;
		System.out.println("NEW ACCOUNT: " + accountType);
		}
	
	BankAccount(String accountType, double balance) {
		System.out.println("\nNEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT: $" + balance);
		this.accountType = accountType;
		this.balance = balance;
		String Msg = null;
		if (balance < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		}
		else {
			Msg = "Thanks for your initial deposit of " + balance;
		}
		System.out.println(Msg);
}
	
	
	//Getters & Setters:
		public void setName(String name) {
			if (gender == "M") {
			this.name = "Mr. " + name;
		} else 
		{
			this.name = "Mrs. " + name;
		}
		}
		public String getName(){
			return name;
		}
	
	
	public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = "4445" + ssn;
		}

	void checkBalance() {
		System.out.println("\n\nName : " + name + "\nBalance : " + balance);
		System.out.println("Account type : " + accountType);
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	protected void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAWAL");
	}
	
	void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS : " + balance);
	}
	
	//Interface methods:
	
	public void setRate(){
		System.out.println("Setting rate");
	}
	
	public void increaseRate(){
		System.out.println("Increasing rate");
	}
}