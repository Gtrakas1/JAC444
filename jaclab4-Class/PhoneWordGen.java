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

package com.trakas.lab4Class;

import java.util.ArrayList;

public class PhoneWordGen {

private ArrayList<String> list;	
private String mappings[][] = {
        {"0"}, {"1"}, {"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"},
        {"J", "K", "L"}, {"M", "N", "O"}, {"P","R", "S"}, 
        {"T", "U", "V"}, {"W", "X", "Y"}
    };
private String phoneNum;
public PhoneWordGen()  {
this(" ");
}

public PhoneWordGen(String number) {
	this.phoneNum=number;
}

public ArrayList<String> getList(){
	return list;
}

public void setList(ArrayList<String> ent_list) {
	this.list=ent_list;
}
public String[][] getMap() {
	return mappings;
}

public void setMap(String[][] map) {
	this.mappings = map;
}

public String getPhoneNum() {
	return phoneNum;
}

public void setPhoneNum(String phoneNum) {
	this.phoneNum = phoneNum;
}

}
