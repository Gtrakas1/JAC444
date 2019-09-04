/********************************************
 * Workshop # 6
 * Course:<JAC44>- 5
 * Last Name:<Trakas>
 * First Name<George>
 * ID: <108459173>
 * Section: <SCC>
 * This assignment represents my own work in accordance with
 * Seneca Academic Policy
 * George Trakas
 * Date: 3/22/2019
 * 
 ***********************************************/
package com.trakas.javafx6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import com.trakas.classes5.BabyNames;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class Babyfx extends Application {
	BabyNames baby=new BabyNames();	
	TextField tfYear=new TextField();
	TextField tfGender=new TextField();
	TextField tfName=new TextField();
	Button btnQuery=new Button("Submit Query");
	Label lbResult=new Label();
	Button btnExit=new Button("Exit");

	@Override
	public void start(Stage primaryStage) throws Exception {

try {
	GridPane grid=new GridPane();	
	 HBox box=new HBox();
		 box.getChildren().addAll(btnQuery,btnExit);
	 grid.add(new Label("Enter the Year: "),0,0);
	 grid.add(tfYear,1,0);
	 
	 grid.add(new Label("Enter the Gender: "),0,1);
	 grid.add(tfGender,1,1);
	 
	 grid.add(new Label("Enter the Name: "),0,3);
	 grid.add(tfName,1,3);
	 
	 grid.add(lbResult,0,4);
	 
	 grid.add(box,0,5);
	 
	 grid.setPadding(new Insets(10,10,20,10));
	 grid.setStyle("-fx-background-color : #ccd4e2;");
	 grid.setVgap(10.0);
	 grid.setHgap(10.0);
	 grid.setAlignment(Pos.CENTER);
	 
	
		
	 /* setUpValidation(tfYear);
	 setUpValidation(tfName);
	 setUpValidation(tfGender);*/
	 
	 btnQuery.setOnAction(e->getBtnResult());
	 btnExit.setOnAction(e->{
		 primaryStage.close();
			Stage stage= new Stage();
			GridPane pane=new GridPane();
			pane.add(new Label("Do you want to find another name: "), 0, 0);
			TextField tfYesNo=new TextField();
			pane.add(tfYesNo, 1, 0);
			Button btnConfirm=new Button("confirm");
			pane.add(btnConfirm, 0, 5);
			Label tfLbl=new Label();
			pane.add(tfLbl,0,4);
			
			btnConfirm.setOnAction(b->{
				String YesNo=tfYesNo.getText();
				if(YesNo.equalsIgnoreCase("Y")) {
					stage.close();
					primaryStage.show();
				}
				else if(YesNo.equalsIgnoreCase("N")) {
					System.exit(0);
					
				}else {
					tfLbl.setText("Please input (Y,y,n or n) ");
				}
			});
			pane.setPadding(new Insets(10,10,10,20));
			pane.setStyle("-fx-background-color : #ccd4e2;");
			pane.setVgap(10);
			pane.setHgap(10);
			pane.setAlignment(Pos.CENTER);
			Scene scene=new Scene(pane,600,300);
			//scene.getStylesheets().add(getClass().getResource("text-field-red-border.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			
 
	 });
	 

	
		Scene scene=new Scene(grid,600,300);
		primaryStage.setTitle("BabyNameRanks");
		primaryStage.setScene(scene);
		primaryStage.show();

}catch(NumberFormatException e)
{
	
e.getMessage();	
}

		
	}
	public static void main(String[] args) {
		
		launch(args);
	}

	
private void getBtnResult() {
	
	try {
		int year=Integer.parseInt(tfYear.getText());
		String gender=tfGender.getText();
		String name=tfName.getText();
			
		BabyNames baby=new BabyNames(year,gender,name);
		//TextField validation
				
			 
		File file=new File("babynamesranking" + baby.getYear() + ".txt");
		
		BufferedReader	br=new BufferedReader(new FileReader(file));
		String line;
		String[] result;
		
		String rank="";
		while((line=br.readLine()) != null ) {
		result=line.split("\\s+");	
		
		if(baby.getGender().equalsIgnoreCase("M") && baby.getName().equalsIgnoreCase(result[1]))
		{
			rank=result[0];
			
		}
	    if(baby.getGender().equalsIgnoreCase("F") && baby.getName().equalsIgnoreCase(result[3]) ) {
			rank=result[0];
			
		}
	
		}
		/*while(line != null  && line.toLowerCase().contains(baby.getName().toLowerCase()));
		{
			
			// Seperates line into array of Strings
			result=line.split("\\s+");
			if((baby.getGender().equalsIgnoreCase("M")) && result[1] == baby.getName())	
			{
			
				System.out.println("Worked");
			}
			else if((baby.getGender().equalsIgnoreCase("F")) && result[3] ==baby.getName())
			{
				lbResult.setText(rank);
			}
			else {
				rank="";
			}
			}*/
			br.close();
				
			
		
		displayLabel(baby.getYear(),baby.getGender(),baby.getName(),rank);
	}catch(FileNotFoundException e) {
		lbResult.setText("File not found. Please Try Again");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		lbResult.setText("Invalid input.Please Try Again");
	}catch(NumberFormatException e)
	{
		lbResult.setText("One or more Textfields are blank\n or invalid. Please fill in TextField");
	}
	
}

private void displayLabel(int year, String gender, String name, String rank) {
	
	 year=Integer.parseInt(tfYear.getText());
	gender=tfGender.getText();
	name=tfName.getText();
	BabyNames baby=new BabyNames(year,gender,name);
	String gen = null;
	if(rank.equals("")) {
		lbResult.setText("Either Name does not exist in ranking\n Or you did not input a correct gender(M,m,F or f)");
	
	}
	else {
		if(baby.getGender().equals("M"))
		{
			gen="Boy Name ";
		}else if (baby.getGender().equals("F"))
		{
			gen="Girl Name ";
		}else {
			lbResult.setText("Please input a proper gender (M or F)");
	
		}
		lbResult.setText(gen + baby.getName() +" is ranked # " + rank + " in year " + baby.getYear());
	}
	
}

//Field Validation

/*private void setUpValidation(final TextField tf) { 
    tf.textProperty().addListener((ChangeListener<? super String>) new ChangeListener<String>() {

        @Override
        public void changed(ObservableValue<? extends String> observable,
                String oldValue, String newValue) {
            validate(tf);
        }

	
    });

    validate(tf);
}

private void validate(TextField tf) {
    ObservableList<String> styleClass = tf.getStyleClass();
    if (tf.getText().trim().length()==0) {
        if (! styleClass.contains("error")) {
            styleClass.add("error");
        }
    } else {
        // remove all occurrences:
        styleClass.removeAll(Collections.singleton("error"));                    
    }
}
*/

}






