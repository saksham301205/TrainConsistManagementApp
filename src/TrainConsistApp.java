import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC5: Preserve Insertion Order using LinkedHashSet");

        // LinkedHashSet for bogies
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Adding bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Duplicate attempt
        train.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(train);
    }
}