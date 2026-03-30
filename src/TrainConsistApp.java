import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger bogies list
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after adding
        System.out.println("After adding bogies: " + bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        // Display after removal
        System.out.println("After removing AC Chair: " + bogies);

        // Check existence
        System.out.println("Is Sleeper present? " + bogies.contains("Sleeper"));

        // Final state
        System.out.println("Final bogie list: " + bogies);
    }
}