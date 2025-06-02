public class Car {
    String make = "Germany";
    String model = "BMW";
    int year = 2025;
    double price = 6000000.0;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("Car started.");
    }

    void stop() {
        isRunning = false;
        System.out.println("Car stopped.");
    }

    void drive() {
        if (isRunning) {
            System.out.println("Car is driving.");
        } else {
            System.out.println("Start the car first.");
        }
    }

    void breke() {
        if (isRunning) {
            System.out.println("Car is braking.");
        } else {
            System.out.println("Start the car first.");
        }
    }
}
