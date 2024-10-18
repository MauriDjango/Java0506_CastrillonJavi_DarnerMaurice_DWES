package mauridjango.exercise;

import mauridjango.exceptions.InvalidInputException;
import mauridjango.ui.IO;

import java.util.ArrayList;

/**
 * Abstract class representing an exercise in the application.
 */
public abstract class Exercise {

    protected final IO io;
    private String exerciseName;
    private String description;
    protected ArrayList<String> question = new ArrayList<>();

    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise(IO io) {
        this.io = io;
    }

    /**
     * Run the exercise.
     */
    public abstract void run() throws InvalidInputException;

    /**
     * Get the name of the exercise.
     *
     * @return The name of the exercise.
     */
    public String getExerciseName() {
        return exerciseName;
    }

    /**
     * Set the name of the exercise.
     *
     * @param exerciseName The name to set for the exercise.
     */
    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    /**
     * Get the description of the exercise.
     *
     * @return The description of the exercise.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the exercise.
     *
     * @param description The description to set for the exercise.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get user inputs based on predefined questions.
     *
     * @return A list of user inputs corresponding to the questions.
     */
    protected ArrayList<String> getInputs() {
        return io.getInputs(question);
    }
}
