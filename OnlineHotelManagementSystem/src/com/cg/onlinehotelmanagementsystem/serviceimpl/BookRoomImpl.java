package com.cg.onlinehotelmanagementsystem.serviceimpl;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.cg.onlinehotelmanagementsystem.dao.KingRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.ListData;
import com.cg.onlinehotelmanagementsystem.exception.NoRoomAvailable;
import com.cg.onlinehotelmanagementsystem.exception.PersonExceedException;
import com.cg.onlinehotelmanagementsystem.exception.RoomAlreadyBookedException;
import com.cg.onlinehotelmanagementsystem.service.IBookRoom;

public class BookRoomImpl implements IBookRoom {
	public double bookRoom(int roomtype,ListData listdata,int numberperson)throws PersonExceedException,RoomAlreadyBookedException,NoRoomAvailable {
		if(roomtype==1)
		{
			KingRoomDetails krd=(KingRoomDetails)listdata.kingRoomList().get(0);
			if(krd.getNumberofperson()<numberperson)
				throw new PersonExceedException("You Exceed Accomodate Size of Room");
			else
			{
				if(krd.getStatus()==true)
					throw new RoomAlreadyBookedException("Room Already Booked");
				else
				{
					if(krd.getNumberofkingrooms()==0)
						throw new NoRoomAvailable("No Room Available");
					else {
						krd.setStatus(true);
						krd.setNumberofkingrooms(krd.getNumberofkingrooms()-1);
					}
				}
			}
			Random rand = new Random();
			
			
	}
		return ThreadLocalRandom.current().nextDouble();
	}

	public boolean checkAvailability(String room_no,String hotel_id) {
		
		if(room_no!=null && hotel_id!=null )
		{
			return true;
		}
		return false;
		
	}

	@Override
	public void cancelRoom(int id) {
		// TODO Auto-generated method stub
		
	}
}
