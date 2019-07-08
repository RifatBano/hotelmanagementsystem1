package com.cg.onlinehotelmanagementsystem.utility;

public class Queries {
	//query to add room
public static final String ADDROOM="insert into roomdetails (roomid,number_of_persons,roomtype,price,hotelid) values (?,?,?,?,?)";
//query to delete room
public static final String DELETEROOM="delete from roomdetails where roomid=?";
//query to update number of person
public static final String UPDATEPERSON="update roomdetails set number_of_persons=? where roomid=?";
//query to update price
public static final String UPDATEPRICE="update roomdetails set price=? where roomid=?";

}
