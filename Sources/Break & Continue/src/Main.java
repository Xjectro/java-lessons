public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Skipping number: " + i);
                continue; // Skip the rest of the loop when i is 5
            }
            if (i == 8) {
                System.out.println("Breaking at number: " + i);
                break; // Exit the loop when i is 8
            }
            System.out.println("Current number: " + i);
        }
    }
}
