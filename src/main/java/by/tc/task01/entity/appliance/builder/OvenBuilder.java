package by.tc.task01.entity.appliance.builder;

import by.tc.task01.entity.appliance.Oven;

public class OvenBuilder {
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public OvenBuilder setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public OvenBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public OvenBuilder setCapacity(double capacity) {
        this.capacity = capacity;
        return this;
    }

    public OvenBuilder setDepth(double depth) {
        this.depth = depth;
        return this;
    }

    public OvenBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public OvenBuilder setWidth(double width) {
        this.width = width;
        return this;
    }

    public Oven createOven() {
        return new Oven(powerConsumption, weight, capacity, depth, height, width);
    }
}