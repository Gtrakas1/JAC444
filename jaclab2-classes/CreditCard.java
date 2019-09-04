/********************************************
 * Workshop # 2
 * Course:<JAC44>- 5
 * Last Name:<Trakas>
 * First Name<George>
 * ID: <108459173>
 * Section: <SCC>
 * This assignment represents my own work in accordance with
 * Seneca Academic Policy
 * George Trakas
 * 
 ***********************************************/

package com.trakas.classes;

import java.util.Scanner;



public class CreditCard {
	static Scanner input=new Scanner(System.in);	

public static int getDigits(int number) {
		
		if(number <=9)
		{
			return number;
		}else
		{
			int firstDig=number %10;
			int secondDig=number/10;
			return firstDig +secondDig;
		}
	}


	public static int oddNumSum(long number)
	{
		int oddsum=0;
		while(number >0)
		{
			oddsum +=(int)(number %10);
			number=number/100;
		}
		return oddsum;
	}

	public static int evenNumSum(long number) {
	int evensum=0;
	long temp=0;

	while(number >0)
	{
		temp=number %100;
		evensum +=getDigits((int)(temp/10)*2);
		number=number /100;

		}
	return evensum;
	}

	public static int getSize(long d) {
	int count=0;

	while(d > 0)
	{
		d=d/10;
		count++;
		}
	return count;
	}

	public static long getPrefix(long number, int k)
	{
		if(getSize(number)< k) {
			return number;
		}else {
			int size=(int)(getSize(number));
			
			for(int i=0; i< (size-k); i++)
			{
				number=number/10;
			}
			return number;
		}
	}

	public static boolean matchPrefix(long number,int d)
	{
	if(getPrefix(number, d )== 4)
	{
		System.out.println("Visa Cards");
		}else if(getPrefix(number, d )== 5) {
			System.out.println("Master Cards");
				
		}else if(getPrefix(number, d )== 37) {
			System.out.println("American Express Cards");
			
		}else if(getPrefix(number,d)== 5) {
			System.out.println("Discovery Cards");
				
		}
	return true;
	}

	public static boolean isValid(long number)
	{
		int total=(oddNumSum(number) + evenNumSum(number));
		if((total % 10 == 0) &&
				(getSize(number) >= 13 && getSize(number) <=16 ) &&
				(matchPrefix(number,1)==true)){
		return true;
		}else {
		return false;	
		}

	}

	public static void displayCreditCard() {
	Scanner input=new Scanner(System.in);

	System.out.println("Enter a credit card number as a long integer: ");
	long cardnum=checkinputLong();

	if(isValid(cardnum))
	{
		System.out.println(cardnum + " is valid ");
		System.out.println(matchPrefix(cardnum,1));

	}
	else
	{
		System.out.println(cardnum + " is invalid " );
	}
	input.close();

	}
	
	public static long checkinputLong(){
		
		while(!input.hasNextLong())
		{
			System.out.println("Please enter an Long: ");
			input.next();
		}
		long result=input.nextLong();
		
		return result;
	} 

}

