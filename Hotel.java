package com.company;

import java.util.List;

public class Hotel {
    private String name;
    private List<Room> roomList;

    public Hotel(String name, List<Room> roomList) {
        this.name = name;
        this.roomList = roomList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public void returnFirstAvailableRoomNumber() {
        for (Room room : roomList
        ) {
            if (!room.isOccupied()) {
                room.setOccupied(true);
                System.out.println("Pokoj o numerze " + room.getRoomNumber() + " zostal zajety");
                break;
            }
        }
    }

    public void occupyRoomNumber(String roomNumber) {
        for (Room room : roomList
        ) {
            if (room.getRoomNumber().equals(roomNumber) && !room.isOccupied()) {
                room.setOccupied(true);
                System.out.println("Pokoj o wymaganym numerze " + roomNumber + " zostal zajety");
                break;
            } else if (room.getRoomNumber().equals(roomNumber) && room.isOccupied()) {
                System.out.println("Pokoj o wymaganym numerze " + roomNumber +
                        " jest zajety i nie mozna go zarezerwowac");
                break;
            }
        }
    }

    public void freeRoomNumber(String roomNumber) {
        for (Room room : roomList
        ) {
            if (room.getRoomNumber().equals(roomNumber)) {
                room.setOccupied(false);
                System.out.println("Pokoj o numerze " + roomNumber + " zostal zwolniony");
                break;
            }
        }
    }

    public void howManyFreeRooms() {
        int counter = 0;
        for (Room room : roomList
        ) {
            if (!room.isOccupied()) {
                counter++;
                System.out.println("Pokoj numer " + room.getRoomNumber() + " jest wolny");
            }
        }
        System.out.println("Hotel " + name + " ma " + counter + " wolnych pokoi");
    }
}
