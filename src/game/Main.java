package game;

import java.util.Scanner;

import fixtures.Room;


public class Main {
	public static void main(String[] args) {
		
		RoomManager rm = new RoomManager();
		rm.init();
		
		Scanner scan = new Scanner(System.in);
		String collectInput = "";
		Room currentRoom = rm.startingRoom;
		
		do {
			System.out.println(currentRoom.getName());
			System.out.println("Which room do you want to go next? - Use right, left, north, and south options.");
			collectInput = scan.nextLine();
			Room nextRoom = currentRoom.getExits(collectInput);
			if(nextRoom != null) {
				currentRoom = nextRoom;
			}
		}while (!collectInput.equals("quit"));
		
	}
	
	private static void printRoom(Player player) {
		
	}
	private static String[] collectInput() {
		return collectInput();
	}
	
	private static void parse(String[] command, Player player) {
		
	}

}
