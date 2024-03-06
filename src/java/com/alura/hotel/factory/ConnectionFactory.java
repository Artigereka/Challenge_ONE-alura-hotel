package java.com.alura.hotel.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.com.alura.hotel.utils.DBCredentials;

public class ConnectionFactory {
	
	DBCredentials dbc = new DBCredentials();
	
	public Connection createConnection() throws SQLException{
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alura_hotel?useTimezone=true&serverTimezone=UTC",
				dbc.getUsername(), dbc.getPassword());
		return connection;
	}
}
