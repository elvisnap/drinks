public abstract class Drink implements Comparable<Drink> {
	private String drinkName;
	private double price;
	private int volume;

	public Drink(String drinkName, double price, int volume) {
		this.drinkName = drinkName;
		this.price = price;
		this.volume = volume;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public double getPrice() {
		return price;
	}

	public int getVolume() {
		return volume;
	}

	public abstract double pricePerLitre();

	public abstract double oneRecordPrice();

	@Override
	public String toString() {
		return "Drink is " + drinkName + " by " + price + " and " + volume + " price for the ordered amount of the drink " + oneRecordPrice();
	}

	@Override
	public int compareTo(Drink o) {
		return ((Double) pricePerLitre()).compareTo(o.pricePerLitre());
	}
}
