package java.com.alura.hotel.controller;

import java.util.Vector;

import java.com.alura.hotel.dao.GuestDAO;
import java.com.alura.hotel.factory.ConnectionFactory;
import java.com.alura.hotel.model.Guest;
import java.sql.SQLException;

public class GuestController {
	
	private GuestDAO guestDao;

	public GuestController() throws SQLException {
		this.guestDao = new GuestDAO(new ConnectionFactory().createConnection());
	}

	public void createGuest(Guest guest) {
		guestDao.createGuest(guest);
	}

	public Vector<String> readGuest(String lastName){
		return guestDao.readGuest(lastName);
	}

	public void updateGuest(Integer id, String name, String lastName, String birthDate, String nationality, String phone){
		guestDao.updateGuest(id, name, lastName, birthDate, nationality, phone);
	}

	public void deleteGuest(Integer id){
		guestDao.deleteGuest(id);
	}

}
