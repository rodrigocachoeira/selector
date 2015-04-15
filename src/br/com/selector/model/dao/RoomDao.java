package br.com.selector.model.dao;

import java.util.List;

import br.com.selector.model.entities.Room;

public interface RoomDao {

	public void save(Room room);

	public void delete(Room room);

	public List<?> list();

	public Room find(char block, int number);

}
