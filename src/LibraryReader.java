public class LibraryReader extends User implements Reader{
    Book readBook;

    public LibraryReader(String name) {
        super(name);
    }

    @Override
    public void getBook(Library library, String title){
        readBook = library.getAdmin().giveBook(title);
        System.out.printf("Читатель с именем %s получил книгу с названием%s\n", name, title);
    }

    @Override
    public void giveBook(Library library, Book book) {
        int size = library.getSize();
        library.getBooks()[size] = readBook;
        System.out.printf("Читатель с именем %s вернул книгу с названием%s\n", name, readBook.getTitle());
    }
}