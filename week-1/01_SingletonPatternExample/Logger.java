// Singleton Pattern Example - Logger class
public class Logger {

    // The single instance, created only once
    private static Logger instance;

    // Private constructor so no one else can create a Logger
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Public method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Sample logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
