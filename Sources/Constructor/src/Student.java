public class Student {
    String name;
    int age;
    int grade;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, int grade, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}
