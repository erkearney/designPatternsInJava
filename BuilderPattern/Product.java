import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts = new LinkedList<String>();

    public void product() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("\nProduct completed:");
        for(String part : parts) {
            System.out.println(part);
        }
    }
}
