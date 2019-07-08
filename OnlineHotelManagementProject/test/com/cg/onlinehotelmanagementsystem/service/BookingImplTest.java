package com.cg.onlinehotelmanagementsystem.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.cg.onlinehotelmanagementsystem.dao.IRoomDetailsDao;
import com.cg.onlinehotelmanagementsystem.dao.RoomDetailsDaoImpl;

class BookingImplTest {

RoomDetailsServiceImpl booking=new RoomDetailsServiceImpl();
//unit testing for adding room details
	@Test
	void testAddRooms() throws SQLException {
		IRoomDetailsDao daoobject=new RoomDetailsDaoImpl();	
		String result=daoobject.queryForAdd(306,2,"kingroom",4000.00,8);
		assertEquals("added",result);
	}
	//unit testing for deletion of the row mapped with unique roomid
	@Test
	void testDeleteRooms() throws SQLException {
	String result=booking.deleteRoomDetails(109);	
    assertEquals("deleted successfully",result);		
	}
	//unit testing for update the number of person of the given roomid
	@Test
	void testUpdatePerson() throws SQLException {
	String result=booking.updateNumberOfPerson(4,306);	
	assertEquals("table modified",result);	
	}
	//unit testing for update price of the given roomid
	@Test
	void testUpdatePrice() throws SQLException {
	String result=booking.updateRoomPrice(5000.00,301);
	assertEquals("table modified", result);
		
	}

}
