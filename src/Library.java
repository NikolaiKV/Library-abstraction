public class Library {

    Administrator admin;
    Librarian librarian;
    Book[] books;
    int size;

    public Library(Book[] books, int size) {
        this.books = books;
        this.size = size;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Administrator getAdmin(){
        return admin;
    }

    public void setAdmin(Administrator admin) {
        this.admin = admin;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public int getSize() {
        return size;
    }

    public int setSize() {
        return size;
    }
}