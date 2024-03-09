package java.com.alura.hotel.controller;

import java.util.Vector;

import java.com.alura.hotel.dao.ReserveDAO;
import java.com.alura.hotel.factory.ConnectionFactory;
import java.com.alura.hotel.model.Reserve;
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

	public Vector<String> readReserve(Integer id) {
		return reserveDao.readReserve(id);
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
