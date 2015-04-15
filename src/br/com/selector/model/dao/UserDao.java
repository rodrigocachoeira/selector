package br.com.selector.model.dao;

import java.util.List;

import br.com.selector.model.entities.User;

public interface UserDao {

	public static final String SQL_STANDARD_INSERT =  "INSERT INTO user ( username, password , role , active , created , modified) VALUES (?,?,?,?,?,?) ";
	public static final String SQL_STANDARD_REMOVE = "DELETE FROM user WHERE id = ?";
	public static final String SQL_STANDARD_UPDATE = "UPDATE user SET username = ? , password = ? , role = ?, active = ? , modified = ? WHERE id = ?";

	public void save(User user);

	public void delete(User user);

	public List<?> list();

	public User find(String user);

}
