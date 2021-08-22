package Books;
public interface Administrator {
    void findBooks();
    void issueBooks();
    void overdueNotification(Reader reader);
}
