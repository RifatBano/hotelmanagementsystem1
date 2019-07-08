package com.cg.onlinehotelmanagementsystem.dao;

import java.sql.SQLException;

import com.cg.onlinehotelmanagementsystem.dto.RoomDetailsDto;

/*
 * creating interface of data access object layer
 */
public interface IRoomDetailsDao {

	public String queryForAdd(int roomid1, int noofpersons, String roomtype1, double price1, int hotelid1) throws SQLException;
	public String queryForDelete(int roomid) throws SQLException;
	public String queryForUpdatePerson(int person,int roomid) throws SQLException;
	public String queryForUpdatePrice(double price,int roomid) throws SQLException;
}
