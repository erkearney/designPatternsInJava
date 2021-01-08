//GOF Definition: Specify the kinds of objects to create using a prototypical
//instnace, and create new objects by copying this prototype.
public class PrototypePatternExample {
    public static void main(String args[]) throws CloneNotSupportedException {
       System.out.println("***Prototpye Pattern Demo***\n");
       BasicCar nano = new Nano("Green Nano");
       nano.basePrice = 100000;

       BasicCar ford = new Ford("White Ford");
       ford.basePrice = 500000;

       BasicCar bc1;
       //Nano
       bc1 = nano.clone();
       bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
       System.out.println("Car is: " + bc1.modelName + " and its price is: "
           + bc1.onRoadPrice);

       //Ford
       bc1 = ford.clone();
       bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
       System.out.println("Car is: " + bc1.modelName + " and its price is: "
           + bc1.onRoadPrice);
    }
}
