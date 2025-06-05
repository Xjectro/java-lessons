public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog() {
            @Override
            void speak() {
                System.out.println("Woof! Woof!");
            }
        };

        dog.speak();
    }
}
