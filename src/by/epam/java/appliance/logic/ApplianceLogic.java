package by.epam.java.appliance.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.java.appliance.entity.Appliance;
import by.epam.java.appliance.repository.ApplianceProvider;

public class ApplianceLogic {
	private static final ApplianceProvider provider = ApplianceProvider.getInstance();
	private List<Appliance> catalog = provider.getCatalog();
	
	public ApplianceLogic(List<Appliance> catalog) {
		this.catalog = catalog;
	}
	
	public void addAppliance(Appliance a) {
		catalog.add(a);
	}
	
	
	public List<Appliance> findByPriceRange(double fromPrice, double toPrice){
		List<Appliance> result = new ArrayList<Appliance>();
		if (fromPrice>toPrice) {
			throw new RuntimeException("error");
		}
		for (Appliance d:catalog) {
			if(d.getPrice()>=fromPrice) {
				if(d.getPrice()<=toPrice) {
					result.add(d);
				}
			}
		}
		
		return result;
	}
	

}
