public class Car {
    private String model;
    private String color;
    private double price;

    Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }
}
