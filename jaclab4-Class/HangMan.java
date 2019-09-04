package com.trakas.lab4Class;
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


import java.util.Random;
import java.io.*;
public class HangMan {
String[] words;
String word;
public final String FILE="hangman.txt";

public HangMan() {
	
		BufferedReader bf=null;
		try {
	    bf=new BufferedReader(new FileReader(FILE));
	    String line;
	    while((line =bf.readLine()) != null ) {
	    	words=line.split(" ");
	    	
	    }
	    
		
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }catch(IOException e)
	    {
	    	e.printStackTrace();
	    }
			
	
	
}
public String[] getWords(){
	return words;
}

public void setWords(String[] ent_words) {
this.words=ent_words;
}

public String getWord() {
	int index=new Random().nextInt(words.length);
	return word=words[index];
	
}
}

     



	