package by.tc.task01.entity.appliance.builder;

import by.tc.task01.entity.appliance.Laptop;

public class LaptopBuilder {
    private double batteryCapacity;
    private double memoryROM;
    private double systemMemory;
    private double cpuFrequency;
    private double displayInches;
    private Laptop.OperatingSystem operatingSystem;

    public LaptopBuilder setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public LaptopBuilder setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
        return this;
    }

    public LaptopBuilder setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
        return this;
    }

    public LaptopBuilder setCpuFrequency(double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
        return this;
    }

    public LaptopBuilder setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
        return this;
    }

    public LaptopBuilder setOperatingSystem(Laptop.OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public Laptop createLaptop() {
        return new Laptop(batteryCapacity, memoryROM, systemMemory, cpuFrequency, displayInches, operatingSystem);
    }
}