import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Box<String> box = new Box<>("Test");

        box.setContent("Hello Box");
        System.out.println(box.getContent());
    }
}
