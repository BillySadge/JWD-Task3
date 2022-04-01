package by.tc.task01.entity;


import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.appliance.ApplianceFactory;
import by.tc.task01.entity.appliance.ApplianceType;

import java.util.HashMap;
import java.util.Objects;

public class ApplianceRecord {
    private String applianceType;
    private HashMap<String, String> applianceParameters;

    public ApplianceRecord() {
    }

    public ApplianceRecord(String applianceType, HashMap<String, String> applianceParameters) {
        this.applianceType = applianceType;
        this.applianceParameters = applianceParameters;
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    public HashMap<String, String> getApplianceParameters() {
        return applianceParameters;
    }

    public void setApplianceParameters(HashMap<String, String> applianceParameters) {
        this.applianceParameters = applianceParameters;
    }

    public Appliance getAppliance() {
        ApplianceType applianceType = ApplianceType.valueOf(getApplianceType().toUpperCase());
        return ApplianceFactory.getInstance().getAppliance(applianceType, applianceParameters);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplianceRecord that = (ApplianceRecord) o;
        return applianceType.equals(that.applianceType) && applianceParameters.equals(that.applianceParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applianceType, applianceParameters);
    }
}