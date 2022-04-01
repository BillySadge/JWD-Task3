package by.tc.task01.dao.impl;


import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.ApplianceRecord;
import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.appliance.ApplianceFilter;
import by.tc.task01.service.appliance.ApplianceReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {
	private final String DB_NAME = "appliances_db.txt";
	URL resource = ApplianceDAOImpl.class.getClassLoader().getResource(DB_NAME);
	File dbFile = new File(resource.getFile());


	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		try(BufferedReader databaseReader = new BufferedReader(new FileReader(dbFile))){

			ApplianceReader applianceReader = new ApplianceReader(databaseReader);
			ApplianceFilter applianceFilter = ApplianceFilter.getInstance();
			List<Appliance> findedAppliances = new ArrayList<>();


			while(applianceReader.hasNext()) {
				ApplianceRecord applianceRecord = applianceReader.next();
				boolean isRecordMatchCriteria = applianceFilter.isRecordMatchCriteria(applianceRecord, criteria);
				if(isRecordMatchCriteria) {
					Appliance appliance = applianceRecord.getAppliance();
					findedAppliances.add(appliance);
				}
			}

			return findedAppliances;
		}
	}
}


