package br.com.selector.model.dao;

import java.util.Date;
import java.util.List;

import br.com.selector.model.entities.Room;
import br.com.selector.model.entities.RoomUser;
import br.com.selector.model.entities.User;

public interface RoomUserDao {

	public void save(RoomUser roomUser);

	public void delete(RoomUser roomUser);

	public List<?> list();

	public RoomUser find(Date date);

	public RoomUser find(Room room);

	public RoomUser find(User user);

	public RoomUser find(Room room, User user);

}
