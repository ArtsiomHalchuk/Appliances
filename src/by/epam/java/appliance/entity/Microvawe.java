package by.epam.java.appliance.entity;

public class Microvawe extends Appliance{
	
	private String description;
	private String size;
	

	public Microvawe(String name, double price, String termOfUsage) {
		super(name, price, termOfUsage);
		this.description = "undefined";
		this.size = "undefined";
	}

	public Microvawe(String name, double price, String termOfUsage, String description, String size) {
		super(name, price, termOfUsage);
		this.description = description;
		this.size = size;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String info () {
		return this.getName() + "  " + "Price is " + this.getPrice() + "Microvawe is used for " + this.getTermOfUsage() + "Microvawe size is " + size + " Description: " + description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		Microvawe other = (Microvawe) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Microvawe [description=" + description + ", size=" + size + "]";
	}
	
	
}
