package java.com.alura.hotel.test;

import java.sql.Connection;
import java.sql.SQLException;

import java.com.alura.hotel.factory.ConnectionFactory;
import java.com.alura.hotel.model.Guests;

public class TestGuests {
	
	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.createConnection();

		Guests guests = new Guests(con);
		guests.createGuest("A", "B", "1999-12-31", "panamenio", "123");
		guests.readGuest(37);
		guests.updateGuest(41, "Z", "Z", "2000-12-31", "mexicano", "456");
		guests.deleteGuest(41);

	}

}
