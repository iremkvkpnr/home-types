package com.hometypes.hometypesanalyzer.data;

import com.hometypes.hometypesanalyzer.model.House;
import com.hometypes.hometypesanalyzer.model.NormalHouse;
import com.hometypes.hometypesanalyzer.model.SummerHouse;
import com.hometypes.hometypesanalyzer.model.Villa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseDataSource {
    public static List<House> getNormalHouses() {
        return Arrays.asList(
                new NormalHouse(500_000, 120, 3, 1),
                new NormalHouse(600_000, 130, 4, 1),
                new NormalHouse(450_000, 100, 2, 1)
        );
    }

    public static List<House> getVillas() {
        return Arrays.asList(
                new Villa(1_500_000, 300, 5, 2),
                new Villa(1_200_000, 280, 4, 2),
                new Villa(1_800_000, 320, 6, 3)
        );
    }

    public static List<House> getSummerHouses() {
        return Arrays.asList(
                new SummerHouse(700_000, 90, 2, 1),
                new SummerHouse(800_000, 110, 3, 1),
                new SummerHouse(900_000, 100, 3, 2)
        );
    }

    public static List<House> getAllHouses() {
        List<House> all = getNormalHouses();
        all.addAll(getVillas());
        all.addAll(getSummerHouses());
        return all;
    }

}
