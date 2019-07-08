package com.cg.onlinehotelmanagementsystem.service;

import java.sql.SQLException;
import java.util.ArrayList;
import com.cg.onlinehotelmanagementsystem.dao.IRoomDetailsDao;
import com.cg.onlinehotelmanagementsystem.dao.RoomDetailsDaoImpl;
import com.cg.onlinehotelmanagementsystem.dto.RoomDetailsDto;

//this is the implementation class of service Interface (IBooking)
public class RoomDetailsServiceImpl implements IRoomDetailsService{
	
	//we are creating object of IOperationalDao Interface 
	IRoomDetailsDao operationalquery=new RoomDetailsDaoImpl();
	RoomDetailsDto roomdetail=new RoomDetailsDto();
	
	//addRoomDetails() function is called by the main()
	@Override
	public String addRoomDetails(RoomDetailsDto roomdetail) throws SQLException {
		// TODO Auto-generated method stub
		int roomid1=roomdetail.getRoomid();
		int noofpersons=roomdetail.getNumber_of_persons();
		String roomtype1=roomdetail.getRoomtype();
		double price1=roomdetail.getRoomprice();
		int hotelid1=roomdetail.getHotelid();
		String result1=operationalquery.queryForAdd(roomid1,noofpersons,roomtype1,price1,hotelid1);
	    return result1;
	    
	}

//deleteRoomDetails function is called by the main()
	@Override
	public String deleteRoomDetails(int roomid) throws SQLException {
		
		// TODO Auto-generated method stub
		//deleting through roomid
		System.out.println(roomid);
		String result2=operationalquery.queryForDelete(roomid);
		
		return result2;
	}

//updateNumberOfPerson function is called by the main()
	@Override
	public String updateNumberOfPerson(int person,int roomid) throws SQLException {
		
		// TODO Auto-generated method stub
		//update the Number Of Person
		String result3=operationalquery.queryForUpdatePerson(person,roomid);
		return result3;
	}

//updateRoomPrice function is called by the main()
	@Override
	public String updateRoomPrice(double price,int roomid) throws SQLException {
	
		// TODO Auto-generated method stub
		//update the Room Price
		String result4=operationalquery.queryForUpdatePrice(price, roomid);
		return result4;
	}

	
	
	
	
}

