package by.tc.task01.entity.appliance;

import java.util.Objects;

public class Laptop implements Appliance {
    private static final long serialVersionUID = 1239649432983062214L;

    public enum OperatingSystem {WINDOWS, MAC, LINUX}

    private double batteryCapacity;
    private double memoryROM;
    private double systemMemory;
    private double cpuFrequency;
    private double displayInches;
    private OperatingSystem operatingSystem;

    public Laptop() {
    }

    public Laptop(double batteryCapacity,
                  double memoryROM,
                  double systemMemory,
                  double cpuFrequency,
                  double displayInches,
                  OperatingSystem operatingSystem) {
        this.batteryCapacity = batteryCapacity;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpuFrequency = cpuFrequency;
        this.displayInches = displayInches;
        this.operatingSystem = operatingSystem;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop that = (Laptop) o;
        return Double.compare(that.batteryCapacity, batteryCapacity) == 0
                && Double.compare(that.memoryROM, memoryROM) == 0
                && Double.compare(that.systemMemory, systemMemory) == 0
                && Double.compare(that.cpuFrequency, cpuFrequency) == 0
                && Double.compare(that.displayInches, displayInches) == 0
                && operatingSystem == that.operatingSystem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, memoryROM, systemMemory, cpuFrequency, displayInches, operatingSystem);
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s = %.1f\n%s = %s\n%s = %d\n%s = %d\n%s = %.1f\n%s = %d\n",
                this.getClass().getSimpleName(),
                "BATTERY CAPACITY", batteryCapacity,
                "OS", operatingSystem,
                "MEMORY ROM", memoryROM,
                "SYSTEM MEMORY", systemMemory,
                "CPU", cpuFrequency,
                "DISPLAY INCHES", displayInches);
    }
}