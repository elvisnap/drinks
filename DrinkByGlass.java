public class DrinkByGlass extends Drink {

	public DrinkByGlass(String drinkName, double price, int volume) {
		super(drinkName, price, volume);
	}

	@Override
	public double pricePerLitre() {
		return 10 * getPrice();
	}

	@Override
	public double oneRecordPrice() {
		return getPrice() * getVolume() / 100;
	}

}
