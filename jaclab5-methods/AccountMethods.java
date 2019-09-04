package com.trakas.methods5;


import com.trakas.classes5.Account;

public class AccountMethods {
Account acct=new Account();

public double getMontlyInterestRate() {
	double month=12/acct.getAnnIntRate();
	return month;
}

public double getMonthlyInterest() {
	double monInt=acct.getBalance() *getMonthlyInterest();
	return monInt;
}

public double Withdraw(double amount)
{
return acct.getBalance()-amount;	
}

public double Deposit(double amount)
{
return acct.getBalance()+amount;	
}
}

