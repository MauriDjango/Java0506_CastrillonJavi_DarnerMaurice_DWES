package mauridjango.exercise.ex_arrayunidimensional;

import mauridjango.exceptions.InvalidInputException;
import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;

public class Exercise16 extends Exercise {
  /**
   * Constructor to initialize the Exercise with an IO object.
   *
   * @param io An IO object for input and output.
   */
  public Exercise16(IO io) {
    super(io);
    String exerciseName = "Exercise 16";
    String description = """
                Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios 
                comprendidos entre 0 y 400 (ambos incluidos). A continuación, el programa mostrará el array 
                y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. 
                Seguidamente se volverá a mostrar el array escribiendo los números que se quieren resaltar 
                entre corchetes.
                """;
  }

  @Override
  public void run() throws InvalidInputException {
    ArrayList<Integer> numeros = getArray();
    io.write("Array original: " + numeros);

    io.write("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7):");
    int opcion = io.getInt();  // Assuming getInt() reads an integer from user input

    io.write("Array resaltado: " + getHighlightedArray(numeros, opcion));
  }

  private ArrayList<Integer> getArray() {
    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      array.add((int) Math.round(Math.random() * 400)); // Números aleatorios entre 0 y 400
    }
    return array;
  }

  private String getHighlightedArray(ArrayList<Integer> array, int option) {
    StringBuilder highlighted = new StringBuilder();

    for (int num : array) {
      if ((option == 1 && num % 5 == 0) || (option == 2 && num % 7 == 0)) {
        highlighted.append("[").append(num).append("] "); // Resaltar el número entre corchetes
      } else {
        highlighted.append(num).append(" ");
      }
    }
    return highlighted.toString().trim();
  }
}
