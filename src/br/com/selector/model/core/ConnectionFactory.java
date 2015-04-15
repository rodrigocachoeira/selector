package br.com.selector.model.core;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;



public class ConnectionFactory {

	public static final int MYSQL = 0;
	private static final String MysqlDriver = "com.mysql.jdbc.Driver";

	public static Connection connection(String url, String user,
			String password, int bank) throws SQLException {	

		switch (bank) {
		case ConnectionFactory.MYSQL:
			try {
				Class.forName(ConnectionFactory.MysqlDriver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			break;
		}
		return DriverManager.getConnection(url, user, password);
	}

}
