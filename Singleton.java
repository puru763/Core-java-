
class SiongletonPattern {
    private static SiongletonPattern instance;

    private SiongletonPattern() {
    }

    public static SiongletonPattern getInstance() {
        if (instance == null) {
            instance = new SiongletonPattern();
        }
        return instance;
    }

    public void someMethod() {
        System.out.println("This is a method in the SiongletonPattern instance.");
    }
}

public class Singleton {
    public static void main(String[] args) {
        SiongletonPattern SiongletonPattern1 = SiongletonPattern.getInstance();
        SiongletonPattern SiongletonPattern2 = SiongletonPattern.getInstance();

        if (SiongletonPattern1 == SiongletonPattern2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Both instances are different.");
        }

        SiongletonPattern1.someMethod();
    }
}