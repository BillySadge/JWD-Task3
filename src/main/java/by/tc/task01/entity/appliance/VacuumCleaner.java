package by.tc.task01.entity.appliance;

import by.tc.task01.entity.appliance.Appliance;

import java.util.Objects;

public class VacuumCleaner implements Appliance {
    private static final long serialVersionUID = 6327427409405897670L;

    public enum FilterType {A, B, C};

    public enum BagType {A2, AA_89, XX00}

    public enum MotorType {ALL_IN_ONE, MAGIC_STICK}

    private double powerConsumption;
    private double motorSpeedRegulation;
    private double cleaningWidth;
    private FilterType filterType;
    private BagType bagType;
    private MotorType motorType;

    public VacuumCleaner() {
    }

    public VacuumCleaner(double powerConsumption,
                         double motorSpeedRegulation,
                         double cleaningWidth,
                         FilterType filterType,
                         BagType bagType,
                         MotorType motorType) {
        this.powerConsumption = powerConsumption;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
        this.filterType = filterType;
        this.bagType = bagType;
        this.motorType = motorType;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public BagType getBagType() {
        return bagType;
    }

    public void setBagType(BagType bagType) {
        this.bagType = bagType;
    }

    public MotorType getMotorType() {
        return motorType;
    }

    public void setMotorType(MotorType motorType) {
        this.motorType = motorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0
                && Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0
                && Double.compare(that.cleaningWidth, cleaningWidth) == 0
                && filterType == that.filterType && bagType == that.bagType
                && motorType == that.motorType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, motorSpeedRegulation, cleaningWidth, filterType, bagType, motorType);
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s = %s\n%s = %s\n%s = %s\n%s = %s\n%s = %s\n%s = %s\n",
                this.getClass().getSimpleName(),
                "POWER CONSUMPTION", powerConsumption,
                "FILTER TYPE", filterType,
                "BAG TYPE", bagType,
                "WAND TYPE", motorType,
                "MOTOR SPEED REGULATION", motorSpeedRegulation,
                "CLEANING WIDTH", cleaningWidth);
    }
}