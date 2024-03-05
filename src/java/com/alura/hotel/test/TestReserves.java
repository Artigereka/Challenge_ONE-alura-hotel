package java.com.alura.hotel.test;

import java.sql.Connection;
import java.sql.SQLException;

import java.com.alura.hotel.factory.ConnectionFactory;
import java.com.alura.hotel.model.Reserves;

public class TestReserves {
	
	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.createConnection();

		Reserves reserves = new Reserves(con);
		reserves.createReserve(40, "2022-02-02", "2022-02-03", "1", "efectivo");
		reserves.readReserve(3);
		reserves.updateReserve(3, 2, "2019-01-01", "2019-01-03", "2", "tarjeta");
		reserves.deleteReserve(3);
	}

}
