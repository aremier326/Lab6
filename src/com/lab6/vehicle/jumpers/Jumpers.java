package com.lab6.vehicle.jumpers;

import com.lab6.vehicle.Run;

public class Jumpers implements Run {

    @Override
    public String getName() {
        return "Jumper";
    }

    @Override
    public double getMaxSpeed() {
        return 10;
    }

    @Override
    public double getWeight() {
        return 5;
    }

    @Override
    public void move() {
        System.out.println("Jumper is jumping.");
    }
}
