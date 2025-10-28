package com.pluralsight;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House house = new House("Family house", "2003-03-13", 25000,
                "234 rd st", 1, 24000, 5000);

        System.out.println("------------------------------");

        Vehicle car = new Vehicle("Personal Car", "2023-06-10", 30000,
                "Nissa Sentra", 2023, 120000);

        assets.add(house);
        assets.add(car);


        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());


            if (asset instanceof House) {
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle ){
                System.out.println("Make & Model: " + car.getMakeModel());
                System.out.println("Year: " + car.getYear());
            }

            System.out.println("-----------------------------");
        }
    }
}