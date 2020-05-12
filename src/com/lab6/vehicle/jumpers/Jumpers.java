package com.lab6.vehicle.jumpers;

import com.lab6.vehicle.Run;

/**
 * Jumpers class
 * implements interface Run.
 */
public class Jumpers implements Run {

    /**
     * Neme getter.
     * @return name of the jumper.
     */
    @Override
    public String getName() {
        return "Jumper";
    }

    /**
     * Max speed getter.
     * @return max speed value.
     */
    @Override
    public double getMaxSpeed() {
        return 10;
    }

    /**
     * Weight getter.
     * @return weight of the jumper.
     */
    @Override
    public double getWeight() {
        return 5;
    }

    /**
     * Method for moving the jumper.
     */
    @Override
    public void move() {
        System.out.println("Jumper is jumping.");
    }
}
