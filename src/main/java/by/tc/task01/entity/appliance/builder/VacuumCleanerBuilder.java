package by.tc.task01.entity.appliance.builder;

import by.tc.task01.entity.appliance.VacuumCleaner;

public class VacuumCleanerBuilder {
    private double powerConsumption;
    private double motorSpeedRegulation;
    private double cleaningWidth;
    private VacuumCleaner.FilterType filterType;
    private VacuumCleaner.BagType bagType;
    private VacuumCleaner.MotorType motorType;

    public VacuumCleanerBuilder setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public VacuumCleanerBuilder setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
        return this;
    }

    public VacuumCleanerBuilder setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
        return this;
    }

    public VacuumCleanerBuilder setFilterType(VacuumCleaner.FilterType filterType) {
        this.filterType = filterType;
        return this;
    }

    public VacuumCleanerBuilder setBagType(VacuumCleaner.BagType bagType) {
        this.bagType = bagType;
        return this;
    }

    public VacuumCleanerBuilder setMotorType(VacuumCleaner.MotorType motorType) {
        this.motorType = motorType;
        return this;
    }

    public VacuumCleaner createVacuumCleaner() {
        return new VacuumCleaner(powerConsumption, motorSpeedRegulation, cleaningWidth, filterType, bagType, motorType);
    }
}