/********************************************
  * Workshop # 4
  * Course:<JAC44>- 5
  * Last Name:<Trakas>
  * First Name<George>
  * ID: <108459173>
  * Section: <SCC>
  * This assignment represents my own work in accordance with
  * Seneca Academic Policy
  * George Trakas
  * Date: 2/21/2019
  * 
  ***********************************************/
 package com.trakas.lab4Methods;

import java.util.Scanner;

public class InputchkMethods {
	Scanner input= new Scanner(System.in);
	public  double checkinputDouble(){
		
		while(!input.hasNextDouble())
		{
			System.out.print("Please enter an Double: ");
			input.next();
		}
		double result=input.nextDouble();
		
		return result;
	} 
public  int checkinputInt(){
		
		while(!input.hasNextInt())
		{
			System.out.print("Please enter an Integer: ");
			input.next();
		}
		int result=input.nextInt();
		
		return result;
	}
public  String checkinputString(){

while(input.hasNextInt()|| input.hasNextDouble() || input.hasNextFloat() || input.hasNextLong()||
		input.hasNextShort())
{
	System.out.println("Please enter an String that is one letter long: ");
	input.next();
}
String result=input.next();

return result;
} 

}
