package br.com.selector.model.entities;

import java.util.Date;

public class RoomUser {

	private int id;
	private Date date;
	private char type;
	private Room room;
	private User user;

	public RoomUser() {
		super();
	}

	public RoomUser(Date date, char type) {
		super();
		this.date = date;
		this.type = type;
	}

	public RoomUser(Date date, char type, Room room, User user) {
		super();
		this.date = date;
		this.type = type;
		this.room = room;
		this.user = user;
	}

	public RoomUser(int id, Date date, char type, Room room, User user) {
		super();
		this.id = id;
		this.date = date;
		this.type = type;
		this.room = room;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + type;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomUser other = (RoomUser) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (type != other.type)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoomUser [id=");
		builder.append(id);
		builder.append(", date=");
		builder.append(date);
		builder.append(", type=");
		builder.append(type);
		builder.append(", room=");
		builder.append(room);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}

}
