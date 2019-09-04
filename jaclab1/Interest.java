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


import java.text.DecimalFormat;
import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {

//format decimal points	
DecimalFormat df=new DecimalFormat();
df.setMaximumFractionDigits(2);
Scanner input= new Scanner(System.in);
double amount;
int year;
double intrate;

//Enter variables for amount and check for Integer input based off sample
//Can still be a double as currency is usually specified as such
do{
	System.out.print("Loan amount: ");
	while(!input.hasNextInt()){
		input.next();
		System.out.println("Input must be an Interger");
		}
	amount=input.nextDouble();
	
}while(amount < 0);
//Enter variable for year and check for Integer input
do {
System.out.print("Number of Years: ");
while(!input.hasNextInt())
{
	input.next();
	System.out.println("Input must be an Interger");
}
year=input.nextInt();
}while(year < 0);
//Enter Intrate and check for Integer input based off sample
//Can still be a double as interest rates are usually specified as such
do {
System.out.print("Annual Interest Rate: ");
while(!input.hasNextInt()) {
	input.next();
	System.out.println("Input must be an Interger");
	
}
intrate=input.nextDouble();
}while(intrate < 0);
//get intrate to decimal point 0.07
intrate /=100.00;
//convert year to months
int monthly=year*12;
//convert annual intrate to monthyintrate
double monthInt=intrate/12.0;

//Formula for monthly payments
double monthPay= (amount * monthInt)/
					(1-(Math.pow(1+monthInt, -monthly)));
monthPay=Math.floor(monthPay * 100) /100;
//Totalpay
double totPay=monthPay * 12.0;

//variable for principal(monthPay-intrate
double principal;

//display Monthly payment and TotalPayment
System.out.println("");
System.out.println("Montly Payment: "+ df.format(monthPay));
System.out.println("Total Payment: "+ df.format(totPay));
System.out.println("");


System.out.println("Payment#\tInterest\tPrincipal\tBalance");

//for loop to iterate monthly payments
for(int i=1; i<=year * 12; i++)
{//formulas to seperate interest,principal and balance
	intrate=monthInt * amount;
	principal= monthPay -intrate;
	amount= amount - principal;
	System.out.println(i + "\t\t"+ df.format(intrate)
	+ "\t\t" + df.format(principal) + "\t\t" + df.format(amount));
	
}
input.close();
System.exit(0);}
	
	

}
