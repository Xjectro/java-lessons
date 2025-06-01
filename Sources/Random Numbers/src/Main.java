import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int number;

        number = random.nextInt(100); // Generates a random number between 0 and 99

        System.out.println("Random number between 0 and 99: " + number);
    }
}