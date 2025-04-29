package com.hometypes.hometypesanalyzer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class House {
    private int price;
    private int squareMeters;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    public House(int price,int squareMeters,int numberOfRooms, int numberOfLivingRooms) {
        this.price=price;
        this.squareMeters=squareMeters;
        this.numberOfRooms=numberOfRooms;
        this.numberOfLivingRooms=numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " | Price: " + price +
                " | Square Meters: " + squareMeters +
                " | Rooms: " + numberOfRooms +
                " | Living Rooms: " + numberOfLivingRooms;
    }
}
