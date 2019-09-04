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
package com.trakas.tester;

import com.trakas.javafx6.Babyfx;
import com.trakas.methods6.GbMeths;
import com.trakas.methods6.InputchkMethods;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class TesterClass extends Application {
	
	public static void main(String[] args) {
		GbMeths gb=new GbMeths();
		
		gb.startBox();
		Application.launch(Babyfx.class);
			
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
	/*	Button babyBtn=new Button("BabyFX");
		Button gbBox=new Button("Galton Box");
		
		VBox box=new VBox(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(babyBtn,gbBox);
		GridPane grid=new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setAlignment(Pos.CENTER);
		
		grid.add(new Label("Welcome to Georges Tester class for workshop 6"), 0, 0);
		grid.add(new Label("Please choose which Task you would like to test."), 0, 1);
		grid.add(babyBtn, 0, 2);
		grid.add(gbBox, 0, 3);
		
		Scene scene=new Scene(grid,400,350);
		primaryStage.setTitle("Tester");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		babyBtn.setOnAction(e->{
			Stage stage=new Stage();
			try {
				babfx.start(stage);
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			gbBox.setOnAction(f->{
				primaryStage.close();
				Stage stageGb=new Stage();
				try {
					gb.start(stageGb);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			});
		});
		*/
		
	}
}


