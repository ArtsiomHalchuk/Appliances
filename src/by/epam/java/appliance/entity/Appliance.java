package by.epam.java.appliance.entity;

public class Appliance {
	private String name;
	protected double price;
	protected String termOfUsage;


	public Appliance(String name, double price, String termOfUsage) {
		super();
		this.name = name;
		this.price = price;
		this.termOfUsage = termOfUsage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTermOfUsage() {
		return termOfUsage;
	}

	public void setTermOfUsage(String termOfUsage) {
		this.termOfUsage = termOfUsage;
	}

	public String info () {
		return name + " " + "price is " + price + "Used for " + termOfUsage + " months";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((termOfUsage == null) ? 0 : termOfUsage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (termOfUsage == null) {
			if (other.termOfUsage != null)
				return false;
		} else if (!termOfUsage.equals(other.termOfUsage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appliance [name=" + name + ", price=" + price + ", termOfUsage=" + termOfUsage + "]";
	}	

	

}
