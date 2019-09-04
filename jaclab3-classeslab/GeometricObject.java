/********************************************
 * Workshop # 3
 * Course:<JAC44>- 5
 * Last Name:<Trakas>
 * First Name<George>
 * ID: <108459173>
 * Section: <SCC>
 * This assignment represents my own work in accordanve with
 * Seneca Academic Policy
 * George Trakas
 * Date: <2/7/2019
 ***********************************************/
package com.trakas.classeslab3;

public abstract class GeometricObject implements Colorable{
protected String[] colors= {"Red","Green","Blue","Yellow"};
protected String color=new String(colors[(int)(Math.random()*colors.length)]);
protected boolean isfilled;
protected java.util.Date date;

GeometricObject(){
	date= new java.util.Date();
}

GeometricObject(String col, boolean filler,java.util.Date dated){
	this.color=col;
	this.isfilled=filler;
	this.date=dated;
}

public String getColor() {
	return color;
}
public void setColor(String color_set) {
	this.color=color_set;
}

public boolean getFill() {
	return isfilled;
}
public void setFill(boolean filled) {
	this.isfilled=filled;
}

public java.util.Date getDate(){
	return date;
}
public void setDate(java.util.Date enter_date)
{
this.date=enter_date;	
}

public String toString() {
	return "Object was created on " + date + " color is " + getColor();
}
public abstract double getArea();


public abstract double getPerimeter();

}