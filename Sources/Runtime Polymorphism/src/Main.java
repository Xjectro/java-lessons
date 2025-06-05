import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the type of animal (Dog/Cat): ");
            String type = scanner.nextLine();

            Animal animal;

            do {
                if (type.equalsIgnoreCase("Dog")) {
                    animal = new Dog();
                } else if (type.equalsIgnoreCase("Cat")) {
                    animal = new Cat();
                } else {
                    System.out.println("Invalid type. Please enter Dog or Cat.");
                    type = scanner.nextLine();
                    continue;
                }

                animal.speak();
                System.out.println("Enter another type of animal (Dog/Cat) or 'exit' to quit: ");
                type = scanner.nextLine();
            } while (type.equalsIgnoreCase("Dog") || type.equalsIgnoreCase("Cat"));
        }
    }
}
