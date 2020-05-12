package com.lab6.vehicle;

/**
 * Simple class Bus.
 */
public class Bus extends Machine{

    /**
     * Contains amount of passengers.
     */
    int passengersAmount;

    /**
     * Custom constructor.
     * @param name
     * @param weight
     * @param maxSpeed
     */
    public Bus(String name, double weight, double maxSpeed) {
        super(name, weight, maxSpeed);
    }

    /**
     * Custor constructor
     * @param name
     * @param weight
     * @param maxSpeed
     * @param passengersAmount
     */
    public Bus(String name, double weight, double maxSpeed, int passengersAmount) {
        this(name, weight, maxSpeed);
        this.passengersAmount = passengersAmount;
    }

    /**
     * passengerAmount getter.
     * @return amount of passengers.
     */
    public int getPassengersAmount () {
        return passengersAmount;
    }
}
