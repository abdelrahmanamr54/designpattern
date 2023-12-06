public class Main {

    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singletonInstance = Singleton.getInstance();

        // Call methods on the singleton instance
        singletonInstance.displayMessage();
    }
}
