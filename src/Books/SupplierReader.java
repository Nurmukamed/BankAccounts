package Books;
public class SupplierReader extends User implements Supplier, Reader {
    public SupplierReader(String name) {
        super(name);
    }
    @Override
    public void takeBooks() {
        System.out.println("Reader taking books");
    }
    @Override
    public void takeBackBooks() {
        System.out.println("Reader take backing books");
    }
    @Override
    public void bringBooks() {
        System.out.println("Supplier bringing books");
    }
}