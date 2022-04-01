package by.tc.task01.entity.appliance;


import by.tc.task01.entity.appliance.builder.*;

import java.util.HashMap;

public class ApplianceFactory {
    private static ApplianceFactory instance;

    private ApplianceFactory() {

    }

    public static ApplianceFactory getInstance() {
        if(instance == null) {
            instance = new ApplianceFactory();
        }
        return instance;
    }

    public Appliance getAppliance(ApplianceType applianceType, HashMap<String, String> applianceParameters) {
        return switch (applianceType) {
            case LAPTOP -> new LaptopBuilder()
                    .setBatteryCapacity(Double.parseDouble(applianceParameters.get("BATTERY_CAPACITY")))
                    .setMemoryROM(Double.parseDouble(applianceParameters.get("MEMORY_ROM")))
                    .setSystemMemory(Double.parseDouble(applianceParameters.get("SYSTEM_MEMORY")))
                    .setCpuFrequency(Double.parseDouble(applianceParameters.get("CPU")))
                    .setDisplayInches(Double.parseDouble(applianceParameters.get("DISPLAY_INCHES")))
                    .setOperatingSystem(Laptop.OperatingSystem.valueOf(applianceParameters.get("OS")))
                    .createLaptop();
            case OVEN -> new OvenBuilder()
                    .setPowerConsumption(Double.parseDouble(applianceParameters.get("POWER_CONSUMPTION")))
                    .setWeight(Double.parseDouble(applianceParameters.get("WEIGHT")))
                    .setCapacity(Double.parseDouble(applianceParameters.get("CAPACITY")))
                    .setDepth(Double.parseDouble(applianceParameters.get("DEPTH")))
                    .setHeight(Double.parseDouble(applianceParameters.get("HEIGHT")))
                    .setWidth(Double.parseDouble(applianceParameters.get("WIDTH")))
                    .createOven();
            case REFRIGERATOR -> new RefrigeratorBuilder()
                    .setPowerConsumption(Double.parseDouble(applianceParameters.get("POWER_CONSUMPTION")))
                    .setWeight(Double.parseDouble(applianceParameters.get("WEIGHT")))
                    .setFreezerCapacity(Double.parseDouble(applianceParameters.get("FREEZER_CAPACITY")))
                    .setOverallCapacity(Double.parseDouble(applianceParameters.get("OVERALL_CAPACITY")))
                    .setHeight(Double.parseDouble(applianceParameters.get("HEIGHT")))
                    .setWidth(Double.parseDouble(applianceParameters.get("WIDTH")))
                    .createRefrigerator();
            case SPEAKERS -> new SpeakersBuilder()
                    .setPowerConsumption(Double.parseDouble(applianceParameters.get("POWER_CONSUMPTION")))
                    .setNumberOfSpeakers(Double.parseDouble(applianceParameters.get("NUMBER_OF_SPEAKERS")))
                    .setFrequencyRange(Double.parseDouble(applianceParameters.get("FREQUENCY_RANGE")))
                    .setCordLength(Double.parseDouble(applianceParameters.get("CORD_LENGTH")))
                    .createSpeakers();
            case TABLET_PC -> new TabletPCBuilder()
                    .setBatteryCapacity(Double.parseDouble(applianceParameters.get("BATTERY_CAPACITY")))
                    .setDisplayInches(Double.parseDouble(applianceParameters.get("DISPLAY_INCHES")))
                    .setMemoryROM(Double.parseDouble(applianceParameters.get("MEMORY_ROM")))
                    .setFlashMemoryCapacity(Double.parseDouble(applianceParameters.get("FLASH_MEMORY_CAPACITY")))
                    .setColor(TabletPC.TabletColor.valueOf(applianceParameters.get("COLOR")))
                    .createTabletPC();
            case VACUUM_CLEANER -> new VacuumCleanerBuilder()
                    .setPowerConsumption(Double.parseDouble(applianceParameters.get("POWER_CONSUMPTION")))
                    .setMotorSpeedRegulation(Double.parseDouble(applianceParameters.get("MOTOR_SPEED_REGULATION")))
                    .setCleaningWidth(Double.parseDouble(applianceParameters.get("CLEANING_WIDTH")))
                    .setFilterType(VacuumCleaner.FilterType.valueOf(applianceParameters.get("FILTER_TYPE")))
                    .setBagType(VacuumCleaner.BagType.valueOf(applianceParameters.get("BAG_TYPE")))
                    .setMotorType(VacuumCleaner.MotorType.valueOf(applianceParameters.get("WAND_TYPE")))
                    .createVacuumCleaner();
            default -> throw new IllegalArgumentException("Incorrect appliance type");
        };
    }
}