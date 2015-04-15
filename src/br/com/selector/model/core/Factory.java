package br.com.selector.model.core;

import br.com.selector.model.dao.RoomDao;
import br.com.selector.model.dao.RoomUserDao;
import br.com.selector.model.dao.UserDao;
import br.com.selector.model.dao.jdbc.JDBCRoomDao;
import br.com.selector.model.dao.jdbc.JDBCRoomUserDao;
import br.com.selector.model.dao.jdbc.JDBCUserDao;

public class Factory {

	public static RoomDao createRoomDao() {
		return new JDBCRoomDao();
	}

	public static UserDao createUserDao() {
		return new JDBCUserDao();
	}

	public static RoomUserDao createRoomUserDao() {
		return new JDBCRoomUserDao();
	}

}
