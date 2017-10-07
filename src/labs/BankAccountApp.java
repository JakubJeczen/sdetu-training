package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("223345",1000);
		BankAccount acc2 = new BankAccount("445265",10000);
		
		acc1.makeDeposit(1200);
		acc1.payBill(1200);
		acc1.accrue();		
		acc1.setName("Kuba");
		System.out.println(acc1.getName());
		System.out.println(acc1.toString());
		
		InvestmentAccount acc3 = new InvestmentAccount("233451","Capital Markets",13000);
		System.out.println(acc3.toString());
		
	}

}

class BankAccount implements IInterest{
	//Properties
	private String name;
	private String accountNumber;
	private static final String routingNumber = "0045400067"; //constant
	protected String SSN;
	protected static int ID = 1000;
	protected double balance;
	
	//Constructors
	public BankAccount() {
		
	}
	
	
	public BankAccount(String SSN) {
		
		System.out.println("New Account created!");
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
public BankAccount(String SSN, double initialDeposit) {
		
		balance = initialDeposit;
		System.out.println("New Account created!");
		this.SSN = SSN;
		ID++;
		System.out.println(ID);
		setAccountNumber();
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	protected void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		
		accountNumber = ID + "" + random + "" + SSN.substring(0,3);
		System.out.println("Your account no : " + accountNumber);
	}
	
	public void payBill(double amount) {
		
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount)
	{
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		
		System.out.println("Current balance : $" + balance);
	}
	
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n";
	}
	
	
	
	
	
}