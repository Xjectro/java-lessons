public class Animal {
    boolean isAlive;

    Animal() {
        this.isAlive = true;
    }

    void eat() {
        if (isAlive) {
            System.out.println("Eating...");
        } else {
            System.out.println("Cannot eat, the animal is not alive.");
        }
    }
}
