package mauridjango;

import mauridjango.exceptions.InvalidInputException;
import mauridjango.exercise.Exercise;
import mauridjango.group.Group;
import mauridjango.ui.IO;

import java.util.ArrayList;

/**
 * This class represents the menu system for selecting exercises from different groups.
 */
public class Menu {
    private ArrayList<Group> allGroups = new ArrayList();
    private final IO io;

    /**
     * Constructor to initialize the Menu with a list of exercise groups and IO object.
     *
     * @param groupList A list of exercise groups.
     * @param io        An IO object for input and output.
     */
    public Menu(ArrayList<Group> groupList, IO io) {
        this.allGroups = groupList;
        this.io = io;
    }

    /**
     * Display a list of available exercise groups.
     */
    public void listGroups() {
        int i = 0;
        for (Group group : allGroups) {
            io.write(String.format("%d - %s", i, group.getName()));
            io.write(group.getDescription());
            io.write("\n");
            i = i + 1;
        }
        io.write("Please enter the number of the group you wish to select\n");
    }

    /**
     * Display a list of exercises within a specified group.
     *
     * @param group The index of the selected exercise group.
     */
    public void listExercises(Group group) {
        int i = 0;
        for (Exercise exercise : group.getExercises()) {
            io.write(String.format("%d - %s", i, exercise.getExerciseName()));
            io.write(exercise.getDescription());
            io.write("\n");
            i = i + 1;
        }
        io.write("Please enter the number of the exercise you wish to select\n");
    }

    //TODO Document
    public Group selectGroup(int group) throws InvalidInputException {
        Group selectedGroup;
        try {
            selectedGroup = allGroups.get(group);
        } catch (IndexOutOfBoundsException e) {
            io.write("""
                    The group you selected was not recognized.
                    Please select one of the following groups""");
            listGroups();
            selectedGroup = selectGroup(io.getInt());
        }
        return selectedGroup;
    }

    //TODO redo documentation
    /**
     * Select and return an exercise from a specified group.
     *
     * @param group    The index of the selected exercise group.
     * @param exercise The index of the selected exercise within the group.
     * @return The selected Exercise object.
     */
    public Exercise selectExercise(Group group, int exercise) throws InvalidInputException {
        Exercise selectedExercise;
        try {
            selectedExercise = group.getExercises().get(exercise);
        } catch (IndexOutOfBoundsException e) {
            io.write("""
                    The exercise you selected was not recognized.
                    Please select one of the following exercises""");
            listExercises(group);
            selectedExercise = selectExercise(group, io.getInt());
        }
        return selectedExercise;
    }

    /**
     * Display a welcome message and prompt the user to start the menu.
     */
    public void startMenu() {
        io.write("""
                ██████╗░░█████╗░░██████╗██╗░█████╗░  
                ██╔══██╗██╔══██╗██╔════╝██║██╔══██╗  
                ██████╦╝███████║╚█████╗░██║██║░░╚═╝  
                ██╔══██╗██╔══██║░╚═══██╗██║██║░░██╗  
                ██████╦╝██║░░██║██████╔╝██║╚█████╔╝  
                ╚═════╝░╚═╝░░╚═╝╚═════╝░╚═╝░╚════╝░  

                ░░░░░██╗░█████╗░██╗░░░██╗░█████╗░
                ░░░░░██║██╔══██╗██║░░░██║██╔══██╗
                ░░░░░██║███████║╚██╗░██╔╝███████║
                ██╗░░██║██╔══██║░╚████╔╝░██╔══██║
                ╚█████╔╝██║░░██║░░╚██╔╝░░██║░░██║
                ░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝

                ███████╗██╗░░██╗███████╗██████╗░░█████╗░██╗░██████╗███████╗░██████╗
                ██╔════╝╚██╗██╔╝██╔════╝██╔══██╗██╔══██╗██║██╔════╝██╔════╝██╔════╝
                █████╗░░░╚███╔╝░█████╗░░██████╔╝██║░░╚═╝██║╚█████╗░█████╗░░╚█████╗░
                ██╔══╝░░░██╔██╗░██╔══╝░░██╔══██╗██║░░██╗██║░╚═══██╗██╔══╝░░░╚═══██╗
                ███████╗██╔╝╚██╗███████╗██║░░██║╚█████╔╝██║██████╔╝███████╗██████╔╝
                ╚══════╝╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝░╚════╝░╚═╝╚═════╝░╚══════╝╚═════╝░
                    
                Start?
                y/n...
                """);
    }

    /**
     * Display an exit message when the menu is closed.
     */
    public void exitMenu() {
        io.write("""
███████╗███╗░░██╗██████╗░
██╔════╝████╗░██║██╔══██╗
█████╗░░██╔██╗██║██║░░██║
██╔══╝░░██║╚████║██║░░██║
███████╗██║░╚███║██████╔╝
╚══════╝╚═╝░░╚══╝╚═════╝░
    """);
    }
}
