package com.lab6.vehicle.bicycle;

import com.lab6.vehicle.Run;

/**
 * class Bicycle
 * implements interface Run.
 */
public class Bicycle implements Run {

    /**
     * Name getter.
     * @return name of the Bicycle.
     */
    @Override
    public String getName() {
        return "Bicycle";
    }

    /**
     * Max bicycle speed getter.
     * @return max speed of the bicycle.
     */
    @Override
    public double getMaxSpeed() {
        return 35;
    }

    /**
     * weight getter.
     * @return weight value.
     */
    @Override
    public double getWeight() {
        return 12;
    }

    /**
     * Method for moving the bike.
     */
    @Override
    public void move() {
        System.out.println("Bicycle is moving.");
    }
}
