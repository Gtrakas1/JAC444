/********************************************
 * Workshop # 2
 * Course:<JAC44>- 5
 * Last Name:<Trakas>
 * First Name<George>
 * ID: <108459173>
 * Section: <SCC>
 * This assignment represents my own work in accordance with
 * Seneca Academic Policy
 * George Trakas
 * 
 ***********************************************/
package com.trakas.classes;

import java.util.Scanner;

public class Location {
	
  static Scanner input=new Scanner(System.in);	
  double maxVal;
  double row;
  double col;
  double[][] matrix;
 
 public Location(double[][] thematrix)
 {
	 this.matrix=new double[(int)(thematrix.length)][(int)(thematrix[0].length)];
	 matrix=thematrix;
	 
 }
 
 public static Location locateLargest(double[][] a)
 {
	 Location locate=new Location(a);
	 double maxVal=locate.matrix[0][0];
	 
	 for(int i=0; i<locate.matrix.length;i++)
	 {
		 for(int j=0;j<locate.matrix[0].length;j++) {
	 		if(locate.matrix[i][j]>maxVal) {
			 locate.maxVal=locate.matrix[i][j];
			locate.row=i;
			locate.col=j;
			}
		 }
	 }
	 System.out.println("The location of the largest element is " + locate.maxVal + " at ( " + locate.row + " " + locate.col +" )") ;
return locate;
 }
 


public static void displayLocation() {
	
	System.out.println("Enter the number of rows and columns in the array: ");
	int r=checkinputInt(); 
	int c=checkinputInt();
	double matrix[][]=new double[r][c];
	System.out.println("Enter the Array: ");
 for(int i=0; i < r;i++)
 {for(int j=0; j <c; j++)
 {
	matrix[i][j]=checkinputDouble();
 }
	 
 }
 locateLargest(matrix);
 input.close();
 }

public static int checkinputInt(){
	 
	while(!input.hasNextInt())
	{
		System.out.println("Please enter an integer: ");
		input.next();
	}
	int result=input.nextInt();
	return result;
		}

public static double checkinputDouble(){
	
	while(!input.hasNextDouble())
	{
		System.out.println("Please enter an Double: ");
		input.next();
	}
	double result=input.nextDouble();
	
	return result;
} 


}

