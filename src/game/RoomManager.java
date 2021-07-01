package game;

import fixtures.Room;

public class RoomManager {
	

	public Room[] rooms = new Room[4] ;
	public Room startingRoom;
//	Room livingRoom;
//	Room library;
//	Room bedRoom;	
//	public RoomManager()
	

	
	public void init() {
		Room foyer = new Room(
				"The Foyer",
				"a small foyer",
				"The small entryway of a neo-colonial house." 
				+ " A dining room is open to the south, where "
				+ "a large table can be seen." + "\n"
				+ "The hardwood floor leads west into doorway, " 
				+ "next to a staircase that leads up to a second floor." + "\n"
				+ "To the north is a small room, where you can see a piano.");
		this.rooms[0] = foyer;
		startingRoom = foyer;	
	
		Room livingRoom = new Room(
				"Living Room",
				"This is our living room.",
				"We gather in the living room to talk, watch movies, "
				+ "play video games, and party. This most fun place in this house.");
		this.rooms[1] = livingRoom;
//		livingRoom.setExits(rooms[0], null, null, null);


	

		Room library = new Room(
				"Library",
				"This is the our library",
				"Shhhh!!! This is a quite place. We use this room to read books, " 
				+"prepare for exams, or to have some ME time aka medidation.");
		this.rooms[2] = library;
//		library.setExits(null, null, null, rooms[3]);

	
	
		Room bedRoom = new Room(
				"Bed Room",
				"This is our bed room",
				"We sleep in our bed room. Please make up your own" +
				"long description.");
		this.rooms[3] = bedRoom;
		
		foyer.setExits(rooms[2], null, null, null);
		library.setExits(null, rooms[1], null, null);
		livingRoom.setExits(null, null, rooms[3], null);
		bedRoom.setExits(null, null, null, rooms[0]);


//	bedRoom.setExits(null, null, null, rooms[2]);
		

//	foyer.setExits[0] = ("right", library);
//	foyer.setExits("left", livingRoom);
//	livingRoom.setExits("south", foyer);
//	livingRoom.setExits("north", bedRoom);
//	library.setExits("south", foyer);
//	livingRoom.setExits("north", bedRoom);
//	bedRoom.setExits("left", livingRoom);
//	bedRoom.setExits("right", library);
	
	
	
		
//		foyer.setExits(rooms[0], null, null, null);
//		foyer.setExits(null, rooms[1], null, null);
//		livingRoom.setExits(null, null, rooms[3], null);
//		livingRoom.setExits(null, rooms[0], null, null);
//		library.setExits(rooms[0], null, null, null);
//		library.setExits(null, null, rooms[3], null);
//		bedRoom.setExits(null, null, rooms[0], null);
//		bedRoom.setExits(null, null, null, rooms[2]);

	
	
//		library.getExits()[0] = foyer;
//		library.getExits()[3] = bedRoom;
//		bedRoom.getExits()[2] = library;
//		bedRoom.getExits()[1] = livingRoom;
//		livingRoom.getExits()[3] = bedRoom;
//		livingRoom.getExits()[1] = foyer;		
//		
		
	}	
	}
		
//		rooms[0] = livingRoom;
//		rooms[1] = library;
		
		
		

	
	

