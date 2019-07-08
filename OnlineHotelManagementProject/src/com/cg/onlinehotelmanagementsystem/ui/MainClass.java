package com.cg.onlinehotelmanagementsystem.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.onlinehotelmanagementsystem.dto.RoomDetailsDto;
import com.cg.onlinehotelmanagementsystem.exception.RoomDetailsValidationException;
import com.cg.onlinehotelmanagementsystem.service.RoomDetailsServiceImpl;
import com.cg.onlinehotelmanagementsystem.service.IRoomDetailsService;
import com.cg.onlinehotelmanagementsystem.utility.ValidationClass;

/*
 * this is the ui class from where user interact
 */
public class MainClass {

	public static void main(String[] args) {

		int roomid = 0;
		int number_of_persons=0;
		String roomtype=null;
		double roomprice=0;
		int hotelid=0;
        
		Scanner scanner = new Scanner(System.in);
		// creating the object of interface class which is in service layer
		IRoomDetailsService booking = new RoomDetailsServiceImpl();
		// creating new object of our data transfer object class i.e. RoomDetails class
		RoomDetailsDto roomdetail = new RoomDetailsDto();
		ArrayList<RoomDetailsDto> list = new ArrayList<RoomDetailsDto>();
		try {

			System.out.println("press 1 to add\npress 2 to delete\npress 3 to modify");
			int variable = scanner.nextInt();
			switch (variable) {
			case 1:// taking input from user to add details
				try {
					System.out.println("set room id");
					roomid = scanner.nextInt();
				} catch (Exception e) {
					System.out.println(RoomDetailsValidationException.ROOMIDEXCEPTIONMESSAGE);
				}
				try {
					System.out.println("set number of persons");
					number_of_persons = scanner.nextInt();
				} catch (Exception e) {

					System.out.println(RoomDetailsValidationException.NUMBEROFPERSONSEXCEPTIONMESSAGE);
				}
				try {

					System.out.println("set room type");
					roomtype = scanner.next();
				} catch (Exception e) {
					System.out.println(RoomDetailsValidationException.ROOMTYPEEXCEPTIONMESSAGE);
				}
				try {
					System.out.println("set price of room");
					roomprice = scanner.nextDouble();
				} catch (Exception e) {
					System.out.println(RoomDetailsValidationException.PRICEEXCEPTIONMESSAGE);

				}
				try {
					System.out.println("set the hotel id");

					hotelid = scanner.nextInt();
				} catch (Exception e) {
					System.out.println(RoomDetailsValidationException.HOTELIDEXCEPTIONMESSAGE);
				}

				roomdetail.setRoomid(roomid);
				roomdetail.setNumber_of_persons(number_of_persons);
				roomdetail.setRoomtype(roomtype);
				roomdetail.setRoomprice(roomprice);
				roomdetail.setHotelid(hotelid);

				// we are passing the values of the attributes of roomdetails
				// to the function of service implementation class addRoomDetails
				// and storing the expected output in message

				String message = booking.addRoomDetails(roomdetail);
				// displaying the message
				System.out.println(message);

				break;
			case 2:// this is the deletion part, when user want to delete the
					// information of particular existing roomid
					// deletion through roomid
				System.out.println("enter the roomid of which you want to delete the information");
				try {
					int roomid1 = scanner.nextInt();
					String message1 = booking.deleteRoomDetails(roomid1);
					System.out.println(message1);
				} catch (Exception e) {
					System.out.println(RoomDetailsValidationException.ROOMIDEXCEPTIONMESSAGE);
				}

				break;
			case 3:// this is the modification part, when user want to modify
					// some information
				System.out.println("press 1 if you want to update number of person"
						+ "\npress 2 if you want to update price of room");
				int variable1 = scanner.nextInt();
				switch (variable1) {
				case 1:// calling function to update number of person
					try {
					System.out.println("enter the roomid in which you want to update the number of person");
					int roomid11 = scanner.nextInt();
					System.out.println("enter the number of person");
					int person = scanner.nextInt();
					String message1 = booking.updateNumberOfPerson(person, roomid11);
					System.out.println(message1);
					}
					catch(Exception e)
					{
						System.out.println(RoomDetailsValidationException.DETAILS_EXCEPTION); 
					}
					break;
				case 2:// calling function to update room price
					try {
					System.out.println("enter the roomid in which you want to update the number of person");
					int roomid12 = scanner.nextInt();
					System.out.println("enter the amount you want to update");
					double price = scanner.nextDouble();
					String message2 = booking.updateRoomPrice(price, roomid12);
					System.out.println(message2);
					}
					catch(Exception e)
					{
						System.out.println(RoomDetailsValidationException.DETAILS_EXCEPTION); 
					}
					break;
				default:
					System.out.println("please press either 1 or 2");
				}
				break;
			default:
				System.out.println("enter either 1 or 2 or 3");
			}

		} catch (Exception e) {
			System.out.println(RoomDetailsValidationException.DETAILS_EXCEPTION);
		}
		scanner.close();
	}

}
