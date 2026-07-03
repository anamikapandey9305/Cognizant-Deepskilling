package singletonpattern;

public class Logger {

    // Sirf ek object banega
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger object created");
    }

    // Object return karne wala method
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}