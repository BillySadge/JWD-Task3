package by.tc.task01.entity.appliance;

import by.tc.task01.entity.appliance.Appliance;

import java.util.Objects;

public class Refrigerator implements Appliance {
    private static final long serialVersionUID = 923289188637118573L;

    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator() {
    }

    public Refrigerator(double powerConsumption,
                        double weight,
                        double freezerCapacity,
                        double overallCapacity,
                        double height,
                        double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0
                && Double.compare(that.weight, weight) == 0
                && Double.compare(that.freezerCapacity, freezerCapacity) == 0
                && Double.compare(that.overallCapacity, overallCapacity) == 0
                && Double.compare(that.height, height) == 0
                && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s = %s\n%s = %s\n%s = %s\n%s = %.1s\n%s = %s\n%s = %s\n",
                this.getClass().getSimpleName(),
                "POWER CONSUMPTION", powerConsumption,
                "WEIGHT", weight,
                "FREEZER CAPACITY", freezerCapacity,
                "OVERALL CAPACITY", overallCapacity,
                "HEIGHT", height,
                "WIDTH", width);
    }
}