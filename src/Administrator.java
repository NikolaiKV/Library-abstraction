public interface Administrator {

    Book giveBook(String title);
    void overdueNotification(Reader reader);
}