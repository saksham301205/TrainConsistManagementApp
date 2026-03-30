import java.util.LinkedList;
import java.util.Queue;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC5: Booking Request Queue (FIFO)");

        // Queue for booking requests
        Queue<String> bookingQueue = new LinkedList<>();

        // Adding booking requests
        bookingQueue.add("Request 1 - Sleeper");
        bookingQueue.add("Request 2 - AC Chair");
        bookingQueue.add("Request 3 - First Class");

        // Display queue
        System.out.println("Booking Requests in Queue:");
        System.out.println(bookingQueue);

        // Processing (just showing FIFO)
        System.out.println("Processing Request: " + bookingQueue.poll());

        // Remaining queue
        System.out.println("Remaining Requests:");
        System.out.println(bookingQueue);
    }
}