//GoF Definition: Attach additional responsibilites to an object dynamically,
//Decorators provide a flexcible alternative to subclassing for extending
//functionality.
public class DecoratorPatternExample {
    public static void main(String args[]) {
        System.out.println("***Decorator pattern example***\n");
        ConcreteComponent baseHouse = new ConcreteComponent();
        baseHouse.makeHouse();

        System.out.println("____________");
        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setComponent(baseHouse);
        floorDecorator.makeHouse();

        System.out.println("____________");
        PaintDecorator paintDecorator = new PaintDecorator();
        paintDecorator.setComponent(floorDecorator);
        paintDecorator.makeHouse();
    }
}
