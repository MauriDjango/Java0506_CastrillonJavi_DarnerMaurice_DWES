package mauridjango.group;

import mauridjango.exercise.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a group of exercises with a common theme.
 */
public class Group {
    private ArrayList<Exercise> exerciseList = new ArrayList<>();
    protected String name;
    protected String description;

    /**
     * Add one or more exercises to the group.
     *
     * @param exercises An array of Exercise objects to add to the group.
     */
    public void add(Exercise... exercises) {
        exerciseList.addAll(Arrays.asList(exercises));
    }

    /**
     * Get the name of the exercise group.
     *
     * @return The name of the group.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the exercise group.
     *
     * @param name The name to set for the group.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the description of the exercise group.
     *
     * @return The description of the group.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the exercise group.
     *
     * @param description The description to set for the group.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get a list of exercises in the group.
     *
     * @return A list of Exercise objects in the group.
     */
    public List<Exercise> getExercises() {
        return this.exerciseList;
    }
}
