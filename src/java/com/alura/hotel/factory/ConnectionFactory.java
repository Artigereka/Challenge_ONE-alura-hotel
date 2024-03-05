package java.com.alura.hotel.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection createConnection() throws SQLException{
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alura_hotel?useTimezone=true&serverTimezone=UTC",
				"root", "root123");
		return connection;
	}
}
