package by.tc.task01.main;

import by.tc.task01.entity.appliance.Appliance;

import java.util.List;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliance) {
		if (appliance.isEmpty()) {
			System.out.println("there are no such appliance\n");
		} else {
			for (Appliance obj : appliance) {
				System.out.println(appliance);
			}
		}
	}
}
