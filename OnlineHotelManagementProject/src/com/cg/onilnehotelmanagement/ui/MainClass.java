package com.cg.onilnehotelmanagement.ui;

import java.util.Scanner;

import com.cg.onlinehotelmanagementsystem.exception.RoomDetailsValidationException;
import com.cg.onlinehotelmanagementsystem.utility.DBConnection;

public class MainClass {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    try
    {
    	DBConnection dbConnection=new DBConnection();
        dbConnection.getConnection();
        
    }
    catch(Exception e)
    {
    	System.out.println(RoomDetailsValidationException.DETAILS_EXCEPTION);
    }
    scanner.close();
	}

}
