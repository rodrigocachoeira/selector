package br.com.selector.model.dao.jdbc;

import java.util.List;

import br.com.selector.model.core.ConnectionHelper;
import br.com.selector.model.dao.UserDao;
import br.com.selector.model.entities.User;

public class JDBCUserDao extends ConnectionHelper implements UserDao {

	public JDBCUserDao() {
		ConnectionHelper.connection();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<?> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User find(String user) {
		// TODO Auto-generated method stub
		return null;
	}

}
