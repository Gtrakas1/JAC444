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

import com.trakas.classeslab3.*;

public class MenuMethod {
OptionMenu option=new OptionMenu();
InputchkMethods check=new InputchkMethods();
Scanner input=new Scanner(System.in); 
int options;
public void displayOptions() {
	System.out.println("Please choose from the 4 options: ");
	System.out.println("option 1: (Complex) ");
	System.out.println("option 2: (Colorable) ");
	System.out.println("option 3: (Unsafe Banks) ");
	System.out.println("option 4: (Exit) ");
    System.out.print("Chosen option: ");
}

public void displayTasks() {
	displayOptions();
	do{
		
		  options=check.checkinputInt();
		 option.setOption(options);
		  switch (options) {

		case 1 :
		ComplexMethods temp = new ComplexMethods();
		try{
			Complex com = new Complex();
			Complex a=(com);
			com.clone();
			Complex b=(com);
			com.clone();


		System.out.print("Enter the first complex number: ");
		double entA =check.checkinputDouble();
		double entB =check.checkinputDouble();
		a.setReal(entA);
		a.setImagery(entB);
		a=new Complex(entA,entB);
		System.out.print("Enter the second complex number: ");
		double entC =check.checkinputDouble();
		double entD =check.checkinputDouble();
		b.setReal(entC);
		b.setImagery(entD);
		b=new Complex(entC,entD);
			
		System.out.println("(" + entA + " + " + entB + "i) " + "+ " + "(" + entC + " + " + entD + "i) " + " = " + temp.add(a,b));
		System.out.println("(" + entA + " + " + entB + "i) " + "- " + "(" + entC + " + " + entD + "i) " + " = " + temp.sub(a,b));
		System.out.println("(" + entA + " + " + entB + "i) " + "* " + "(" + entC + " + " + entD + "i) " + " = " + temp.multi(a,b));
		System.out.println("(" + entA + " + " + entB + "i) " + "* " + "(" + entC + " + " + entD + "i) " + " = " + temp.divide(a,b));
		System.out.println("|(" + entA + " + " + entB + "i)| = " + temp.abs(a));
		}catch
		(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		displayOptions();
		break;
		case 2:

		GeometricObject[] shapes= {new Square(2,4.5),new Square(2,-2),new Rectangle(4,2,3),new Square(4,-5)};

		for(int i=0; i < shapes.length; i++)
		{	if(shapes[i] instanceof Square) {
			System.out.println("\nSquare #" + (i + 1));
			System.out.println("Area: " + shapes[i].getArea());
			System.out.println(shapes[i].toString());
			shapes[i].howToColor();
		}
		
		if(shapes[i] instanceof Rectangle) {
			System.out.println("\nRectangle #" + (i + 1));
			System.out.println("Area: " + shapes[i].getArea());
			System.out.println(shapes[i].toString());
			shapes[i].howToColor();
		}
		}
		displayOptions();
		
		break;
		case 3:

		BankMethods banchk=new BankMethods();
		Bank bank=new Bank();
		System.out.print("Please enter the number of Banks: ");
		int banknum=check.checkinputInt();
		bank.setN(banknum) ;
		System.out.print("Please enter the minimum assets for the banks:  ");
		int limit=check.checkinputInt();
		bank.setLimit(limit);;
		double tbanks[][][]=new double[bank.getN()][][];
		for(int i=0; i <tbanks.length;i++) {
		System.out.print("Bank # " + i + "-> Balance: ");
		bank.setBalance(check.checkinputDouble());
		System.out.print(" ->Number of banks loaned: ");
		int loanNum=check.checkinputInt();
		tbanks[i]=new double[++loanNum][2];
		tbanks[i][0][0]=bank.getBalance();
		for(int j=1; j < tbanks[i].length;j++)
		{
		System.out.print(" -> Bank ID: ");
		tbanks[i][j][bank.getId()]=check.checkinputInt();
		System.out.print(" -> Amount: ");
		tbanks[i][j][(int) bank.getLoans()]=check.checkinputDouble();
		}

		}
		try {
		boolean[] unsafeIndex = banchk.scanBanks(tbanks,limit);
		for (int k = 0; k < unsafeIndex.length; k++) {
			System.out.println("Bank# " + k + " unsafe: " + unsafeIndex[k]);
		
		}
		banchk.displayBanks(tbanks);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		displayOptions();
		break;
		case 4: 
		System.out.println("Thank you");
		break;
		default:
 
			System.out.print("Invalid Number. Please choose from 1 to 4: ");
		  }
	
			
		}while(options != 4);

}
}
