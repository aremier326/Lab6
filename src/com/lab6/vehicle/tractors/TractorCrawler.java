package com.lab6.vehicle.tractors;

import com.lab6.vehicle.Tractor;

/**
 * TractorCrawler class,
 * extends abstract class Tractor.
 */
public class TractorCrawler extends Tractor {
    /**
     * Custom constructor.
     * @param name
     * @param weight
     * @param maxSpeed
     * @param type
     */
    public TractorCrawler(String name, double weight, double maxSpeed, String type) {
        super(name, weight, maxSpeed, type);
    }
}
