package com.cg.onlinehotelmanagementsystem.dto;

import java.io.Serializable;

public class RoomDetailsDto implements Serializable{

	/**
	 * this entity class has implemented Serializable 
	 */
	private static final long serialVersionUID = 1L;
	private int roomid;
	private int number_of_persons;
	private String roomtype;
	private double roomprice;
	private int hotelid;
	public RoomDetailsDto(int roomid, int number_of_persons, String roomtype, double roomprice, int hotelid) {
		super();
		this.roomid = roomid;
		this.number_of_persons = number_of_persons;
		this.roomtype = roomtype;
		this.roomprice = roomprice;
		this.hotelid = hotelid;
	}
	public RoomDetailsDto() {
		// TODO Auto-generated constructor stub
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public int getNumber_of_persons() {
		return number_of_persons;
	}
	public void setNumber_of_persons(int number_of_persons) {
		this.number_of_persons = number_of_persons;
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
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hotelid;
		result = prime * result + number_of_persons;
		result = prime * result + roomid;
		long temp;
		temp = Double.doubleToLongBits(roomprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((roomtype == null) ? 0 : roomtype.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomDetailsDto other = (RoomDetailsDto) obj;
		if (hotelid != other.hotelid)
			return false;
		if (number_of_persons != other.number_of_persons)
			return false;
		if (roomid != other.roomid)
			return false;
		if (Double.doubleToLongBits(roomprice) != Double.doubleToLongBits(other.roomprice))
			return false;
		if (roomtype == null) {
			if (other.roomtype != null)
				return false;
		} else if (!roomtype.equals(other.roomtype))
			return false;
		return true;
	}
	
	
	
	
}
