package com.hometypes.hometypesanalyzer;

import com.hometypes.hometypesanalyzer.model.House;
import com.hometypes.hometypesanalyzer.model.NormalHouse;
import com.hometypes.hometypesanalyzer.model.SummerHouse;
import com.hometypes.hometypesanalyzer.model.Villa;
import com.hometypes.hometypesanalyzer.service.HouseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class HometypesanalyzerApplication implements CommandLineRunner {

	private final HouseService service;

	public HometypesanalyzerApplication(HouseService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(HometypesanalyzerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<House> normalHouses = Arrays.asList(
				new NormalHouse(500000, 100, 3, 1),
				new NormalHouse(600000, 110, 4, 1),
				new NormalHouse(550000, 90, 2, 1)
		);

		List<House> villas = Arrays.asList(
				new Villa(1200000, 200, 5, 2),
				new Villa(1300000, 220, 6, 2),
				new Villa(1100000, 180, 4, 2)
		);

		List<House> summerHouses = Arrays.asList(
				new SummerHouse(800000, 150, 3, 1),
				new SummerHouse(850000, 160, 4, 2),
				new SummerHouse(900000, 170, 5, 2)
		);

		List<House> allHouses = Arrays.asList(
				normalHouses.get(0), normalHouses.get(1), normalHouses.get(2),
				villas.get(0), villas.get(1), villas.get(2),
				summerHouses.get(0), summerHouses.get(1), summerHouses.get(2)
		);

		System.out.println("Total price of normal houses: " + service.getTotalPrice(normalHouses));
		System.out.println("Total price of villas: " + service.getTotalPrice(villas));
		System.out.println("Total price of summer houses: " + service.getTotalPrice(summerHouses));
		System.out.println("Total price of all houses: " + service.getTotalPrice(allHouses));

		System.out.println("Average square meters of normal houses: " + service.getAverageSquareMeters(normalHouses));
		System.out.println("Average square meters of villas: " + service.getAverageSquareMeters(villas));
		System.out.println("Average square meters of summer houses: " + service.getAverageSquareMeters(summerHouses));
		System.out.println("Average square meters of all houses: " + service.getAverageSquareMeters(allHouses));

		System.out.println("Filtered houses with 3 rooms and 1 living room:");
		List<House> filtered = service.filterByRoomAndLivingRoom(allHouses, 3, 1);
		filtered.forEach(System.out::println);
	}
}
