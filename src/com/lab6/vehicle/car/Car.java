package com.lab6.vehicle.car;

import com.lab6.vehicle.Run;

public class Car implements Run {

    @Override
    public String getName() {
        return "Car";
    }

    @Override
    public double getMaxSpeed() {
        return 160;
    }

    @Override
    public double getWeight() {
        return 2000;
    }

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }
}
