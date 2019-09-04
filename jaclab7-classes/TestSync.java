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

import com.trakas.classes7.ParallelAdd;

public class TestSync {
		
		public static void main(String args[]) {
			ParallelAdd add=new ParallelAdd();
			final int SIZE=2000;
			double[][] a=new double[SIZE][SIZE];
			double[][] b=new double[SIZE][SIZE];
			add.initialMat(a, b);
			
			long time = System.nanoTime();
			add.parallelAddMatrix(a,b);
			System.out.println("parallelAdd1 " + ((System.nanoTime()-time)/1000000.00) + " msec ");
			
			/*Thread t2=new Thread(new ParThread2(add));
			Thread t3=new Thread(new ParThread3(add));*/
					 time = System.nanoTime();
					add.SeqAddMatrix(a,b);
					System.out.println("SeqAdd1 " + ((System.nanoTime()-time)/1000000.00) + " msec ");
					
			
			//t2.start();
			//t3.start();
			//t4.start();
			
		}
}

