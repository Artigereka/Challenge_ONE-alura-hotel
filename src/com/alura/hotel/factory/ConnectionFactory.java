package com.alura.hotel.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.alura.hotel.utils.DBCredentials;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	private DataSource datasource;
	
	public ConnectionFactory(){
		var pooledDataSource = new ComboPooledDataSource();
		pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/alura_hotel?useTimezone=true&serverTimezone=UTC");
		pooledDataSource.setUser(DBCredentials.getUsername());
		pooledDataSource.setPassword(DBCredentials.getPassword());
		pooledDataSource.setMaxPoolSize(10);

		this.datasource = pooledDataSource;
	}
	
	public Connection getConnection() {
		try {
			return this.datasource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

//	Single connection
//	public Connection createConnection() throws SQLException {
//	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_alura?useTimezone=true&serverTimezone=UTC", DBCredentials.getUsername(), DBCredentials.getPassword());
//	return connection;
//	}
	
}
