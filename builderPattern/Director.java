public class Director {
    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        builder.startupOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.endOperations();
    }
}
