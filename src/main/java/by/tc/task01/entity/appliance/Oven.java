package by.tc.task01.entity.appliance;

import java.util.Objects;

public class Oven implements Appliance {
    private static final long serialVersionUID = 987656321116783250L;

    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
    }

    public Oven(double powerConsumption,
                double weight,
                double capacity,
                double depth,
                double height,
                double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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
        Oven that = (Oven) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0
                && Double.compare(that.weight, weight) == 0
                && Double.compare(that.capacity, capacity) == 0
                && Double.compare(that.depth, depth) == 0
                && Double.compare(that.height, height) == 0
                && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s = %s\n%s = %s\n%s = %s\n%s = %s\n%s = %.1f\n%s = %.1f\n",
                this.getClass().getSimpleName(),
                "POWER CONSUMPTION", powerConsumption,
                "WEIGHT", weight,
                "CAPACITY", capacity,
                "DEPTH", depth,
                "HEIGHT", height,
                "WIDTH", width);
    }
}