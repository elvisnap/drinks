public class BottledDrink extends Drink{



    private int bottles;

    public BottledDrink(String drinkName , double price , int volume , int bottles) {
        super(drinkName , price , volume);
        this.bottles = bottles;
    }
//     public double price_per_bottle

    @Override
    public double pricePerLitre() {
        return 1000*getPrice()/getVolume();
    }

    @Override
    public double oneRecordPrice() {
        return getPrice()*bottles      ;
    }

    @Override
    public String toString() {
        return  "Bottle drink is " + getDrinkName() +". The price by bottle is " + getPrice() + ". The volume of bottle is " + getVolume() + ". The price for the ordered amount of the drink " + oneRecordPrice();
    }
}
