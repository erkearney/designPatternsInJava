public class Motorcycle implements Builder {
    private String makeName;
    private Product product;

    public Motorcycle(String make) {
        product = new Product();
        this.makeName = make;
    }

    public void startupOperations() {

    }

    public void buildBody() {
        product.add("This is a body of a Motercycle");
    }

    public void insertWheels() {
        product.add("2 wheels have been added");
    }

    public void addHeadlights() {
        product.add("1 headlight has been added");
    }

    public void endOperations() {
        product.add(String.format("Motercycle make is: %s", this.makeName));
    }

    public Product getVehicle() {
        return product;
    }
}
