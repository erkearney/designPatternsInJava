//GOF Definition: Sepearte the construction of a complex object from its
//representation so that the same construction process can care different
//representations.
public class BuilderPatternExample {
    public static void main(String args[]) {
        System.out.println("***Builder Pattern Example***\n");

        Director director = new Director();

        Builder fordCar = new Car("Ford");
        Builder hondaMotorcycle = new Motorcycle("Honda");

        director.construct(fordCar);
        Product p1 = fordCar.getVehicle();
        p1.showProduct();


        director.construct(hondaMotorcycle);
        Product p2 = hondaMotorcycle.getVehicle();
        p2.showProduct();
    }
}
