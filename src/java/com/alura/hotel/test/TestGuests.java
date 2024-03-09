package java.com.alura.hotel.test;

import java.sql.Connection;
import java.sql.SQLException;

import java.com.alura.hotel.controller.GuestController;
import java.com.alura.hotel.dao.GuestDAO;
import java.com.alura.hotel.factory.ConnectionFactory;
import java.com.alura.hotel.model.Guest;

@SuppressWarnings("unused")
public class TestGuests {
	
	public static void main(String[] args) throws SQLException {

		GuestController gc = new GuestController();
		Guest antonio = new Guest("Ganso", "Manso", "1995-08-08", "Mexicano", "123");

//		Guest guests = new Guest(con);
//		guests.createGuest("Artzai", "Guereca", "1999-12-31", "awefawfawefa", "123");
//		guests.readGuest("to");
//		guests.updateGuest(41, "Z", "Z", "2000-12-31", "mexicano", "456");
//		guests.deleteGuest(44);

	}

}
