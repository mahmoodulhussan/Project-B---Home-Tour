package fixtures;

public class Room extends Fixture{
//	public String name;
	public Room[] exits = new Room[4];
	
	public Room (String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	public Room() {
		super();
	}
	
	public Room getExits(String direction) {
		switch(direction) {
		case "left":
			return exits[0];
		case "right":
			return exits[1];
		case "north":
			return exits[2];
		case "south":
			return exits[3];
		default:
			System.out.println("The only valid directions are: left, right, north, south");
			return null;
		}
		
	}
	public void setExits(Room foyer, Room livingRoom, Room library, Room bedRoom) {
		this.exits[0] = foyer;
		this.exits[1] = livingRoom;
		this.exits[2] = library;
		this.exits[3] = bedRoom;
	}
	public String getName() {
		return this.name;
	}
//	public void setExit(String string, Room library) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setExit(String string, Room foyer) {
//		// TODO Auto-generated method stub
//		this.exits = 
//	}
//	public void setExit(String string, Room livingRoom) {
//		// TODO Auto-generated method stub
		
//	}

	
}
