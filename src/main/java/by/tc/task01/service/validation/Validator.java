package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		switch (criteria.getGroupSearchName()) {
			case "Oven" -> {
				return validateOven(criteria);
			}
			case "Laptop" -> {
				return validateLaptop(criteria);
			}
			case "TabletPC" -> {
				return validateTabletPC(criteria);
			}
			case "Speakers" -> {
				return validateSpeakers(criteria);
			}
			case "Refrigerator" -> {
				return validateRefrigerator(criteria);
			}
			case "VacuumCleaner" -> {
				return validateVacuumCleaner(criteria);
			}
			default -> {
				return false;
			}
		}
	}
	private static boolean validateVacuumCleaner(Criteria criteria) {
		return true;
	}

	private static boolean validateRefrigerator(Criteria criteria) {
		return true;
	}

	private static boolean validateSpeakers(Criteria criteria) {
		return true;
	}

	private static boolean validateTabletPC(Criteria criteria) {
		return true;
	}

	private static boolean validateLaptop(Criteria criteria) {
		return true;
	}

	public static boolean validateOven(Criteria criteria) {
		return true;
	}
}

