package com.cg.onlinehotelmanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import com.cg.onlinehotelmanagementsystem.dto.RoomDetailsDto;
import com.cg.onlinehotelmanagementsystem.exception.RoomDetailsValidationException;
import com.cg.onlinehotelmanagementsystem.utility.DBConnection;
import com.cg.onlinehotelmanagementsystem.utility.Queries;

public class RoomDetailsDaoImpl implements IRoomDetailsDao {
	PreparedStatement preparedStatement = null;
	Connection connection = null;
	String message1 = null;
	String message2 = null;
	String message3 = null;
	String message4 = null;
	int result1 = 0;
	int result2 = 0;
	int result3 = 0 ;
	int result4 = 0;
	String sql1="";
	String sql2="";
	String sql3="";
	String sql4="";
	RoomDetailsDto roomdetail = new RoomDetailsDto();

//this function is called by addRoomDetails() from the service layer
	@Override
	public String queryForAdd(int roomid1, int noofpersons, String roomtype1, double price1, int hotelid1)
			throws SQLException {
		connection = DBConnection.getConnection();
		// setting the sql query in sql
		sql1 = Queries.ADDROOM;
		try {
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setInt(1, roomid1);
			preparedStatement.setInt(2, noofpersons);
			preparedStatement.setString(3, roomtype1);
			preparedStatement.setDouble(4, price1);
			preparedStatement.setInt(5, hotelid1);
			result1 = preparedStatement.executeUpdate();

			connection.commit();

		} catch (SQLException e) {
			System.out.println(RoomDetailsValidationException.MESSAGE);
			// e.printStackTrace();
		}
		if (result1 == 1) {
			message1 = "added";
		}

		return message1;
	}

	// queryForDelete() is called by deleteRoomDetails() from the service layer
	@Override
	public String queryForDelete(int roomid) throws SQLException {
		connection = DBConnection.getConnection();
		// setting the sql query in sql
		sql2 = Queries.DELETEROOM;
		try {
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.setInt(1, roomid);
			result2 = preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			System.out.println(RoomDetailsValidationException.MESSAGE);
		}
		if (result2 == 1) {
			message2 = "deleted successfully";
		}
		return message2;
	}

	// queryForUpdatePerson() is called by updateNumberOfPerson() from the service
	// layer
	@Override
	public String queryForUpdatePerson(int person, int roomid) throws SQLException {
		connection = DBConnection.getConnection();
		// setting the sql query in sql
		sql3 = Queries.UPDATEPERSON;
		try {
		preparedStatement = connection.prepareStatement(sql3);
		preparedStatement.setInt(1, person);
		preparedStatement.setInt(2, roomid);
		result3 = preparedStatement.executeUpdate();
		connection.commit();
		}
		catch(SQLException e)
		{
			System.out.println(RoomDetailsValidationException.MESSAGE);

		}
		if (result3 == 1) {
			message3 = "table modified";
		}
		return message3;
	}

	// queryForUpdatePerson() is called by updateRoomPrice() from the service layer
	@Override
	public String queryForUpdatePrice(double price, int roomid) throws SQLException {
		connection = DBConnection.getConnection();
		// setting the sql query in sql
	   sql4 = Queries.UPDATEPRICE;
	   try {
		preparedStatement = connection.prepareStatement(sql4);
		preparedStatement.setDouble(1, price);
		preparedStatement.setInt(2, roomid);

		result4 = preparedStatement.executeUpdate();
		connection.commit();
	   }
	   catch(SQLException e)
	   {
			System.out.println(RoomDetailsValidationException.MESSAGE);

	   }
		if (result4 == 1) {
			message4 = "table modified";
		}
		return message4;
	}
}
