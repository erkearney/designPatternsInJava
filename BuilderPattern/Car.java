public class Car implements Builder {
    private String makeName;
    private Product product;

    public Car(String make) {
        product = new Product();
        this.makeName = make;
    }

    public void startupOperations() {
        product.add(String.format("Car make is: %s", this.makeName));
    }

    public void buildBody() {
        product.add("This is a body of a Car");
    }

    public void insertWheels() {
        product.add("4 wheels have been added");
    }

    public void addHeadlights() {
        product.add("2 headlights have been added");
    }

    public void endOperations() {

    }

    public Product getVehicle() {
        return product;
    }
}
