class Proxy extends Subject {
    static Subject cs;

    public void doSomeWork() {
        System.out.println("Proxy call here.");
        //Lazy initializiation
        if(cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
