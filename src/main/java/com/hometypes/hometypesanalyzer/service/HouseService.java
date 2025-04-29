package com.hometypes.hometypesanalyzer.service;

import com.hometypes.hometypesanalyzer.model.House;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {
    public int getTotalPrice(List<? extends House> houseList) {
        int total = 0;
        for (House house : houseList) {
            total += house.getPrice();
        }
        return total;
    }

    public double getAverageSquareMeters(List<? extends House> houseList) {
        if (houseList.isEmpty()) return 0;
        int total = 0;
        for (House house : houseList) {
            total += house.getSquareMeters();
        }
        return (double) total / houseList.size();
    }

    public List<House> filterByRoomAndLivingRoom(List<House> allHouses, int roomCount, int livingRoomCount) {
        List<House> filteredList = new ArrayList<>();
        for (House house : allHouses) {
            if (house.getNumberOfRooms() == roomCount && house.getNumberOfLivingRooms() == livingRoomCount) {
                filteredList.add(house);
            }
        }
        return filteredList;
    }
}
