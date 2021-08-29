public class LibraryMan extends User implements Librarian, Administrator {
    Library library;

    public LibraryMan(Library library, String name) {
        super(name);
        this.library = library;
    }

    @Override
    public void orderBooks(Supplier supplier, String title) {
        System.out.printf("Библиотекарь заказывает книги %s\n", title);
        final Book[] orderBooks = supplier.supply(title);

        final Book[] libraryBooks = library.getBooks();
        int size = library.getSize();

        for (Book orderBook : orderBooks) {
            libraryBooks[size++] = orderBook;
        }


        System.out.printf("Теперь книг в библиотеке %d\n", size);
    }

    @Override
    public Book giveBook(String title) {
        final Book[] libraryBooks = library.getBooks();

        for (int i = 0; i < libraryBooks.length; i++){
            if (libraryBooks[i] == null) continue;
            if (libraryBooks[i].getTitle().equals(title)) {
                Book targetBook = libraryBooks[i];
                libraryBooks[i] = null;
                System.out.printf("Администратор выдал книгу %s\n", title);
                return targetBook;
            }
        }

        System.out.printf("Администратор не нашел книгу %s, данной книги нет!\n", title);
        return null;
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.printf("%s, верните книги!", reader);
    }
}