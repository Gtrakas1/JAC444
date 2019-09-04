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
package com.trakas.classes5;

import com.trakas.methods6.*;
public class GaltonBox {

private	int ballNum;
private	int slotNum;
private	int[] slots;
private	String rotation;
		
	
public static void main(String[] args) {
	GbMeths gb=new GbMeths();
	gb.displayBox();
}

public String getRotation() {
	return rotation;
}

public void setRotation(String rotation) {
	this.rotation = rotation;
}
public int getBallNum() {
	return ballNum;
}
public void setBallNum(int ballNum) {
	this.ballNum = ballNum;
}
public int getSlotNum() {
	return slotNum;
}
public void setSlotNum(int slotNum) {
	this.slotNum = slotNum;
}
public int[] getSlots() {
	return slots;
}
public void setSlots(int[] slots) {
	this.slots = slots;
}
		
}
	
	