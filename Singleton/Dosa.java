package Singleton;

public class Dosa {

    // Eagerly create the single instance of the class
    private static final Dosa INSTANCE = new Dosa();

    // Private constructor to prevent instantiation from outside
    private Dosa() {
    }

    // Public method to provide access to the single instance
    public static Dosa getInstance() {
        return INSTANCE;
    }
}
