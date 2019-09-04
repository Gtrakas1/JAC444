/********************************************
 * Workshop # 7
 * Course:<JAC44>- 5
 * Last Name:<Trakas>
 * First Name<George>
 * ID: <108459173>
 * Section: <SCC>
 * This assignment represents my own work in accordance with
 * Seneca Academic Policy
 * George Trakas
 * Date: 3/29/2019
 * 
 ***********************************************/
package com.trakas.classes7;

import java.text.DecimalFormat;

public class QuizNum {
	private double rand1= (int)((Math.round(10*Math.random()))+1);
	private double rand2= (int)((Math.round(10*Math.random()))+1);
	private double sum;
	
	public QuizNum() {};
	
	public QuizNum(double num1, double num2, double sum)
	{
		this.rand1=num1;
		this.rand2=num2;
		this.sum=sum;
	}
	public double getRand1() {
		return rand1;
	}
	public void setRand1(double rand1) {
		this.rand1 = rand1;
	}
	public double getRand2() {
		return rand2;
	}
	public void setRand2(double rand2) {
		this.rand2 = rand2;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

}
