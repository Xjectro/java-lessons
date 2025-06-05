public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();

        Vehicle[] vehicles = { car, bike };

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
