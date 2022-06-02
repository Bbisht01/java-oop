package com.masai.java;

public class AccountRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		Account credit = new Account();
		Account debit = new Account();
		
		credit.openAccount();
		debit.openAccount();
		
		credit.setBalance(100);
		debit.setBalance(10);
		
		System.out.println("credit " +credit.getBalance());
		System.out.println("debit " +debit.getBalance());

	}

}
