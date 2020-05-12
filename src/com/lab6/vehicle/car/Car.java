package com.lab6.vehicle.car;

import com.lab6.vehicle.Run;

/**
 * Class Car
 * implements interface Run
 */
public class Car implements Run {

    /**
     * Name getter.
     * @return name of the car.
     */
    @Override
    public String getName() {
        return "Car";
    }

    /**
     * Max speed getter.
     * @return max speed of the car.
     */
    @Override
    public double getMaxSpeed() {
        return 160;
    }

    /**
     * Weight getter.
     * @return weight of the car.
     */
    @Override
    public double getWeight() {
        return 2000;
    }

    /**
     * Method for moving the car.
     */
    @Override
    public void move() {
        System.out.println("Car is moving.");
    }
}
