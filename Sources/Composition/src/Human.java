public class Human {
    private Heart heart = new Heart();

    public void live() {
        heart.beat();
        System.out.println("Human is alive.");
    }
}
