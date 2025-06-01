public class Main {
    public static void main(String[] args) {
        String name = "Eray Günüuygun";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("E");

        if (name.contains("Eray")) {
            System.out.println("Name contains 'Eray'");
        } else {
            System.out.println("Name does not contain 'Eray'");
        }

        if (name.equals("Eray Günüuygun") || name.equalsIgnoreCase("eray günüuygun")) {
            System.out.println("Name is equal to 'Eray Günüuygun'");
        } else {
            System.out.println("Name is not equal to 'Eray Günüuygun'");
        }

        System.out.printf("%d %s %d", length, letter, index);
    }
}
