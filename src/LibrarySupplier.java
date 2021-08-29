public class LibrarySupplier extends LibraryReader implements Supplier, Reader {

    public LibrarySupplier(String name) {
        super(name);
    }

    @Override
    public Book[] supply(String title) {
        System.out.printf("Я получил заказ на книгу: %s\n", title);
        Book[] books = new Book[5];
        for (int i=0; i < books.length; i++) {
            books[i] = new Book(title);
        }
        return books;
    }
}