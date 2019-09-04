/********************************************
 * Workshop # 8
 * Course:<JAC44>- 5
 * Last Name:<Trakas>
 * First Name<George>
 * ID: <108459173>
 * Section: <SCC>
 * This assignment represents my own work in accordance with
 * Seneca Academic Policy
 * George Trakas
 * Date: 4/4/2019
 * 
 ***********************************************/

package com.trakas.server;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Date;
import java.util.Scanner;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.IndexRange;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lab8Client extends Application{
	TextField tfName=new TextField();
	TextField tfMsg=new TextField();
	TextArea ta = new TextArea();	
    
	Button btSend = new Button("Send");			
	DataOutputStream toServer = null;
	DataInputStream fromServer = null;

	 public static void main(String[] args) {
		 launch(args);
	 }
				
		@Override // Override the start method in the Application class
		public void start(Stage primaryStage) {
			// Main pane
			BorderPane pane = new BorderPane();
		 	GridPane grid=new GridPane();
		 	grid.setHgap(5);
			grid.setVgap(5);
			grid.setAlignment(Pos.CENTER);
			
//			VBox root = new VBox();
		        
		
		 	grid.add(new Label("Please Enter Your Name: "), 0, 0);;
			grid.add(tfName, 1, 0);
			grid.add(new Label("Send Message: "), 0, 1);
			grid.add(tfMsg, 1, 1);	
			grid.add(btSend, 1, 2);
			grid.add(new Label("Type exit ignoreCase to exit in message"), 0, 2);
		    
			
			pane.getChildren().add(new TextField("Enter a name: "));
			pane.setTop(grid);
			pane.setCenter(new ScrollPane(ta));

			//pane.setBottom(btSend);
			// Create a scene and place it in the stage
			Scene scene = new Scene(pane, 400, 300);
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
			
			btSend.setOnAction(e -> {
				try {
					String name =tfName.getText();
					String message=tfMsg.getText();
					primaryStage.setTitle(name);
					toServer.writeUTF(name + ": " + message + "\n");
					//toServer.writeUTF(message);
					toServer.flush();

				if(message.equalsIgnoreCase("exit") )
						{
					Platform.exit();
						}
					
					
					 
				}
				catch(IOException  ex)
				{
					Platform.exit();
				}
			});
			

			try {
				// Create a socket to connect to the server
				Socket socket = new Socket("localhost", 4793);

								
				// Create an input stream to receive data from the server
				fromServer = new DataInputStream(socket.getInputStream());

				new Thread(new ReceiveMessage(socket)).start();
				// Create an output stream to send data to the server
				toServer = new DataOutputStream(socket.getOutputStream());
			}
			catch (IOException ex) {
				Platform.exit();
				ta.appendText(ex.toString() + '\n');
			}
		
			}
		class ReceiveMessage implements Runnable { //class receive message

	        private final Socket socket;//socket

	        public ReceiveMessage(Socket socket) {
	            this.socket = socket; 
	        }

	        public void run() {
	            try {
	                fromServer = new DataInputStream(socket.getInputStream());
	                while (true) {
	                	
	                    String textmessage = fromServer.readUTF(); 
	                    toServer.flush(); 
	                    Platform.runLater(() -> {
	                        ta.appendText(textmessage + " \n"); 
	                    });
	                }
	            } catch (IOException e) {
	                ta.appendText("Error " + e);
	            }
	        }
	    }

}
