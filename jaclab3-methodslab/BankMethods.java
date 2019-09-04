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
package com.trakas.methodslab3;
import java.util.Scanner;

import com.trakas.classeslab3.Bank;
public class BankMethods {

	Bank bank=new Bank();
	InputchkMethods check=new InputchkMethods();
	Scanner sc=new Scanner(System.in);
	
	public double getAssets() {
		return bank.getBalance() + bank.getLoans();
	}
	public void displayBanks(double[][][] m) {
		  System.out.println("Bank #  |"+"Balance|"+ "Loaned |"+ "Bank ID|"+ "Amount |"+ "Bank ID|"+ "Amount |");
	        for (int banks = 0; banks < m.length; banks++) {
	            System.out.print(banks +" \t|" + m[banks][0][0] + "\t|"+  (m[banks].length -1 )+ "\t|");

	            for (int LoanedBanks = 1; LoanedBanks < m[banks].length; LoanedBanks++) {
	                System.out.print( (int)m[banks][LoanedBanks][bank.getId()]+  "\t|"+ m[banks][LoanedBanks][(int) bank.getLoans()]+ "\t|");
	            }
	            System.out.println("");}
	        }
	
	public boolean[] scanBanks(double[][][] m, int limit) {

		boolean[] indexUnsafeBanks = new boolean[m.length];
		double total;
		boolean isSafe = false;

		while (!isSafe) {
			isSafe = true;
			for (int banks = 0; banks < m.length; banks++) {
				total = m[banks][0][0];
				for (int LoanedBanks = 1; LoanedBanks < m[banks].length; LoanedBanks++) {
					int index = (int) m[banks][LoanedBanks][bank.getId()];
					if (!indexUnsafeBanks[index])
						{
						total += m[banks][LoanedBanks][(int) bank.getLoans()];
						}
					}

				if (total < limit && !indexUnsafeBanks[banks]) {
					indexUnsafeBanks[banks] = true;
					isSafe = false;
				}
			}
		}
		return indexUnsafeBanks;
	}
}


	
