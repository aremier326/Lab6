package com.lab6.vehicle.tractors;

import com.lab6.vehicle.Tractor;

/**
 * Class TractorWheeled
 * extends abstract class tractor.
 */
public class TractorWheeled extends Tractor {
    /**
     * Custom constuctor.
     * @param name
     * @param weight
     * @param maxSpeed
     * @param type
     */
    public TractorWheeled(String name, double weight, double maxSpeed, String type) {
        super(name, weight, maxSpeed, type);
    }
}
