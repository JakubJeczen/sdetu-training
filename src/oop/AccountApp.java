package oop;

public class AccountApp {

	public static void main(String[] args){
	
		LoanAccount la = new LoanAccount();
		la.setLoan(20000);
		la.increaseRate();
		la.setRate();
		la.setTerm(20);
		
		IRate acc9 = new LoanAccount();
		acc9.increaseRate();
	}
}
