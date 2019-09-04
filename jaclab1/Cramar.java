/********************************************
 * Workshop # 1
 * Course:<JAC44>- 5
 * Last Name:<Trakas>
 * First Name<George>
 * ID: <108459173>
 * Section: <SCC>
 * This assignment represents my own work in accordanve with
 * Seneca Academic Policy
 * George Trakas
 * Date: <1/18/2019
 ***********************************************/
package jaclab1;

import java.util.Scanner;

public class Cramar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isValid=true;
		//Set up input for Cramar values
	double a,b,c,d,e,f,x,y;		
		Scanner input=new Scanner(System.in);
		String enterkey=(",");
		enterkey=input.nextLine();
		
		// do while are to check if it is a double inputed for each variable
		do{
			System.out.print("Enter a,b,c,d,e,f: ");
		while(!input.hasNextDouble() || !input.hasNextLine()) {
			System.out.println("Input needs to be a double please try again ");
			input.next();
			
		}
		a = input.nextDouble();
		
		while(!input.hasNextDouble() || !input.hasNextLine() ) {
			System.out.println("Input needs to be a double please try again ");
			input.next();
			
		}
		b = input.nextDouble();
		
		while(!input.hasNextDouble() ||!input.hasNextLine()  ) {
			System.out.println("Input needs to be a double please try again ");
			input.next();
			
		}
		c = input.nextDouble();
		
		while(!input.hasNextDouble() || !input.hasNextLine()  ) {
			System.out.println("Input needs to be a double please try again ");
			input.next();
			
		}
		d = input.nextDouble();
		
		while(!input.hasNextDouble() || !input.hasNextLine() ) {
			System.out.println("Input needs to be a double please try again ");
			input.next();
			
		}
		e = input.nextDouble();
		
		while(!input.hasNextDouble() || input.hasNextLine() ) {
			System.out.println("Input needs to be a double please try again ");
			input.next();
			
		}
		f = input.nextDouble();
		
		if( ((a*d)-(b*c) == 0)) {
			System.out.println("The equation has no solution");
				
		}
		else {
	//Formula to Cramars Rule
		x= ((e*d)-(b*f))/((a*d)-(b*c));
	    y= ((a*f)-(e*c))/((a*d)-(b*c));
	    System.out.println("x is " + x +" and y is " + y);    
		
		}
	    
		}while(!isValid); 
		
		System.exit(0);
		input.close();
	   
		
		
		}
			
}
		

	


