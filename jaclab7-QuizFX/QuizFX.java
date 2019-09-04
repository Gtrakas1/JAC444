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
package com.trakas.QuizFX;


import java.text.DecimalFormat;
import java.util.LinkedHashSet;
import java.util.Set;

import com.trakas.classes7.QuizNum;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class QuizFX extends Application {
	
TextField tfAdd=new TextField();
TextField tfSub=new TextField();
TextField tfMul=new TextField();
TextField tfDiv=new TextField();
TextField tfTryAg=new TextField();
QuizNum num=new QuizNum();
Set<Integer> ansSet=new LinkedHashSet<>();
int right=0;
Label lbRight=new Label("Number of correct anserws: " + right );
int wrong=0;
Label lbWrong=new Label("Number of wrong answers: "+ wrong);
Label lbExc=new Label();
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		DecimalFormat df=new DecimalFormat();
		df.setMaximumFractionDigits(0);

		GridPane grid=new GridPane();
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setAlignment(Pos.CENTER);
		
		grid.add(new Label("Two randomly generated numbers are: "+ df.format(num.getRand1()) +" and "+ df.format(num.getRand2())), 0, 0);
		
		grid.add(new Label("What is the addition of " + df.format(num.getRand1()) +" and "+ df.format(num.getRand2())),0, 1);
		grid.add(tfAdd, 1, 1);
		tfAdd.setOnAction(e->addSum(num.getRand1(),num.getRand2()));
		
		grid.add(new Label("What is the subtraction of " + df.format(num.getRand1()) +" and "+ df.format(num.getRand2())),0, 2);
		grid.add(tfSub, 1, 2);
		tfSub.setOnAction(e->subSum(num.getRand1(),num.getRand2()));
		
		grid.add(new Label("What is the multiplication of " + df.format(num.getRand1()) +" and "+ df.format(num.getRand2())),0, 3);
		grid.add(tfMul, 1, 3);
		tfMul.setOnAction(e->multiSum(num.getRand1(),num.getRand2()));
		
		grid.add(new Label("What is the division of " + df.format(num.getRand1()) +" and "+ df.format(num.getRand2())),0, 4);
		grid.add(tfDiv, 1, 4);
		tfDiv.setOnAction(e->divSum(num.getRand1(),num.getRand2()));
		
		grid.add(lbRight,0, 5);
		grid.add(lbWrong,0, 6);
		
		grid.add(lbExc, 0, 9);
		
		grid.add(new Label("Would you like to try again with different numbers? "), 0, 8);
		grid.add(tfTryAg, 1, 8);
		tfTryAg.setOnAction(e->{
			
			if(tfTryAg.getText().equalsIgnoreCase("N"))
			{
				primaryStage.close();
			}else if(tfTryAg.getText().equalsIgnoreCase("Y"))
			{	primaryStage.close();
			
			    QuizFX qf=new QuizFX();
			    try {
					qf.start(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else {
				lbExc.setText("Please input an ignore case y or N");
			}
		});
		
		Scene scene=new Scene(grid,500,400);
		primaryStage.setTitle("Quiz Application" );
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
public static void main(String[] args) {
	
	launch(args);
}

public  void addSum(double x, double y) {
try {	
	double sum= Double.parseDouble(tfAdd.getText());
	
	QuizNum num=new QuizNum(x,y,sum);
	  if(num.getRand1()+num.getRand2() != sum){
		 
		ansSet.add(wrong++) ;
		 tfAdd.setStyle("-fx-border-color: red");
		 lbWrong.setText("Number of wrong answers: "+ wrong);
		 System.out.println("Wrong " + ansSet); 
	 }else {
		 tfAdd.setStyle("-fx-border-color: green"); 
			sum=num.getRand1()+num.getRand2();
			ansSet.add(right++); 
			lbRight.setText("Number of correct anserws: " + right);
			System.out.println("Right " + ansSet); 
		
	 }
}catch(NumberFormatException e)
{
	lbExc.setText(" Please input a valid number for addition");
}
	
	
}

public  void subSum(double x, double y) {
	try {	
	
	double sum= Double.parseDouble(tfSub.getText());
	
	QuizNum num=new QuizNum(x,y,sum);
	 if(num.getRand1()-num.getRand2() != sum)
	 {
		 ansSet.add(wrong++); 
		 tfSub.setStyle("-fx-border-color: red");
		 lbWrong.setText("Number of wrong answers: "+ wrong);
		 System.out.println("Wrong " + ansSet); 
	 }
	 else {
		 
		 	tfSub.setStyle("-fx-border-color: green"); 
			sum=num.getRand1()+num.getRand2();
			ansSet.add(right++); 
			lbRight.setText("Number of correct anserws: " + right );
			System.out.println("Right " + ansSet); 
		 
	 }
	}catch(NumberFormatException e)
	{
		lbExc.setText(" Please input a valid number for subtraction");
	}
	 
	 
	
}

public  void multiSum(double x, double y) {
	try {	
	
	double sum= Double.parseDouble(tfMul.getText());
	
	QuizNum num=new QuizNum(x,y,sum);
	
	 if((num.getRand1() *num.getRand2()) != sum)
	 {
		 ansSet.add(wrong++); 
		 tfMul.setStyle("-fx-border-color: red");
		 lbWrong.setText("Number of wrong answers: "+ wrong);
		 System.out.println("Wrong " + ansSet); 
	 }
	 else {
		 tfMul.setStyle("-fx-border-color: green"); 
			sum=num.getRand1()+num.getRand2();
			ansSet.add(right++); 
			lbRight.setText("Number of correct anserws: " + right );
			System.out.println("Right " + ansSet);  
	 }
	}catch(NumberFormatException e)
	{
		lbExc.setText(" Please input a valid number for multiplication");
	}
	 
	
}

public void divSum(double x, double y) {
	try {	
	
	double sum= Double.parseDouble(tfDiv.getText());
	
	QuizNum num=new QuizNum(x,y,sum);
	 if((num.getRand1()/num.getRand2()) != sum)
	 {
		 ansSet.add(wrong++); 
		 tfDiv.setStyle("-fx-border-color: red");
		 lbWrong.setText("Number of wrong answers: "+ wrong);
		 System.out.println("Wrong " + ansSet); 
	 }
	 else {
		 tfDiv.setStyle("-fx-border-color: green"); 
			sum=num.getRand1()+num.getRand2();
			ansSet.add(right++); 
			lbRight.setText("Number of correct anserws: " + right );
			System.out.println("Right " + ansSet);  
		 
	 }
	}catch(NumberFormatException e)
	{
		lbExc.setText(" Please input a valid number for division");
	}

	 
}
}

