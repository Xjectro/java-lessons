public class Main {
    public static void main(String[] args) {
        boolean isRaining = true;

        while (isRaining) {
            System.out.println("It's raining, stay inside!");
            // Simulate a change in weather
            isRaining = false; // This will end the loop
        }

        do {
            System.out.println("It's still raining, but you can go out with an umbrella.");
            // Simulate a change in weather
            isRaining = false; // This will end the loop
        } while (isRaining);
    }
}
