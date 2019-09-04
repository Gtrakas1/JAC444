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

import java.text.DecimalFormat;

public class Complex implements Cloneable {
public double aRe;
public double bIm;

public Complex(double real, double imagery)
{
	this.aRe=real;
	this.bIm=imagery;
	}

public Complex(double a){
	this.aRe=a;
	this.bIm=0;
}

public Complex(){
	this.aRe=0;
	this.bIm=0;
	
}

public double getReal(){
return aRe;
}

public double getImagery() {
	return bIm;
}

public void setReal(double enter_real)
{
	this.aRe=enter_real;
	}

public void setImagery(double enter_image)
{
	this.bIm=enter_image;
}

public Object clone() throws
CloneNotSupportedException{
	return (Complex)super.clone();
}

public String toString() {
	DecimalFormat df=new DecimalFormat();
	df.setMaximumFractionDigits(4);

    if (bIm == 0) { return aRe+ "";}
    else {
    return aRe+ " + " + bIm  + "i";
    }
    }

}
