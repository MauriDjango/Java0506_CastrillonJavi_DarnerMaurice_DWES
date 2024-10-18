package mauridjango.ui;

import mauridjango.exceptions.*;

import java.util.ArrayList;

/**
 * Abstract class representing Input/Output operations for the application.
 * Subclasses must implement the `write` and `read` methods to handle IO operations.
 */
public abstract class IO {

    /**
     * Write a message to the output.
     *
     * @param message The message to be displayed.
     */
    public abstract void write(String message);

    /**
     * Read user input.
     *
     * @return The user's input as a String.
     */
    public abstract String read();

    /**
     * Get a list of user inputs based on a list of questions.
     *
     * @param questions A list of questions to display to the user.
     * @return A list of user inputs corresponding to the questions.
     */
    public ArrayList<String> getInputs(ArrayList<String> questions) {
        ArrayList<String> inputs = new ArrayList<>();
        questions.forEach(question -> {
            write(question);
            inputs.add(read());
        });
        return inputs;
    }

    /**
     * Get a yes/no (boolean) response from the user.
     *
     * @return True if the user enters "y" or "Y," false if the user enters "n" or "N."
     * @throws InvalidInputException if the user enters an invalid response.
     */
    public abstract Boolean getYN() throws InvalidInputException;

    /**
     * Get an integer input from the user.
     *
     * @return The integer input provided by the user.
     * @throws InvalidInputException if the user enters a non-integer value.
     */
    public abstract int getInt() throws InvalidInputException;

    /**
     * Convert a string to an integer.
     *
     * @param string The string to be converted.
     * @return The integer value obtained by parsing the string.
     * @throws NumberFormatException if the string is not a valid integer.
     */
    public abstract int toInt(String string) throws NumberFormatException;
}
