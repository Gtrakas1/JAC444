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


import com.trakas.lab4Class.HangMan;

public class HangMethod {
 HangMan man=new HangMan();
 InputchkMethods check=new InputchkMethods();
 String word=man.getWord();
 private String asterisk=new String(new char[word.length()]).replace("\0","*");	
 private int missedCount= 0;
 private String answer;
 
public void display() {
	System.out.println("(Guess) Enter a letter in word " + man.getWord() + "> ");
}
public void displayHangMan() {
while(missedCount <7 && asterisk.contains("*"))
{
	
System.out.print("(Guess) Enter a letter in word " + asterisk + "> ");
 answer=check.checkinputString();
hang(answer);
}

playAgain();
}

public  void hang(String guess) {

String newast="";
 		
for(int j=0;j < word.length();j++)
{
if(asterisk.charAt(j)== guess.charAt(0))
{
System.out.println(guess.charAt(0) + "is already in the word.");	
newast+=guess.charAt(0);
}
else if(word.charAt(j) == guess.charAt(0))
{
	newast+=guess.charAt(0);
}
else if(asterisk.charAt(j) != '*')
{
	newast+=word.charAt(j);
}
else {
	newast+="*";
}

}
if(asterisk.equals(newast))
{
	System.out.println( guess.charAt(0) +" is not in the word.");	
	missedCount++;
	
}	
else {
	asterisk=newast;
	}
if((guess.length()>1 && asterisk==newast) ||(guess.length()>1 && asterisk.equals(newast))){
	System.out.println("Please input one letter at a time");
}

if(asterisk.equals(word)) {
		System.out.println("The word is " + word + " You missed " + missedCount + " times");
		

}
	
}

public void playAgain() {
System.out.println("Do you Want to guess another word? Enter yes or no");
answer=check.checkinputString();
 word=man.getWord();		
 asterisk=new String(new char[word.length()]).replace("\0","*");

   if(answer.equalsIgnoreCase("Y"))
   {

	   displayHangMan();
   }
   else if(answer.equalsIgnoreCase("n")){

	   System.out.println("Thank you for playing");
}
else {
System.out.println("You did not chose y or n. Please try again");
}
 
	


}
}


