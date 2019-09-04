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

public class BabyNames {
private int year;
private String gender;
private String name;

public BabyNames(int year,String gender,String name) {
this.year=year;
this.gender=gender;
this.name=name;
	
}
public BabyNames() {
	// TODO Auto-generated constructor stub
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
