package oop;

public class LoanAccount implements IRate {
	
	double loan;
	
	public double getLoan() {
		return loan;
	}


	public void setLoan(double loan) {
		this.loan = loan;
	}


	public void setRate() {
		double intRate = this.loan * 0.05;	
		System.out.println("Interest rate: " + intRate);
	}


	public void increaseRate() {
		double incRate = this.loan * 0.05 + 1;	
		System.out.println("Increased rate: " + incRate);
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years");
	}
	
	

}
