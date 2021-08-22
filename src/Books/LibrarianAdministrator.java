package Books;
public class LibrarianAdministrator extends User implements Librarian, Administrator {
    public LibrarianAdministrator(String name) {
        super(name);
    }
    @Override
    public void findBooks() {
        System.out.println("Librarian finding books");
    }
    @Override
    public void issueBooks() {
        System.out.println("Librarian issuing books");
    }
    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Librarian overduing notifications");
    }
    @Override
    public void makeOrder() {
        System.out.println("Administrator making orders");
    }
}