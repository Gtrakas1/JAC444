/********************************************
 * Workshop # 6
 * Course:<JAC44>- 5
 * Last Name:<Trakas>
 * First Name<George>
 * ID: <108459173>
 * Section: <SCC>
 * This assignment represents my own work in accordance with
 * Seneca Academic Policy
 * George Trakas
 * Date: 3/22/2019
 * 
 ***********************************************/
package com.trakas.methods6;

import java.util.Scanner;

import com.trakas.classes5.GaltonBox;
import com.trakas.tester.TesterClass;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class GbMeths {
	GaltonBox gb=new GaltonBox();
	InputchkMethods check=new InputchkMethods();
	
	public void displayPath() {
		gb.setSlots(new int[gb.getSlotNum()+ 1]);
		for (int i = 0; i < gb.getBallNum(); i++) {
	        int count = 0;
	        for (int j = 1; j < gb.getSlotNum(); j++) {
	            int randNum = (int) (Math.random() * 2);
	            count += randNum;
	            if (randNum == 0) {
	                gb.setRotation("L");;
	            }else {
	                gb.setRotation("R");;
	            }
	            System.out.print(gb.getRotation());
	        }
	        gb.getSlots()[count]++;
	        System.out.println();
	}
		}
	
	public void displayBall() {
		String[] ball=new String[gb.getSlotNum() + 1];
		
	    for (int i = gb.getBallNum(); i > 0; i--) {
            for (int j = 0; j <= gb.getSlotNum(); j++) {
                if (i == gb.getSlots()[j]) {
                    ball[j] = "O";
                    gb.getSlots()[j]--;
                } else
                    ball[j] = " ";
                System.out.print(ball[j]);
            }
            System.out.println();
        }
    
	}

	public void displayBox() {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of balls to drop: ");
	     gb.setBallNum(check.checkinputInt());

	    System.out.print("Enter the number of slots in the bean machine: ");
	     gb.setSlotNum(check.checkinputInt());
	displayPath();
	displayBall();
		input.close();
		
	}
	
	public void startBox() {
		String yesNo;
		
		displayBox();
		System.out.print("Would you like to play again ?");
		yesNo=check.checkinputString();
		
		do{
		if(yesNo.equalsIgnoreCase("Y"))
		{
			displayBox();
			System.out.print("Would you like to play again ?");
			yesNo=check.checkinputString();
				
		}else if(yesNo.equalsIgnoreCase("N"))
		{
		System.out.println("Thank you for testing GaltonBox");;
		}
		}while(yesNo.equalsIgnoreCase("Y"));
	
	}

	
}
