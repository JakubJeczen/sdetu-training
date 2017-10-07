package labs;

public class InvestmentAccount extends BankAccount {

	String[] invType = {"Private Equity","Capital Markets","Fixed Income"};
	/*invType[0] = "Private Equity";
	invType[1] = "Capital Markets";
	invType[2] = "Fixed Income";*/
	
	public InvestmentAccount(String SSN, String invType, double initialDeposit)
	{
		balance = initialDeposit;
		if (invType.contains(invType)) {
		System.out.println("New Investment Account created. Investment sector: " + invType);
		}
		else {
			System.out.println("Error: incorrect investment secror chosen");
		}
		this.SSN = SSN;
		ID++;
		setAccountNumber();
		showBalance();
	}
	
	
}
