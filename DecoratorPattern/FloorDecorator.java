class FloorDecorator extends AbstractDecorator {
    public void makeHouse() {
        super.makeHouse();
        System.out.println("***Floor decorator in action***");
        addFloor();
    }

    private void addFloor() {
        System.out.println("I am adding a new floor!");
    }
}
