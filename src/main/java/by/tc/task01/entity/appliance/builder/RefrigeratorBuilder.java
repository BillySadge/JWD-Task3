package by.tc.task01.entity.appliance.builder;

import by.tc.task01.entity.appliance.Refrigerator;

public class RefrigeratorBuilder {
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public RefrigeratorBuilder setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public RefrigeratorBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public RefrigeratorBuilder setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
        return this;
    }

    public RefrigeratorBuilder setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
        return this;
    }

    public RefrigeratorBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public RefrigeratorBuilder setWidth(double width) {
        this.width = width;
        return this;
    }

    public Refrigerator createRefrigerator() {
        return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }
}