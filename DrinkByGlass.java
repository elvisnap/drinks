public class DrinkByGlass extends Drink {


    public DrinkByGlass(String drinkName , double price , int volume) {
        super(drinkName , price , volume);
    }

    @Override
    public double pricePerLitre() {
        return 10*getPrice();
    }

    @Override
    public double oneRecordPrice() {
        return getPrice()*getVolume()/100;
    }

    @Override
    public String toString() {
        return "Glass drink is " + getDrinkName() +" by " + getPrice()+ " per 100 ml. " + "Ordered volume is " + getVolume() + " ml. The price for the ordered amount of the drink is " + oneRecordPrice();
    }
}
