package com.cg.onlinehotelmanagementsystem.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.onlinehotelmanagementsystem.dao.IOperationalQuery;
import com.cg.onlinehotelmanagementsystem.dao.OperationalQueryImpl;

public class DBConnection {
	
	
	public static Connection getConnection() throws SQLException {
		Connection connection = null;
		IOperationalQuery operationalquery=new OperationalQueryImpl();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		    connection=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
					PreparedStatement stmt=connection.prepareStatement(operationalquery.queryForAdd(null));  
					
			}
			catch(Exception e)
			{
				
			}
		finally
		{
			connection.close();
		}
		return connection;
	}

}