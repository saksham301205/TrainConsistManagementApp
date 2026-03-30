import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Room Search & Availability ===");

        // Inventory (room type → availability)
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 5);
        inventory.put("Double", 0);
        inventory.put("Suite", 3);

        // Room details (price)
        Map<String, Integer> price = new HashMap<>();
        price.put("Single", 2000);
        price.put("Double", 3500);
        price.put("Suite", 5000);

        // Display available rooms (read-only)
        for (String room : inventory.keySet()) {
            if (inventory.get(room) > 0) {
                System.out.println(room + " | Price: " + price.get(room) + " | Available: " + inventory.get(room));
            }
        }
    }
}