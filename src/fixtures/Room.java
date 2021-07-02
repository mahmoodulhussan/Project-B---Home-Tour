package fixtures;

public class Room extends Fixture{

	private Room[] exits = new Room[4];
	
	public Room (String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
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
		case "quit":
			System.out.println("Good Bye!");
		default:
			System.out.println("Try again!");
			return null;
		}
		
	}
	public void setExits(Room foyer, Room livingRoom, Room library, Room bedRoom) {
		this.exits[0] = foyer;
		this.exits[1] = livingRoom;
		this.exits[2] = library;
		this.exits[3] = bedRoom;
	}
}

