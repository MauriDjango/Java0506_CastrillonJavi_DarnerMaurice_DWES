/**
 * Custom exception class for representing invalid input scenarios.
 * This exception is typically thrown when input data does not meet certain criteria.
 */
package mauridjango.exceptions;

public class InvalidInputException extends Exception {

    /**
     * Constructs an InvalidInputException with a custom error message.
     *
     * @param errorMessage A descriptive error message explaining the invalid input condition.
     */
    public InvalidInputException(String errorMessage) {
        super(errorMessage);
    }
}
