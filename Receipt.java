import java.util.ArrayList;
import java.util.List;

public class Receipt {

	private List<Drink> drinks;

	public Receipt() {
		this.drinks = new ArrayList<>();
	}

	public void orderDrink(Drink drink) {
		drinks.add(drink);

	}

	public double sumToPay() {
		double sumToPay = 0;
		for (Drink drink : drinks) {
			sumToPay += drink.getPrice();
		}
		return sumToPay;
	}

	public void orderedDrinks() {
		for (Drink drink : drinks) {
			System.out.println(drink);
		}

	}

	@Override
	public String toString() {
		return "Total sum to pay " + sumToPay() + " for " + drinks.size() + " drinks.";
	}
}
