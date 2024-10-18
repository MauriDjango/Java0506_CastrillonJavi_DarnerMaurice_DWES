package mauridjango;

import mauridjango.exceptions.InvalidInputException;
import mauridjango.exercise.*;
import mauridjango.exercise.ex_arraysbidemensionales.Exercise2;
import mauridjango.group.*;
import mauridjango.group.Group;
import mauridjango.ui.IO;
import mauridjango.ui.console.Consoleio;

import java.util.ArrayList;


//TODO Still not sure why double spaced between groups and exercises
/**
 * This is the main class of the program responsible for executing exercises
 * from various groups through a menu system.
 */
public class Main {
    public static void main(String[] args) throws InvalidInputException {

        boolean running = false;
        IO io = new Consoleio();

        // Create instances of different exercise groups
        final Group groupBiArrays = new GroupBiArrays();
        groupBiArrays.add(
                new Exercise2(io)
            );

        final Group groupSingleArrays = new GroupSingleArrays();
        groupSingleArrays.add(
                new mauridjango.exercise.ex_arrayunidimensional.Exercise16(io)
        );

        final Group groupFunctions = new GroupFunctions();
        groupFunctions.add(
                new mauridjango.exercise.ex_funciones.Exercise2(io)
        );

        ArrayList<Group> groups = new ArrayList<>();
        groups.add(groupBiArrays);
        groups.add(groupSingleArrays);
        groups.add(groupFunctions);

        Menu menu = new Menu(groups, io);

        menu.startMenu();

        running = io.getYN();

        while (running) {
            io.write("Available options");
            menu.listGroups();
            Group group = menu.selectGroup(io.getInt());

            menu.listExercises(group);
            Exercise exercise = menu.selectExercise(group, io.getInt());

            exercise.run();

            io.write("Continue?\ny/n?");

            running = io.getYN();

            menu.exitMenu();
        }
    }
}
