
import java.util.logging.Logger;



public class Loggering {
    // Step 1: Create a logger instance
    private static final Logger logger = Logger.getLogger(Loggering.class.getName());

    public static void main(String[] args) {
        // Step 2: Log custom messages
        logger.info("Application started.");
        logger.warning("This is a warning!");
        logger.severe("Something went wrong!");
        logger.fine("This is a fine-level debug message.");
        
        // You can also add variables to log messages
        String username = "john_doe";
        logger.info("User logged in: " + username);
    }
}
