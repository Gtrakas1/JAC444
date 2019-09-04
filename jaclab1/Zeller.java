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

public class Zeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Set up input for year month num and day num		
		Scanner input=new Scanner(System.in);
		int year;
		int month;
		int daynum;
do {
		System.out.print("Enter year: e.g. , (2015): ");
while (!input.hasNextInt()) {
	input.next();
	System.out.println("Year needs to be an Int. Try again");
}
year=input.nextInt();
}while(year < 0);


do {		
System.out.print("Enter month: 1-12: ");
while(!input.hasNextInt()) {
	input.next();
	System.out.println("Month needs to be an Interger and or ");
	
}
month=input.nextInt();
while(month <1 || month >12)
{
	System.out.println("Month needs to be between 1 and 12");
	month=input.nextInt();
}

}while(month < 1 && month > 12);

//Day do while check statements
do {
System.out.print("Enter day of the month: 1-31: ");
while(!input.hasNextInt())
{
	input.next();
	System.out.println("Day needs to be an Integer");
}
daynum=input.nextInt();
while(month == 2 && daynum < 1 || daynum > 28)
{
	if(daynum <1 || daynum >28)
	{
		System.out.println("Day needs to be between 1 and 28.");
		daynum=input.nextInt();
	}
}
}while(daynum <1 || daynum >31);
//formulas to simplify the zeller's congruence
int century= year /100;
year=year % 100;
if(month == 1 || month == 2)
{
month+=12;
year --;
}


//Zeller's congruence
int day= (daynum + (26 *(month +1)/10) + year + (year/4) + (century/4) + (century * 5))% 7;                              

//String variable for Date
String Day = null;

//switch statement to state which Day string output to display
switch(day) {
case 0: Day="Saturday";
break;
case 1: Day="Sunday";
break;
case 2: Day="Monday";
break;
case 3: Day="Tuesday";
break;
case 4: Day="Wednesday";
break;
case 5: Day="Thursday";
break;
case 6: Day="Friday";
break;

}

//Display day of the week
System.out.println("Day of the week is " + Day);
input.close();
System.exit(0);
}

}
