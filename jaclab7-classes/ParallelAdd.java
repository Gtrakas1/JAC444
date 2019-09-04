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


public class ParallelAdd {

	final private int SIZE=2000;
	private  double[][] a=new double[SIZE][SIZE];
	private  double[][] b=new double[SIZE][SIZE];
	
	void initialMat(double[][] a, double[][] b)
	{
		setA(a);
		setB(b);
		
		for(int i=0;i < SIZE; i++)
		{
			for(int j=0;j < SIZE; j++)
			{
				a[i][j]=Math.random() ;
				b[i][j]=Math.random() ;
			}
		}
	}
	
 	synchronized double[][] parallelAddMatrix(double[][] one, double[][] two)
	{
 		int row=one.length/4;
		int col=one[0].length;
		double[][] result1=new double[row][col];
		double[][] result = new double[row*2][col*2];
		Thread t1=new Thread() {
			public void run() {
				
		for(int i=0;i < result1.length;i++)
				{
					for(int j=0; j < result1[i].length; j++)
					{
			 		
						
						result[i][j] = one[i][j] + two[i][j];
							
					}
				}
						
			}
			
		}; 
		
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=0;i < result1.length;i++)
				{
					for(int j=0; j < result1[i].length; j++)
					{

	 		
						result[i][j] = one[i][j] + two[i][j];
							
					}
				}
						
			}
			
		};
		
		Thread t3=new Thread() {
			public void run() {
				for(int i=0;i < result1.length;i++)
				{
					for(int j=0; j < result1[i].length; j++)
					{
			 		
						
						result[i][j] = one[i][j] + two[i][j];
							
					}
				}
						
			}
			
		}; 
		
		Thread t4=new Thread() {
			public void run() {
				for(int i=0;i < result1.length;i++)
				{
					for(int j=0; j < result1[i].length; j++)
					{
			 		
						
						result[i][j] = one[i][j] + two[i][j];
							
					}
				}
						
			}
			
		}; 
		
		t1.start();
		
		t2.start();
		t3.start();
		t4.start();
		
		return result;
	}
	
	 synchronized double[][] SeqAddMatrix(double[][] one, double[][] two)
		{
			int row=one.length;
			int col=one[0].length;
			double[][] result=new double[row][col];
			
			Thread t1=new Thread() {
				public void run() {
								for(int i=0;i < one.length;i++)
					{
						for(int j=0; j < one[i].length; j++)
						{
							result[i][j] = one[i][j] + two[i][j];
							
						}
					}
					
						
				}
			};
				
			t1.start();
			return result;
		}
		
	
	
	



	public double[][] getA() {
		return a;
	}




	public void setA(double[][] a) {
		this.a = a;
	}




	public double[][] getB() {
		return b;
	}




	public  void setB(double[][] b) {
		this.b = b;
	}


	
}

/*class ParThread1 implements Runnable{

	ParallelAdd par=new ParallelAdd();
	
	ParThread1(ParallelAdd p)
	{
		this.par=p;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long time = System.nanoTime();
		ParallelAdd.parallelAddMatrix(par.getA(),par.getB());
		System.out.println("ParalellAdd1 " + ((System.nanoTime()-time)) + " msec ");
	}
	
	
}*/

/*class ParThread2 implements Runnable{

	ParallelAdd par=new ParallelAdd();
	
	ParThread2(ParallelAdd p)
	{
		this.par=p;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		ParallelAdd.parallelAddMatrix(par.getA(),par.getB());
		
		System.out.println("ParalellAdd2 " + ((System.currentTimeMillis()-time)) + " msec ");
	}
	
		
}

class ParThread3 implements Runnable{

	ParallelAdd par=new ParallelAdd();
	
	ParThread3(ParallelAdd p)
	{
		this.par=p;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		ParallelAdd.parallelAddMatrix(par.getA(),par.getB());
		
		System.out.println("ParalellAdd3 " + ((System.currentTimeMillis()-time)) + " msec ");
	}
}
	
	class SeqThread4 implements Runnable{
		ParallelAdd  par;
		SeqThread4(ParallelAdd par){
			this.par = par;
		}
		@Override
		public void run() {
			long time = System.currentTimeMillis();
			par.SeqAddMatrix(par.getA(), par.getB());
			System.out.println("SeqAdd1 " + (System.currentTimeMillis()-time) + " msec ");
		}
	}

	class SeqThread5 implements Runnable{
		ParallelAdd  par;
		SeqThread5(ParallelAdd par){
			this.par = par;
		}
		@Override
		public void run() {
			long time = System.currentTimeMillis();
			par.SeqAddMatrix(par.getA(), par.getB());
			System.out.println("SeqAdd2 " + (System.currentTimeMillis()-time) + " msec ");
		}
	}

	class SeqThread6 implements Runnable{
		ParallelAdd  par;
		SeqThread6(ParallelAdd par){
			this.par = par;
		}
		@Override
		public void run() {
			long time = System.currentTimeMillis();
			par.SeqAddMatrix(par.getA(), par.getB());
			System.out.println("SeqAdd3 " + (System.currentTimeMillis()-time) + " msec ");
		}
	}
*/