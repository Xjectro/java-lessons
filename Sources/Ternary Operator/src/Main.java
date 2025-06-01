public class Main {
    public static void main(String[] args) {
        int age = 21;
        double height = 1.75; // or 1.7
        char grade = 'A';
        boolean isStudent = true; // or false
        String name = "Xjectro";

        System.out.println(age);
        System.out.println(height);
        System.out.println(grade);
        System.out.println(isStudent);
        System.out.println(name);

        // Using the ternary operator to check if the person is a student
        String studentStatus = isStudent ? "You are a student." : "You are not a student.";
        System.out.println(studentStatus);
    }
}
