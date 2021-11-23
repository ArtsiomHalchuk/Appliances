package by.epam.java.appliance.repository;

import java.util.ArrayList;
import java.util.List;

import by.epam.java.appliance.entity.Appliance;

public class ApplianceProvider {
	private static final ApplianceProvider instance = new ApplianceProvider();
	private List <Appliance> wh = new ArrayList<Appliance>();
	
	private ApplianceProvider() {
		return;
	}
	
	public List<Appliance> getCatalog(){
		return wh;
	}
	
	public Appliance getAppliance(int index) {
		if (index>=wh.size()) {
			throw new RuntimeException("error");
		}
		return wh.get(index);
	}
	
	public static ApplianceProvider getInstance() {
		return instance;
	}

}


