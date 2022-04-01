package by.tc.task01.entity.appliance.builder;

import by.tc.task01.entity.appliance.TabletPC;

public class TabletPCBuilder {
    private double batteryCapacity;
    private double displayInches;
    private double memoryROM;
    private double flashMemoryCapacity;
    private TabletPC.TabletColor color;

    public TabletPCBuilder setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public TabletPCBuilder setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
        return this;
    }

    public TabletPCBuilder setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
        return this;
    }

    public TabletPCBuilder setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
        return this;
    }

    public TabletPCBuilder setColor(TabletPC.TabletColor color) {
        this.color = color;
        return this;
    }

    public TabletPC createTabletPC() {
        return new TabletPC(batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color);
    }
}