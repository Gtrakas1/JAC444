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
package com.trakas.methodslab3;

import com.trakas.classeslab3.Complex;

public class ComplexMethods {
Complex com= new Complex();

public Complex add(Complex a,Complex b) {
	Complex temp= new Complex(com.getReal(),com.getImagery());
	double real=a.getReal()+b.getReal();
	double image=a.getImagery()+b.getImagery();
     temp=new Complex(real,image);
	return temp;
}

public Complex sub(Complex a,Complex b) {
	Complex temp= new Complex(com.getReal(),com.getImagery());
	double real=a.getReal()-b.getReal();
	double image=a.getImagery()-b.getImagery();
	 temp = new Complex(real,image);
	return temp;
	
	}

public Complex multi(Complex a, Complex b) {
	Complex temp= new Complex(com.getReal(),com.getImagery());
	double real=( (a.getReal()*b.getReal() )-((a.getImagery()*b.getImagery())));
	double image=((a.getImagery()*b.getReal()) + (a.getReal() * b.getImagery()));
	 temp = new Complex(real,image);
	return temp;
	
}

public Complex divide(Complex a, Complex b) {
	
	Complex temp= new Complex(com.getReal(),com.getImagery());
	double real=Math.round((((a.getReal()*(b.getReal())+(a.getImagery()*b.getImagery())) / ((Math.pow(b.getReal(), 2))+(Math.pow(b.getImagery(),2)))))*10000.0)/10000.0;
	double image=Math.round((((a.getImagery()* (b.getReal()) - (a.getReal() * b.getImagery())) / ((Math.pow(b.getReal(), 2))+(Math.pow(b.getImagery(),2)))))*10.0)/10.0;
	temp = new Complex(real,image);
	return temp;
	
}

public Complex abs(Complex a) {
	Complex temp= new Complex(com.getReal(),0);
	double real = (Math.pow(a.getReal(),2))+ (Math.pow(a.getImagery(),2));
	temp=new Complex(Math.sqrt(real));
	return temp;
}

}
