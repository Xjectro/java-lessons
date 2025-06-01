public class Main {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWeekend = false;

        // && = AND
        // || = OR
        // ! = NOT

        if (isRaining && isWeekend) {
            System.out.println("Stay in and enjoy a movie!");
        } else if (isRaining) {
            System.out.println("Take an umbrella if you go out.");
        } else if (isWeekend) {
            System.out.println("Enjoy your weekend!");
        } else {
            System.out.println("Have a great day!");
        }
    }
}
