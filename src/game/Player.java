package game;

import fixtures.Fixture;
import fixtures.Room;

public class Player {

	public Room currentRoom;
	
	public void currentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	
	
	
//	public Player(String name, String shortDescription, String longDescription) {
//	name = name;
//	shortDescription = shortDescription;
//	longDescription = longDescription;
//	this.currentRoom = currentRoom;
//	}
}
//public class Player extends Fixture {
//
//	private Room room;
//	
//	public Player(String aName, String aDescription, Room aRoom) {
//		super(aName, aDescription);
//		this.room = aRoom;
//	}
//	public void setRoom(Room aRoom) {
//		this.room = aRoom;
//	}
//	public Room getRoom() {
//		return this.room;
//	}
//}
