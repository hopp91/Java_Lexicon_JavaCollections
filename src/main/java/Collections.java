import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {


        // Exercise 1 – Shopping List

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Milk");
        shoppingList.add("Hamburger");
        shoppingList.add("Pizza");
        shoppingList.add("Potatoes");
        shoppingList.add("Cheese");


        IO.println("Shopping List:");

        for (int i = 0; i < shoppingList.size(); i++) {
            IO.println((i + 1) + ". " + shoppingList.get(i));
        }

        shoppingList.remove("Pizza");


        IO.println("\nUpdated Shopping List:");

        for (int i = 0; i < shoppingList.size(); i++) {
            IO.println((i + 1) + ". " + shoppingList.get(i));


        }
    }
}