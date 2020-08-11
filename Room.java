package com.company;

public class Room {
    private String roomNumber;
    private boolean occupied;

    public Room(String roomNumber, boolean occupied) {
        this.roomNumber = roomNumber;
        this.occupied = occupied;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
