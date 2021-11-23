package by.epam.java.appliance.entity;

public class Freezer extends Appliance {
	
	private String model;
	private String volume;
	
	
	public Freezer(String name, double price, String termOfUsage) {
		super(name, price, termOfUsage);
		this.model="undefined";
		this.volume="undefined";
	}
	
	public Freezer(String name, double price, String termOfUsage, String model, String volume) {
		super(name, price, termOfUsage);
		this.model = model;
		this.volume = volume;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String info () {
		return this.getName() + "  " + "Model is: " + model + "Price " + this.getPrice() + "Freezer is used for " + this.getTermOfUsage() + "Freezer volume is " + volume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((volume == null) ? 0 : volume.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Freezer other = (Freezer) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (volume == null) {
			if (other.volume != null)
				return false;
		} else if (!volume.equals(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Freezer [model=" + model + ", volume=" + volume + "]";
	}

	

}
