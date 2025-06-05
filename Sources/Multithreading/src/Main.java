public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("ALLAHIM SANKİ CENNET BURA SEN YAZI OL AŞK BEN TURA"));
        Thread thread2 = new Thread(new MyRunnable("Burger"));

        System.out.println("Starting threads...");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Threads started.");
    }
}
