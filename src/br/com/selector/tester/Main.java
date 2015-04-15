package br.com.selector.tester;

import br.com.selector.model.core.Factory;
import br.com.selector.model.dao.UserDao;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = Factory.createUserDao();
		
		//userDao.save(null);

	}

}
