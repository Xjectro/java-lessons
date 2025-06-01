public class Main {
    public static void main(String[] args) {
        String day = "Monday";

        switch (day) {
            case "Monday" -> System.out.println("Start of the work week!");
            case "Tuesday" -> System.out.println("It's Tuesday, keep going!");
            case "Wednesday" -> System.out.println("Midweek already!");
            case "Thursday" ->
                System.out.println("Almost there!");
            case "Friday" ->
                System.out.println("It's Friday, the weekend is near!");
            case "Saturday" ->
                System.out.println("Enjoy your weekend!");
            case "Sunday" ->
                System.out.println("Rest and prepare for the week ahead.");
            default ->
                System.out.println("Not a valid day.");
        }
    }
}
