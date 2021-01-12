//GoF definition: Provide an interface for creating families of related or
//dependent objects without specifying their concrete classes.
public class AbstractFactoryPatternExample {
    public static void main(String args[]) {
        AnimalFactory myAnimalFactory;
        Dog myDog;
        Tiger myTiger;
        System.out.println("***Abstract Factory Pattern Demo***\n");

        System.out.println("\nFirst wild animals\n");

        myAnimalFactory = new WildAnimalFactory();
        myDog = myAnimalFactory.createDog();
        myDog.speak();
        myDog.favoriteToy();

        myTiger = myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.favoriteToy();

        System.out.println("\nNow pet animals\n");

        myAnimalFactory = new PetAnimalFactory();
        myDog = myAnimalFactory.createDog();
        myDog.speak();
        myDog.favoriteToy();

        myTiger = myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.favoriteToy();
    }
}
