package by.epam.java.appliance.main;

import java.util.List;

import by.epam.java.appliance.entity.Appliance;
import by.epam.java.appliance.entity.Freezer;
import by.epam.java.appliance.entity.Microvawe;
import by.epam.java.appliance.logic.ApplianceLogic;
import by.epam.java.appliance.repository.ApplianceProvider;

public class Main {

	public static void main(String[] args) {
		ApplianceProvider provider = ApplianceProvider.getInstance();
		List<Appliance> catalog = provider.getCatalog();
		ApplianceLogic logic = new ApplianceLogic(provider.getCatalog());
		
		Microvawe testMicrovawe = new Microvawe("Test", 99, "14 days", "some test text", "X");

		
		logic.addAppliance(new Freezer("Atlant", 10.25, "20 days", "b4503", "40L"));
		logic.addAppliance(new Freezer("LG", 30.99, "10 days", "L58334", "50L"));
		logic.addAppliance(new Freezer("Bosch", 50.49, "30 days", "RQWRU234", "20L"));
		logic.addAppliance(new Freezer("Bosch", 30.99, "25 days", "RQWRU24452", "40L"));
		logic.addAppliance(new Freezer("Samsung", 40.99, "20 days", "SFGE423RG", "90L"));
		logic.addAppliance(new Microvawe("Vitek", 15.99, "99 days", "This is good one", "L"));
		logic.addAppliance(new Microvawe("Philips", 19.99, "360 days", "This is old one", "M"));
		logic.addAppliance(new Microvawe("Samsung", 21.99, "15 days", "This is almost new one", "S"));
		logic.addAppliance(new Microvawe("Vitek", 85.99, "2 days", "This is rather good one", "S"));
		logic.addAppliance(new Microvawe("LG", 12.99, "1465 days", "This is old one", "XXXL"));
		logic.addAppliance(testMicrovawe);
		
			
		
		
		
		if (catalog.contains(testMicrovawe)) {
			System.out.println("FOUND!!!");
		}
		
		
		List<Appliance> searchResult = logic.findByPriceRange(10, 30);
		for (Appliance a:searchResult) {
			System.out.println(a.info());
		}
	}

}
