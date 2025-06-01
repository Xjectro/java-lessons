public class Main {
    static void main(String[] args) {
        String pizza = makePizza("Margherita", "Tomato", "Mozzarella", "Basil");
        System.out.println(pizza);
    }

    static String makePizza(String name, String... toppings) {
        StringBuilder pizza = new StringBuilder("Pizza: " + name + "\nToppings: ");
        for (String topping : toppings) {
            pizza.append(topping).append(", ");
        }
        // Remove the last comma and space
        if (pizza.length() > 0) {
            pizza.setLength(pizza.length() - 2);
        }
        return pizza.toString();
    }
}
