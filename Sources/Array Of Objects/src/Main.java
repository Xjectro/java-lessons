public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Civic", "Blue");
        Car car3 = new Car("Camry", "Black");
        Car[] cars = { car1, car2, car3 };

        for (Car car : cars) {
            car.drive();
        }
    }
}
