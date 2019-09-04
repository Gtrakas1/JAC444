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

public class Rectangle extends GeometricObject {
private double width;
private double height;
private int recid;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int recid, double wid, double height)
	{
		this.recid=recid;
		this.width=wid;
		this.height=height;
	}

	
	public int getRecid() {
		return this.recid;
	}
	
	public void setRecid(int ent_id) {
		this.recid=ent_id;
	}
	
	public double getWidth(){
		return this.width;
	}
	public void setWidth(double ent_wid) {
		this.width=ent_wid;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public void setHeight(double ent_high) {
		this.height=ent_high;
	}
	
	public double getArea() {
		return getWidth() * getHeight();
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return ((getWidth() * 2) +(getHeight() *2));
	}

	
	public String toString() {
		
		return super.toString();
	}
	public boolean equals(Object other) {
		if(this == other) {
			return true;
		}
		if(other == null ||other.getClass() != this.getClass())
		{ return false;}
		
	Rectangle rec=(Rectangle) other;	
		return (rec.height == this.height && rec.width == this.width);
	}

	public int hashCode() {
		return this.recid;
	}

	
}
