import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC7: Sort Bogies by Capacity");

        // List of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Sort using Comparator (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Sorted Bogies by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}