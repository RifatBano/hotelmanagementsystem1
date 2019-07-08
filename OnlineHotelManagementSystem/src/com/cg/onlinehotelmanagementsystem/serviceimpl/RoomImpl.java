package com.cg.onlinehotelmanagementsystem.serviceimpl;

import java.util.LinkedList;
import java.util.List;

import com.cg.onlinehotelmanagementsystem.dao.ACRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.KingRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.NonACRoomDetails;
import com.cg.onlinehotelmanagementsystem.dao.QueenRoomDetails;
import com.cg.onlinehotelmanagementsystem.service.IRoom;

public class RoomImpl implements IRoom {

	
	@Override
	public void addRoom(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof ACRoomDetails) {
		List<ACRoomDetails> acroom=new LinkedList<ACRoomDetails>();
		ACRoomDetails ac1=new ACRoomDetails(1,true,3000.0,2);
		ACRoomDetails ac2=new ACRoomDetails(1,true,3050.0,1);
		ACRoomDetails ac3=new ACRoomDetails(1,true,3500.0,2);
		acroom.add(ac1);
		acroom.add(ac1);
		acroom.add(ac1);
		}
		
		if(obj instanceof NonACRoomDetails) {
			List<NonACRoomDetails> nonacdetails=new LinkedList<NonACRoomDetails>();
			NonACRoomDetails ac1=new NonACRoomDetails(1,true,3000.0,2);
			NonACRoomDetails ac2=new NonACRoomDetails(1,true,3050.0,1);
			NonACRoomDetails ac3=new NonACRoomDetails(1,true,3500.0,2);
			nonacdetails.add(ac1);
			nonacdetails.add(ac1);
			nonacdetails.add(ac1);
			}
		if(obj instanceof KingRoomDetails) {
			List<KingRoomDetails> kingdetails=new LinkedList<KingRoomDetails>();
			KingRoomDetails ac1=new KingRoomDetails(1,true,3000.0,2);
			KingRoomDetails ac2=new KingRoomDetails(1,true,3050.0,1);
			KingRoomDetails ac3=new KingRoomDetails(1,true,3500.0,2);
			kingdetails.add(ac1);
			kingdetails.add(ac1);
			kingdetails.add(ac1);
			}
		if(obj instanceof QueenRoomDetails) {
			List<QueenRoomDetails> queendetails=new LinkedList<QueenRoomDetails>();
			QueenRoomDetails ac1=new QueenRoomDetails(1,true,3000.0,2);
			QueenRoomDetails ac2=new QueenRoomDetails(1,true,3050.0,1);
			QueenRoomDetails ac3=new QueenRoomDetails(1,true,3500.0,2);
			queendetails.add(ac1);
			queendetails.add(ac1);
			queendetails.add(ac1);
			}
		
	}
	
	@Override
	public void deleteRoom(Object obj) {
		// TODO Auto-generated method stub
		
		List<ACRoomDetails> acroom=new LinkedList<ACRoomDetails>();
		acroom.remove(obj);
		
		
		
	}
	@Override
	public void modifyRoom(Object obj) {
		// TODO Auto-generated method stub
		
		
	}
	
}
