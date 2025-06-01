public class Main {
    public static void main(String[] args) {
        int rows;
        int columns;

        for (rows = 1; rows <= 5; rows++) {
            for (columns = 1; columns <= 5; columns++) {
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
