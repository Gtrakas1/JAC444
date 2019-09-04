package com.trakas.serialized5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.trakas.classes5.Account;

public class SerializeAccount {
	try {
	
Account acct=new Account();
Scanner input=new Scanner(System.in);
String file="account.dat";


	while(input.hasNext())
	{
		System.out.print("Please enter Account Information: ");
		acct=new Account(input.nextInt(),input.nextDouble(),input.next(),input.next());
		FileOutputStream fileout=new FileOutputStream(file);
		ObjectOutputStream out=new ObjectOutputStream(fileout);
		
		out.writeObject(acct);
		
		out.close();
		fileout.close();
	}
	}catch(IOException e) {
		e.printStackTrace();
		
	}
	acct=null;
}



