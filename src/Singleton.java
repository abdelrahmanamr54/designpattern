public class Singleton {

    // Private static instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Initialization code, if any
    }

    // Public method to get the singleton instance
    public static Singleton getInstance() {
        // Lazy initialization: create the instance if it's null
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the class (if any)

    public void displayMessage() {
        System.out.println("Singleton instance is created!");
    }
}
