public class Main {
    public static void main(String[] args) {
        String name = "Eray";

        happyBirthday(name);
        happyBirthday(name);
        happyBirthday(name);

        calculateArea(6);
    }

    static void happyBirthday(String name) {
        System.out.println("Happy Birthday %s! " + name);
    }

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
