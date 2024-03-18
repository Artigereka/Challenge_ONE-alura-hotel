package com.alura.hotel.controller;

import java.util.Vector;
import java.util.List;

import com.alura.hotel.dao.ReserveDAO;
import com.alura.hotel.factory.ConnectionFactory;
import com.alura.hotel.model.Reserve;

public class ReserveController {
	
	private ReserveDAO reserveDao;
	
	public ReserveController() {
		this.reserveDao = new ReserveDAO(new ConnectionFactory().getConnection());
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

	public void updateReserve(Integer id, String dateIn, String dateOut, String price,	String paymentMethod) {
		reserveDao.updateReserve(id, dateIn, dateOut, price, paymentMethod);
	}

	public void deleteReserveId(Integer id) {
		reserveDao.deleteReserveId(id);
	}

	public void deleteReserveGuestId(Integer guestId) {
		reserveDao.deleteReserveGuestId(guestId);
	}

}
