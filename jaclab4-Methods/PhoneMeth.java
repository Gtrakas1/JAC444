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
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.trakas.lab4Class.PhoneWordGen;

public class PhoneMeth {
	  PhoneWordGen phone=new PhoneWordGen();
	    
	    public  void CombosHelper(ArrayList<String> combos, String before, String remaining) {
	        int digit = Integer.parseInt(remaining.substring(0, 1));

	        String[][] mappings=phone.getMap();
	        if (remaining.length() == 1) {
	            for (int i = 0; i < mappings[digit].length; i++) {
	                combos.add(before + mappings[digit][i]);
	              }
	        } else {
	            for (int i = 0; i < mappings[digit].length; i++) {
	                CombosHelper(combos, before + mappings[digit][i], 
	                        remaining.substring(1));
	            }
	        }
	    }

	    public ArrayList<String> Combos(String phoneNum) {
	        ArrayList<String> combos = new ArrayList<String>();

	        CombosHelper(combos, "", phoneNum);

	        return combos;
	    }

	    @SuppressWarnings( "resource" )
		public void WriteWords() {
	        String file="phonenumber.txt";
	    	String phoneNum;
	        FileWriter fw=null;
	        BufferedWriter bf=null;
	        try {
	        Scanner input=new Scanner(System.in);	
	        fw=new FileWriter(file);
	        bf=new BufferedWriter(fw);
	        System.out.println("Please enter a 7 digit Phone Number: ");
	        ArrayList<String> combos = phone.getList(); 
	        		combos=Combos(phoneNum=input.next());
	        if(phoneNum.length() > 7 || phoneNum.length() < 7)
	        {
	        	    	System.out.println("Please input a 7 digit Phonenumber: ");
	            
	           
	        }
	        else {
	        for (String s : combos) {
	            bf.write(s);
	            bf.newLine();
	        }
	        }
	        
	        bf.flush();
	    }catch(FileNotFoundException e)
	        {
	    	e.printStackTrace();
	    	}catch(IOException e)
	        {
	    		e.printStackTrace();
	        }
	        }
} 