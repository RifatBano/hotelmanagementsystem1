package com.cg.onlinehotelmanagementsystem.dto;

import java.io.Serializable;

public class RoomDetails implements Serializable{

	private int roomid;
	private int number_of_person;
	private String roomtype;
	private double roomprice;
	public RoomDetails(int room_id, int numberofperson, String roomtype, double roomprice) {
		super();
		this.roomid = room_id;
		this.number_of_person = numberofperson;
		this.roomtype = roomtype;
		this.roomprice = roomprice;
	}
	public RoomDetails() {
		// TODO Auto-generated constructor stub
	}
	public int getRoom_id() {
		return roomid;
	}
	public void setRoom_id(int room_id) {
		this.roomid = room_id;
	}
	public int getNumberofperson() {
		return number_of_person;
	}
	public void setNumberofperson(int numberofperson) {
		this.number_of_person = numberofperson;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public double getRoomprice() {
		return roomprice;
	}
	public void setRoomprice(double roomprice) {
		this.roomprice = roomprice;
	}
	
	
}
