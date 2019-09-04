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

import java.io.*;
import java.util.Scanner;

public class HangMan {
	 static String[] words;
	 String word=new String(words[(int)(Math.random()*words.length)]);
	 static int missedCount= 0;
	 static String answer,ans;
	 static Scanner input=new Scanner(System.in);
	 
	public HangMan() {
		
		String line = "";
		try {
			File file = new File("hangman.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			while((line = br.readLine()) != null) {
				words = line.split(" ");
			}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
public String wordFill()
{
		 
for(int i=0; i < word.length(); i++)
{
	word="*";
	}
return word;
}
public void displayHangMan() {
	while(missedCount <7)
	{
		
	System.out.print("(Guess) Enter a letter in word " + wordFill() + "> ");
     answer=checkinputString();
	hang(answer);
	}
	
	playAgain();
	}

public static void hang(String guess) {
	
	String newast="";
	 String word=new String(words[(int)(Math.random()*words.length)]);
	 String asterisk=new String(new char[word.length()]).replace("\0","*");
			
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
	String ans; 
	ans=checkinputString();
	String word=new String(words[(int)(Math.random()*words.length)]);		
	String asterisk=new String(new char[word.length()]).replace("\0","*");
	
	   if(ans.equalsIgnoreCase("Y"))
	   {
	
		   displayHangMan();
	   }
	   else if(ans.equalsIgnoreCase("n")){
	
		   System.out.println("Thank you for playing");
	}
	else {
	System.out.println("You did not chose y or n. Please try again");
	}
     
		
	
	
}
public static String checkinputString(){
	
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

     



	