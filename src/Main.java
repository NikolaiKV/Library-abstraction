class Main {
    public static void main(String[] args) {
        Book[] books = new Book[100];
        books[0] = new Book("Гарри Поттер");
        books[1] = new Book("Анна Каренина");
        books[2] = new Book("Мертвые души");
        books[3] = new Book("Игра престолов");

        Library library = new Library(books, 4);

        LibraryMan workerOleg = new LibraryMan(library, "Олег");
        library.setAdmin(workerOleg);
        library.setLibrarian(workerOleg);

        LibraryReader readerSasha = new LibraryReader("Саша");
        LibraryReader readerPasha = new LibraryReader("Паша");

        LibrarySupplier readerTolya = new LibrarySupplier("Толя");

        readerSasha.getBook(library, "Гарри Поттер");
        readerPasha.getBook(library, "Азбука");

        workerOleg.orderBooks(readerTolya, "Азбука");
        workerOleg.overdueNotification(readerSasha);
    }
}