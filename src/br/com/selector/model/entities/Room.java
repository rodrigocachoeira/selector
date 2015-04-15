package br.com.selector.model.entities;

import java.util.Date;

public class Room {

	private int id;
	private char block;
	private int number;
	private boolean roomKey;
	private Date created;
	private Date modified;

	public Room(char block, int number, boolean roomKey, Date created,
			Date modified) {
		super();
		this.block = block;
		this.number = number;
		this.roomKey = roomKey;
		this.created = created;
		this.modified = modified;
	}

	public Room(char block, int number, boolean roomKey) {
		super();
		this.block = block;
		this.number = number;
		this.roomKey = roomKey;
	}

	public Room() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getBlock() {
		return block;
	}

	public void setBlock(char block) {
		this.block = block;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean getRoomKey() {
		return this.roomKey;
	}

	public void setRoomKey(boolean roomKey) {
		this.roomKey = roomKey;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + block;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((modified == null) ? 0 : modified.hashCode());
		result = prime * result + number;
		result = prime * result + (roomKey ? 1231 : 1237);
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
		Room other = (Room) obj;
		if (block != other.block)
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (id != other.id)
			return false;
		if (modified == null) {
			if (other.modified != null)
				return false;
		} else if (!modified.equals(other.modified))
			return false;
		if (number != other.number)
			return false;
		if (roomKey != other.roomKey)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [id=");
		builder.append(id);
		builder.append(", block=");
		builder.append(block);
		builder.append(", number=");
		builder.append(number);
		builder.append(", roomKey=");
		builder.append(roomKey);
		builder.append(", created=");
		builder.append(created);
		builder.append(", modified=");
		builder.append(modified);
		builder.append("]");
		return builder.toString();
	}

}
