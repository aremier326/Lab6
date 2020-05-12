package com.lab6.vehicle;

/**
 * Abstract class Machine
 * implements Run interface.
 */
public abstract class Machine implements Run{

    /**
     * Contains name of the machine.
     */
    String name;

    /**
     * Contains weight of the machine.
     */
    double weight;

    /**
     * Contains max speed of the machine.
     */
    double maxSpeed;

    /**
     * Custom constructor
     * @param name
     * @param weight
     * @param maxSpeed
     */
    public Machine(String name, double weight, double maxSpeed) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Name getter.
     * @return name of the machine.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Max speed getter.
     * @return max speed.
     */
    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Weight getter.
     * @return weight of the machine.
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * Method for moving the machine.
     */
    @Override
    public void move() {
        System.out.println("Machine is moving");
    }
}
