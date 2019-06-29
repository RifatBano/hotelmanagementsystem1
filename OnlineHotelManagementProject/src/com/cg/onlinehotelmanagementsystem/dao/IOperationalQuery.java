package com.cg.onlinehotelmanagementsystem.dao;

import java.sql.SQLException;

import com.cg.onlinehotelmanagementsystem.dto.RoomDetails;

public interface IOperationalQuery {

	public String queryForAdd(RoomDetails roomdetail) throws SQLException;

}
