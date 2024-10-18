package mauridjango.ui;

import exceptions.InvalidInputException;

/**
 * Utility class for input validation.
 */
public class Validation {

    /**
     * Parse an integer from a string input, and keep prompting the user until a valid integer is provided.
     *
     * @param string The string input to be parsed as an integer.
     * @return The parsed integer value.
     * @throws NumberFormatException if the input is not a valid integer.
     */
    public static boolean isInt(String string) throws NumberFormatException {
        boolean isValid = false;
        try {
            Integer.parseInt(string);
            isValid = true;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return isValid;
    }

    /**
     * Validate if the input is "y" or "n" (case-insensitive).
     *
     * @param input The input string to validate.
     * @return True if the input is "y" or "n", false otherwise.
     * @throws InvalidInputException if the input is neither "y" nor "n".
     */
    public static boolean validateYN(String input) throws InvalidInputException {
        boolean result = false;
        try {
            if ("y".equalsIgnoreCase(input) || "n".equalsIgnoreCase(input)) {
                result = true;
            } else {
                throw new InvalidInputException("Invalid input for y/n");
            }
        } catch (InvalidInputException e) {
            // Here, you can handle the exception, such as logging it or displaying an error message.
            System.out.println(e.getMessage());
        }
        return result;
    }
}
