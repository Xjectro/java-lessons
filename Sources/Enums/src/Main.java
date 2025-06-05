public class Main {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday.");
            case SATURDAY, SUNDAY -> System.out.println("It is a weekend.");
        }

        System.out.println("Day: " + day);
    }
}
