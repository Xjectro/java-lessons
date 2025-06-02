public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Spongebob Squarepants", 25, 4, 3.8, true);
        Student student2 = new Student("Patrick Star", 22, 2, 2.5, false);

        student1.study();
        student2.study();
    }
}
