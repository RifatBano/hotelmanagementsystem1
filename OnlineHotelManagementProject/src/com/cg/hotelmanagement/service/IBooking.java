package com.cg.hotelmanagement.service;

import java.util.ArrayList;

import com.cg.onlinehotelmanagementsystem.dto.RoomDetails;
/*
 * creating an interface
 */
public interface IBooking {
  	ArrayList<RoomDetails> addRoomDetails(RoomDetails roomdetail);
	void deleteRoomDetails(ArrayList<RoomDetails> list, int i);
	void modifyRoomDetails(ArrayList<RoomDetails> list);
}
