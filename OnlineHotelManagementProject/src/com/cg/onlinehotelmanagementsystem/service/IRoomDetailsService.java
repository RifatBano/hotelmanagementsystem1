package com.cg.onlinehotelmanagementsystem.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.onlinehotelmanagementsystem.dto.RoomDetailsDto;
/*
 * creating an interface of service layer
 */
public interface IRoomDetailsService {
	String updateNumberOfPerson(int person,int roomid) throws SQLException;
	String updateRoomPrice(double price,int roomid) throws SQLException ;
	String addRoomDetails(RoomDetailsDto roomdetail) throws SQLException;
	String deleteRoomDetails(int roomid) throws SQLException;

}
