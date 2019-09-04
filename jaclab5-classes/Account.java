package com.trakas.classes5;

import java.io.Serializable;

public class Account implements Serializable {

	private int id=0;
	private String firstName;
	private String lastName;
	private double balance= 0.00;
	private transient double annIntRate;
	private transient java.util.Date dateCreated;
	private transient static int pin;
	public Account()
	{
		this(0,0.0," "," ");
	}
	
	public Account(int id, double bal)
	{
		this.id=id;
		this.balance=bal;
	}

	public Account(int id,double bal,String first, String last) {
		
		this.id=id;
		this.firstName=first;
		this.lastName=last;
		this.balance=bal;
	}

	public Account(int pin2) {
		// TODO Auto-generated constructor stub
	this.pin=pin2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public double getAnnIntRate() {
		return annIntRate;
	}

	public void setAnnIntRate(double annIntRate) {
		this.annIntRate = annIntRate;
	}

	public static int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
