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
import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.PrintWriter;
	import java.net.ServerSocket;
	import java.net.Socket;
import java.sql.Date;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

	public class Lab8Server extends Application{
		static java.util.Date date=new java.util.Date();
		TextArea ta = new TextArea();

		private ArrayList<Socket> clientList=new ArrayList<>();
		
		 public static void main(String[] args) {
			 launch(args);
		 }
		@Override // Override the start method in the Application class
		public void start(Stage primaryStage) {
			// Text area for displaying contents
		
			// Create a scene and place it in the stage
			Scene scene = new Scene(new ScrollPane(ta), 450, 200);
			primaryStage.setTitle("Server"); // Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage

			new Thread(() -> {
				try {
					// Create a server socket
					ServerSocket serverSocket = new ServerSocket(4793);
					
					Platform.runLater(() ->
						ta.appendText("Server started at " 
							+ date + "\n\n"));
					
	
					/*	DataInputStream inputFromClient2 = new DataInputStream(
								s2.getInputStream());
							DataOutputStream outputToClient2 = new DataOutputStream(
								s2.getOutputStream());
			*/
					
					while (true) {		
						Socket s=serverSocket.accept();
								
							clientList.add(s);
							for(int i=0; i < clientList.size();i ++) {
								
							if(clientList.size() > 2)
								{
								Socket tempSoc=clientList.get(3);
									tempSoc.close();
									clientList.remove(i);
									ta.appendText("Only 2 clients are allowed on this server");
								}
							}
						Platform.runLater(() -> {
							ta.appendText("Connected to client: "+ s +" at " + date + "\n\n");
						
							//ta.appendText("Connected to " + s2 +" at " + date + '\n');
					});
					
						new Thread(new ComThreads(s)).start();;
					}
				}
				catch (IOException ex) {
					ta.appendText(ex.toString() + "\n");;
				}
			}).start();
			
		
			
		}

		class ComThreads implements Runnable{
			  private Socket s;
			  java.util.Date date=new java.util.Date();
			  
			  public ComThreads(Socket s)
			  {
			    this.s=s;
			  }
			  
			  public void run()
			  {		try {
				  DataInputStream inputFromClient = new DataInputStream(
						s.getInputStream());
					DataOutputStream outputToClient = new DataOutputStream(
						s.getOutputStream());
					
					while(true) {
							String	line=inputFromClient.readUTF();
						for(int i=0; i < clientList.size();i ++) {
					Socket tempSoc=clientList.get(i);
					outputToClient=new DataOutputStream(tempSoc.getOutputStream());
					outputToClient.writeUTF(line);
					outputToClient.flush();
					
						}
					
					
					Platform.runLater(()->{
						ta.appendText(line);
						ta.appendText("\n");
					});
					
					
					}

			    } catch (IOException e) {
			      e.printStackTrace();
			    }finally {
					try {
						s.close();
					}catch(IOException e) {
						// later
					}
					
				}
			  
			  }
			  
			}			

		}	
	
	
