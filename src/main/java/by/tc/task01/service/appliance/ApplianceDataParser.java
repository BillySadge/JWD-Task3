package by.tc.task01.service.appliance;


import by.tc.task01.entity.ApplianceRecord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ApplianceDataParser {
    private static ApplianceDataParser instance;

    public final static String COLON = ":";
    public final static String COMMA = ",";
    public final static String EQUAL = "=";

    private ApplianceDataParser() {

    }

    public static ApplianceDataParser getInstance() {
        if(instance == null) {
            instance = new ApplianceDataParser();
        }
        return instance;
    }

    public ApplianceRecord getRecord(String applianceRecord) {
        String[] splittedRecord = applianceRecord.split(COLON);

        String applianceType = splittedRecord[0].trim();
        List<String> params = Arrays.asList(splittedRecord[1].split(COMMA));

        HashMap<String, String> applianceParameters = new HashMap<>();
        for (String parameter : params) {
            String[] splittedParameter = parameter.split(EQUAL);
            String key = splittedParameter[0].trim();
            String value = splittedParameter[1].trim();
            applianceParameters.put(key, value);
        }

        return new ApplianceRecord(applianceType, applianceParameters);
    }
}