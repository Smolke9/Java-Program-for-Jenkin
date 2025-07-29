import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

    // ANSI color codes for terminal
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        HelloWorld greeter = new HelloWorld();
        greeter.displayGreeting("Developer");
    }

    // Method to display colorful, timestamped greeting
    public void displayGreeting(String name) {
        String time = getCurrentTime();
        System.out.println(GREEN + "✨ Welcome to Java World ✨" + RESET);
        System.out.println(CYAN + "Hello, " + name + "! The time is: " + time + RESET);
    }

    // Met
