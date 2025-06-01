public class Main {
    public static void main(String[] args) {
        String email = "xjectro@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);
    }
}
