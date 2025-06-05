public class Main {
    public static void main(String[] args) {
        // Autoboxing
        Integer a = 123;
        Double b = 45.67;
        Character c = 'A';
        Boolean d = true;

        // Unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean w = d;

        String result = Integer.toString(123);

        System.out.println("Autoboxed Integer: " + a);
    }
}
