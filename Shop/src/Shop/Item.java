package Shop;

public class Item {

	private String name;
	private double price;
	
	public Item(String name, double price){
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		return 31 * name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item) || obj == null) {
			return false;
		}
		Item other = (Item) obj;
		if(Double.compare(other.price, price) != 0) {
			return false;
		}
		return name.equals(other.name);
	}
	public int compareTo(Item other) {
		if(other == null) {
			return 1;
		}
		int comparision = this.getName().compareTo(other.getName());
		if(comparision != 0) {
			return comparision;
		}
		return Double.compare(this.getPrice(), other.getPrice());
	}
}
