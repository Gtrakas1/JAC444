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

public class Square extends GeometricObject {
	
	private double side;
	private int sqrid;
	
		
	
	public Square() {}
		
	public Square(int sqrid,double sides) {
		this.sqrid=sqrid;
		this.side=sides;
	}
	
	
	public int getSqrId() {
		return this.sqrid;
	}
	public void getId(int ent_sqr) {
		this.sqrid=ent_sqr;
	}
	public double getSide() {
		return this.side;
	}
	public void setSide(double enter_side) {
		this.side=enter_side;
	}
@Override
public double getArea() {
	// TODO Auto-generated method stub
	return Math.pow(getSide(), 2);
}
@Override
public double getPerimeter() {
	// TODO Auto-generated method stub
	return getSide() * 4;
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
	
	Square sqr=(Square) other;
	
	return (sqr.side == this.side);
}

public int hashCode() {
	return  this.sqrid;
}
}
