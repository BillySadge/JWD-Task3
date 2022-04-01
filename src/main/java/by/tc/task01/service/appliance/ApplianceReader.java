package by.tc.task01.service.appliance;


import by.tc.task01.entity.ApplianceRecord;

import java.io.BufferedReader;
import java.util.Iterator;

public class ApplianceReader implements Iterator<ApplianceRecord> {
    private final LineIterator lineIterator;

    public ApplianceReader(BufferedReader databaseReader) {
        lineIterator = new LineIterator(databaseReader);
    }

    public boolean hasNext() {
        return lineIterator.hasNext();
    }

    @Override
    public ApplianceRecord next() {
        String appliance = "";
        while("".equals(appliance)) {
            appliance = (String)lineIterator.next();
        }
        ApplianceDataParser applianceDataParser = ApplianceDataParser.getInstance();
        return applianceDataParser.getRecord(appliance);
    }
}