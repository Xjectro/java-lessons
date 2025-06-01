public class Main {

    static int x = 5; // GLOBAL

    public static void main(String[] args) {
        int x = 0; // LOCAL

        doSomething();
    }

    static void doSomething() {
        int x = 1; // LOCAL
        System.out.println(x);
    }
}
