//GOF Definition: Ensure a class only has one instance, and provide a global
//point of access to it.
public class SingletonPatternExample {
    public static void main(String [] args) {
        System.out.println("****Singleton Pattern Demo****\n");
        System.out.println("Looking for a captain");
        Captain captain1 = Captain.getCaptain();
        System.out.println("Looking for another captain");
        Captain captain2 = Captain.getCaptain();
        if(captain1 == captain2) {
            System.out.println("Captain1 and captain2 are the same instance.");
        }
    }
}

