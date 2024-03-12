package com.alura.hotel.controller;

import java.util.Vector;
import java.util.List;

import com.alura.hotel.dao.ReserveDAO;
import com.alura.hotel.factory.ConnectionFactory;
import com.alura.hotel.model.Reserve;
import java.sql.SQLException;

public class ReserveController {
	
	private ReserveDAO reserveDao;
	
	public ReserveController() throws SQLException {
		this.reserveDao = new ReserveDAO(new ConnectionFactory().createConnection());
	}
	
	public void createReserve(Reserve reserve, Integer guestId) {
		reserve.setGuestId(guestId);
		reserveDao.createReserve(reserve);
	}

	public Vector<String> readReserveId(Integer id) {
		return reserveDao.readReserveId(id);
	}
	
	public List<Vector<String>> readReserveGuestId(Integer guestId){
		return reserveDao.readReserveGuestId(guestId);
	}

	public void updateReserve(Integer id, Integer guestId, String dateIn, String dateOut, String price,	String paymentMethod) {
		reserveDao.updateReserve(id, guestId, dateIn, dateOut, price, paymentMethod);
	}

	public void deleteReserveId(Integer id) {
		reserveDao.deleteReserveId(id);
	}

	public void deleteReserveGuestId(Integer guestId) {
		reserveDao.deleteReserveGuestId(guestId);
	}

}
