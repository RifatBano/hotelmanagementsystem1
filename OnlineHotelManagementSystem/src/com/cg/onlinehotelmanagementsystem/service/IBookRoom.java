package com.cg.onlinehotelmanagementsystem.service;

import com.cg.onlinehotelmanagementsystem.dao.ListData;
import com.cg.onlinehotelmanagementsystem.exception.NoRoomAvailable;
import com.cg.onlinehotelmanagementsystem.exception.PersonExceedException;
import com.cg.onlinehotelmanagementsystem.exception.RoomAlreadyBookedException;

public interface IBookRoom {
public boolean checkAvailability(String room_no,String hotel_id);
double bookRoom(int roomtype,ListData listdata,int numberperson)throws
PersonExceedException,RoomAlreadyBookedException,NoRoomAvailable;
void cancelRoom(int id);
}
