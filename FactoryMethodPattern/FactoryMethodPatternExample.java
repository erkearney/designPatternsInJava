//GoF Definition: Define an interface for creating an object, but let a
//subclass decide which class to instantiate. A factory method lets a class
//defer instantiaion to a subclass.
public class FactoryMethodPatternExample {
    public static void main(String args[]) {
        System.out.println("***Factory pattern demo***\n");
        
        AnimalFactory tigerFactory = new TigerFactory();
        Animal aTiger = tigerFactory.makeAnimal();

        AnimalFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.makeAnimal();
    }
}
