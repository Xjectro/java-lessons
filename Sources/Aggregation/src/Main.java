public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", 328);
        Book book2 = new Book("To Kill a Mockingbird", 281);
        Book book3 = new Book("The Great Gatsby", 180);

        Book[] books = { book1, book2, book3 };

        Library library = new Library("City Library", 2023, books);

        library.displayInfo();
    }
}
