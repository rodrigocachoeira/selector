package br.com.selector.model.core;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

abstract public class ConnectionHelper {

	private static final String url = "jdbc:mysql://localhost/selector";
	private static final String user = "root";
	private static final String password = "mysqldigo";
	private static final int bank = ConnectionFactory.MYSQL;
	protected static Connection connection;
	protected static PreparedStatement pstmt;

	public static void connection() {
		try {
			ConnectionHelper.connection = ConnectionFactory.connection(
					ConnectionHelper.url, ConnectionHelper.user,
					ConnectionHelper.password, ConnectionHelper.bank);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			ConnectionHelper.connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
