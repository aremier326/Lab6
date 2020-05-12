package com.lab6;

import com.lab6.vehicle.Bus;
import com.lab6.vehicle.bicycle.Bicycle;
import com.lab6.vehicle.car.Car;
import com.lab6.vehicle.jumpers.Jumpers;
import com.lab6.vehicle.rollerskates.RollerSkates;
import com.lab6.server.Server;
import com.lab6.vehicle.tractors.TractorCrawler;
import com.lab6.vehicle.tractors.TractorWheeled;

public class Main {

    /**
     *Вариант точки входа для первой части задания.
     */
    /*public static void main(String[] args) {

        Server server = new Server(4, 20);


        while(server.getCurrentCountVehicle() < server.getLimitVehicle()) {

            switch (getRandomValue(0, server.getTypesAmount() - 1)) {
                case 0: {
                    server.addTransport(0, new Bicycle());
                }
                case 1: {
                    server.addTransport(1, new Car());
                }
                case 2: {
                    server.addTransport(2, new Jumpers());
                }
                case 3: {
                    server.addTransport(3, new RollerSkates());
                }
            }
        }

        for (int i = 0; i < server.getTypesAmount(); i++) {
            System.out.println(i + " type - " + server.getCountVehicles(i) + " cars");
        }

    }*/

    public static void main(String[] args) {
        Server server = new Server(7, 49);

        while(server.getCurrentCountVehicle() < server.getLimitVehicle()) {

            switch (getRandomValue(0, server.getTypesAmount() - 1)) {
                case 0: {
                    server.addTransport(0, new Bicycle());
                }
                case 1: {
                    server.addTransport(1, new Car());
                }
                case 2: {
                    server.addTransport(2, new Jumpers());
                }
                case 3: {
                    server.addTransport(3, new RollerSkates());
                }
                case 4: {
                    server.addTransport(4, new Bus("Bus", 10000, 120));
                }
                case 5: {
                    server.addTransport(5,
                            new TractorCrawler("Tractor", 12000, 60,"Crawler"));
                }
                case 6: {
                    server.addTransport(6,
                            new TractorWheeled("Tractor", 20000, 50, "Wheeled"));
                }
            }
        }
        for (int i = 0; i < server.getTypesAmount(); i++) {
            System.out.println(i + " type - " + server.getCountVehicles(i) + " cars");
        }

    }

    public static int getRandomValue(int min, int max) {
        return (int) Math.random() * (max - min) + min;
    }
}
