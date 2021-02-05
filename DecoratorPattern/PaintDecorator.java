class PaintDecorator extends AbstractDecorator {
    public void makeHouse() {
        super.makeHouse();
        System.out.println("***Paint decorator in action***");
        paintHouse();
    }

    private void paintHouse() {
        System.out.println("I am painting the house.");
    }
}
