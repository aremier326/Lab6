package com.lab6.vehicle.rollerskates;

import com.lab6.vehicle.Run;

/**
 * RollerSkates class
 * implements Run interface
 */
public class RollerSkates implements Run {

    /**
     * Name getter.
     * @return name of the RollerSkates object.
     */
    @Override
    public String getName() {
        return "Jumper";
    }

    /**
     * MaxSpeed getter;
     * @return maxSpeed;
     */
    @Override
    public double getMaxSpeed() {
        return 25;
    }

    /**
     * Weight getter.
     * @return weight.
     */
    @Override
    public double getWeight() {
        return 4;
    }

    /**
     * Method for moving.
     */
    @Override
    public void move() {
        System.out.println("RollerSkates is rolling.");
    }
}
