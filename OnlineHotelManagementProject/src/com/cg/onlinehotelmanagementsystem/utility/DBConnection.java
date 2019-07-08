package com.cg.onlinehotelmanagementsystem.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.cg.onlinehotelmanagementsystem.exception.RoomDetailsValidationException;
/*
 * we are creating one class DBConnection in utility so that any time method can call this and utilize it
 */
public class DBConnection {
	
	
	public static Connection getConnection() throws SQLException {
		Connection connection = null;
			try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		    connection=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			
		}
			catch(Exception e)
			{
				System.out.println(RoomDetailsValidationException.MESSAGE2);
			}
		
		return connection;
	}
	
}