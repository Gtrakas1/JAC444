/********************************************
 * Workshop # 3
 * Course:<JAC44>- 5
 * Last Name:<Trakas>
 * First Name<George>
 * ID: <108459173>
 * Section: <SCC>
 * This assignment represents my own work in accordanve with
 * Seneca Academic Policy
 * George Trakas
 * Date: <2/7/2019
 ***********************************************/
package com.trakas.classeslab3;

public class Bank {

private int id=0;
private double balance;
private int loans=1;
private  int n;
private int limit;
private double tbanks[][][];
public Bank() {
	
}
public Bank(int id,double bal,int loa,int n,int limit,double tBanks[][][] )
{
	this.id=id;
	this.balance=bal;
	this.loans=loa;
	this.n=n;
	this.limit=limit;
	this.tbanks=tBanks;
	
}

public int getId() {
	return this.id;
}

public void setId(int ent_id) {
	this.id=ent_id;
}

public double getBalance() {
	return this.balance;
}

public void setBalance(double ent_bal) {
	this.balance=ent_bal;
}


public int getLoans() {
	return this.loans;
}

public void setLoan(int ent_loa)
{
	this.loans=ent_loa;
	
}

public int getN() {
	return this.n;
}

public void setN(int ent_n)
{
	this.n=ent_n;
}

public int getLimit() {
	return this.limit;
}

public void setLimit(int ent_lim) {
	
	this.limit=ent_lim;
}

public double[][][] getTbanks(){
	return this.tbanks;
}

public void setTbanks(double[][][] ent_banks)
{
this.tbanks=ent_banks;	
}
}


