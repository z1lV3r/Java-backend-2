package com.example.composition;

public class Shop {
    private final Room iceRoom;
    private final Room storage;

    public Shop() {
        this.iceRoom = new Room("iceRoom");
        this.storage = new Room("storage");
    }

}
