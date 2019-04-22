import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) throws Exception {
        List<Drink> drinks = readDrinks("src/cafe.txt");

        List<Receipt> receipts = new ArrayList<>();
        receipts.add(new Receipt());
        receipts.add(new Receipt());
        receipts.add(new Receipt());
        receipts.add(new Receipt());
        receipts.add(new Receipt());


        for (Receipt receipt : receipts) {
            Collections.shuffle(drinks);
            int n = (int) ((Math.random()*4)+1);

            for ( int i = 0; i<n; i++){
                receipt.orderDrink(drinks.get(n));
            }
        }

        Collections.sort(drinks);



        for (Drink drink : drinks) {
            System.out.println(drink);
        }
        System.out.println();


        for (Receipt receipt: receipts){
            System.out.println(receipt);
        }
    }


    public static List<Drink> readDrinks(String fileName) throws Exception {
        List<Drink> drinks = new ArrayList<>();
        Scanner scanner = new Scanner(new File(fileName));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            if (parts.length == 4) {
                drinks.add(new BottledDrink(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]),Integer.parseInt(parts[3])));
            } else {
                drinks.add(new DrinkByGlass(parts[0], Double.parseDouble(parts[1]),Integer.parseInt(parts[2])));
            }
        }

        scanner.close();
        return drinks;
    }


}
