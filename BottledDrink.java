public class BottledDrink extends Drink {

	private int orderedBottles;

	public BottledDrink(String drinkName, double price, int volume, int orderedBottles) {
		super(drinkName, price, volume);
		this.orderedBottles = orderedBottles;
	}

	@Override
	public double pricePerLitre() {
		return 1000 * getPrice() / getVolume();
	}

	@Override
	public double oneRecordPrice() {
		return getPrice() * orderedBottles;
	}

	@Override
	public String toString() {
		return super.toString() + " Ordered number of bottles: " + orderedBottles;
	}
}
