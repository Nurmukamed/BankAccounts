package Books;
public class Test {
    public static void main(String[] args) {
        LibrarianAdministrator la = new LibrarianAdministrator("Aiden ");
        System.out.print(la.getName());
        la.makeOrder();
        LibrarianAdministrator la2 = new LibrarianAdministrator("Max ");
        System.out.print(la.getName());
    }
}