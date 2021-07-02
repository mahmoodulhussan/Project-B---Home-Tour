package game;

import fixtures.Room;

public class RoomManager {
	

	private Room[] rooms = new Room[4] ;
	public Room startingRoom;


	
	public void init() {
		Room foyer = new Room(
				"Room: The Foyer",
				"Short Description: A small foyer",
				"Long Description: The small entryway of a neo-colonial house." 
				+ " A dining room is open to the south, where "
				+ "a large table can be seen." + "\n"
				+ "The hardwood floor leads west into doorway, " 
				+ "next to a staircase that leads up to a second floor." + "\n"
				+ "To the north is a small room, where you can see a piano.");
		this.rooms[0] = foyer;
		startingRoom = foyer;	
	
		Room livingRoom = new Room(
				"Room: Living Room",
				"Short Description: This is our living room.",
				"Long Description: We gather in the living room to talk, watch movies, "
				+ "play video games, and party. This most fun place in this house.");
		this.rooms[1] = livingRoom;


	

		Room library = new Room(
				"Room: Library",
				"Short Description: This is the our library",
				"Long Description: Shhhh!!! This is a quite place. We use this room to read books, " 
				+"prepare for exams, or to have some ME time aka medidation.");
		this.rooms[2] = library;

	
	
		Room bedRoom = new Room(
				"Room: Bed Room",
				"Short Description: This is our bed room",
				"Long Description: We sleep in our bed room. Please make up your own" +
				"long description.");
		this.rooms[3] = bedRoom;
		
		foyer.setExits(rooms[2], null, null, null);
		library.setExits(null, rooms[1], null, null);
		livingRoom.setExits(null, null, rooms[3], null);
		bedRoom.setExits(null, null, null, rooms[0]);
	
	
	}



	public Room[] getRooms() {
		return rooms;
	}



	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}



	public Room getStartingRoom() {
		return startingRoom;
	}



	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

}
	

