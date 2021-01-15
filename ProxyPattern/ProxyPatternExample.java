//GoF definition: Provide a surrogate or placeholder for another object to
//control access to it.
public class ProxyPatternExample {
    public static void main(String args[]) {
        System.out.println("***Proxy Pattern Example***\n");
        Proxy px = new Proxy();
        px.doSomeWork();
    }
}
