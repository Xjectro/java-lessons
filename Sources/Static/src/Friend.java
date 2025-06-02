public class Friend {
    String name;
    static int numberOfFriends = 0;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void showFriends() {
        System.out.println("Number of friends: " + numberOfFriends);
    }
}
