public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red", 30000.45);

        System.out.printf("Car is %s color car model is %s cor price is %.2f", car.getColor(), car.getModel(),
                car.getPrice());
    }
}
