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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.trakas.lab4Class.LetterCounter;

public class LetCountMeth {
	LetterCounter letter=new LetterCounter();
	int[] lower=letter.getLow();
	int[] upper= letter.getUp();
	
	public void ReadLetterCount(String file) {
	FileReader inputStream=null;
	try{
	 inputStream=new FileReader(file);
	
	 int c; 
		char ch;
		while ((c = inputStream.read()) != -1) { 
			//test file
			ch=((char) c);
			if(ch >= 'a' && ch <= 'z')
			{
				lower[ch - 'a']++;
			}
			else if(ch >= 'A'  && ch <= 'Z')
			{
				upper[ch - 'A']++;
			}
			
			}
		    displayCounter();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
}
	public void displayCounter() {
		for(int i=0; i < lower.length;i++)
		{
			System.out.println("Number of " + (char)(i + 'a') + " 's: " + lower[i] );
		}
		for(int i=0; i < upper.length;i++)
			{
			System.out.println("Number or " + (char)(i + 'A') + " 's: " + upper[i]);
			}
	
	}
}
