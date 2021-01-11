abstract class AnimalFactory {
    abstract Animal createAnimal();

    public Animal makeAnimal() {
        System.out.println("You can put anything you want inherited by ALL " +
            "animals here!");

        Animal animal = createAnimal();
        animal.speak();
        animal.favoriteAction();
        
        return animal;
    }
}
