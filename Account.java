package com.masai.java;

public class Account {
	
	private int balance;
	
	void openAccount()
	{
		System.out.println("Account created");
	}
	
   public void setBalance(int balance)
    
    {
    	this.balance = balance;
    }
    
   public int getBalance()    
    {
    	return this.balance;    	
    	
    }

}
