package java.com.alura.hotel.controller;

import java.util.Vector;
import java.util.List;

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

	public List<Vector<String>> readGuestLastName(String lastName){
		return guestDao.readGuestLastName(lastName);
	}
	
	public Vector<String> readGuestId(Integer id){
		return guestDao.readGuestId(id);
	}

	public void updateGuest(Integer id, String name, String lastName, String birthDate, String nationality, String phone){
		guestDao.updateGuest(id, name, lastName, birthDate, nationality, phone);
	}

	public void deleteGuest(Integer id){
		guestDao.deleteGuest(id);
	}

}
