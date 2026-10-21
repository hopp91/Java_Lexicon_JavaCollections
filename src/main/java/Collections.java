import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

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
        IO.println("------------------------------");

        for (int i = 0; i < shoppingList.size(); i++) {
            IO.println((i + 1) + ". " + shoppingList.get(i));

        }

        // Exercise 2 – Unique Cities

        Set<String> cities = new HashSet<>();

        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");
        cities.add("Uppsala");
        cities.add("Gothenburg");
        cities.add("Lund");

        IO.println("Unique cities:");

        for (String city : cities) {
            IO.println(city);
        }

        IO.println("Total unique cities: " + cities.size());
        IO.println("------------------------------");

        // Exercise 3 – Phone Book

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Jesper", "0761733982");
        phoneBook.put("Amanda", "070545465");
        phoneBook.put("Simon", "070454242");
        phoneBook.put("Johan", "0704542254");

        IO.println("Enter a name: ");
        String name = IO.readln();

        if (phoneBook.containsKey(name)) {
            IO.println("Phone number: " + phoneBook.get(name));
        } else {
            IO.println("Contact not found.");
        }
        IO.println("------------------------------");

    }
}