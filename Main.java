package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Room> rooms=new ArrayList<>();
        rooms.add(new Room("1",false));
        rooms.add(new Room("2",true));
        rooms.add(new Room("3",false));
        rooms.add(new Room("4",false));
        rooms.add(new Room("5",true));
        rooms.add(new Room("6",false));
        rooms.add(new Room("7",true));
        rooms.add(new Room("8",false));

	Hotel sobieski=new Hotel("Sobieski",rooms);
	sobieski.howManyFreeRooms();
	sobieski.returnFirstAvailableRoomNumber();
	sobieski.freeRoomNumber("5");
	sobieski.occupyRoomNumber("7");
	sobieski.occupyRoomNumber("8");

    }
}
