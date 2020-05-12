package com.lab6.vehicle;

/**
 * Abstract class Tractor
 * extends abstract class Machine.
 */
public abstract class Tractor extends Machine{

    /**
     * Contains type of the tractor.
     */
    String type;

    /**
     * Custom constructor.
     * @param name
     * @param weight
     * @param maxSpeed
     */
    public Tractor(String name, double weight, double maxSpeed) {
        super(name, weight, maxSpeed);
    }

    /**
     * Custom constructor.
     * @param name
     * @param weight
     * @param maxSpeed
     * @param type
     */
    public Tractor(String name, double weight, double maxSpeed, String type) {
        this(name, weight, maxSpeed);
        this.type = type;
    }

    /**
     * Method for getting type.
     * @return type of the tractor.
     */
    public String getType() {
        return type;
    }
}
