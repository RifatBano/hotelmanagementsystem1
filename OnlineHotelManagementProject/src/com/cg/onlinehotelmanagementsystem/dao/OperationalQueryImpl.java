package com.cg.onlinehotelmanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.onlinehotelmanagementsystem.dto.RoomDetails;
import com.cg.onlinehotelmanagementsystem.utility.DBConnection;
import com.cg.onlinehotelmanagementsystem.utility.Queries;

public class OperationalQueryImpl implements IOperationalQuery{


	@Override
	public String queryForAdd(RoomDetails roomdetail) throws SQLException {
		Connection connection=DBConnection.getConnection();
		String sql=Queries.ADDROOM;
		RoomDetails roomdetails=new RoomDetails();
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
	
		return null;
	}

}
