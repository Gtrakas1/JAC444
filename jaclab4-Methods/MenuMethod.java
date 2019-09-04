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

import com.trakas.lab4Class.OptionMenu;

public class MenuMethod {
OptionMenu option=new OptionMenu();
InputchkMethods check=new InputchkMethods();
Scanner input=new Scanner(System.in); 
int options;
public void displayOptions() {
	System.out.println("Please choose from the 4 options: ");
	System.out.println("option 1: (HangMan) ");
	System.out.println("option 2: (LetterCounter) ");
	System.out.println("option 3: (PhoneWord Generator) ");
	System.out.println("option 4: (Exit) ");
    System.out.print("Chosen option: ");
    options=check.checkinputInt();
	 
}

public void displayTasks() {
	displayOptions();
	do{
		
		  option.setOption(options);
		  switch (options) {

		case 1 :
			HangMethod man=new HangMethod();
			man.displayHangMan();
				
			displayOptions();
		break;
		case 2:
			LetCountMeth let=new LetCountMeth();
			System.out.print("Enter the file name: ");
			
			String file=check.checkinputString();
			let.ReadLetterCount(file);
			displayOptions();
			break;
			
		case 3:
			PhoneMeth phone=new PhoneMeth();
			phone.WriteWords();			
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
