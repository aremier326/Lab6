package com.lab6.vehicle.rollerskates;


import com.lab6.vehicle.Run;

public class RollerSkates implements Run {

    @Override
    public String getName() {
        return "Name";
    }

    @Override
    public double getMaxSpeed() {
        return 25;
    }

    @Override
    public double getWeight() {
        return 4;
    }

    @Override
    public void move() {
        System.out.println("RollerSkates is rolling.");
    }
}
