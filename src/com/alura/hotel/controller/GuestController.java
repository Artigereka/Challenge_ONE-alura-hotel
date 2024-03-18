package com.alura.hotel.controller;

import java.util.Vector;
import java.util.List;

import com.alura.hotel.dao.GuestDAO;
import com.alura.hotel.factory.ConnectionFactory;
import com.alura.hotel.model.Guest;

public class GuestController {
	
	private GuestDAO guestDao;

	public GuestController(){
		this.guestDao = new GuestDAO(new ConnectionFactory().getConnection());
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
	
	public Vector<String> readGuestFullName(String name, String lastName){
		return guestDao.readGuestFullName(name, lastName);
	}

	public void updateGuest(Integer id, String name, String lastName, String birthDate, String nationality, String phone){
		guestDao.updateGuest(id, name, lastName, birthDate, nationality, phone);
	}

	public void deleteGuest(Integer id){
		guestDao.deleteGuest(id);
	}

}
