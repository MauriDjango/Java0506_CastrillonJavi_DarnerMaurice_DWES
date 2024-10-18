package mauridjango.exercise.ex_arraysbidemensionales;

import mauridjango.exceptions.InvalidInputException;
import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

public class Exercise2 extends Exercise {
    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise2(IO io) {
        super(io);
        String exerciseName = "Ejercicio: Sumas en Array Bidimensional";
        String description = """
                Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un 
                array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y 
                columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en 
                la esquina inferior derecha.
                """;
    }

    @Override
    public void run() throws InvalidInputException {
        int[][] array = new int[4][5];
        int totalSum = 0;

        // Solicitar 20 números enteros al usuario
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                io.write(String.format("Introduce el número para la posición [%d][%d]: ", i, j));
                array[i][j] = io.getInt(); // Suponiendo que getInt() lee un número entero del usuario
                totalSum += array[i][j]; // Sumar el número al total
            }
        }

        // Mostrar el array y las sumas parciales
        int[] filaSums = new int[4]; // Array para almacenar la suma de cada fila
        int[] colSums = new int[5]; // Array para almacenar la suma de cada columna

        io.write("Array con Sumas:\n");

        // Calcular sumas de filas y columnas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                io.write(array[i][j] + "\t"); // Imprimir el elemento
                filaSums[i] += array[i][j]; // Sumar a la fila
                colSums[j] += array[i][j]; // Sumar a la columna
            }
            io.write("| " + filaSums[i]); // Imprimir suma de la fila
            io.write("\n");
        }

        // Imprimir sumas de columnas
        for (int j = 0; j < 5; j++) {
            io.write(colSums[j] + "\t"); // Imprimir suma de la columna
        }
        io.write("| " + totalSum); // Imprimir suma total en la esquina inferior derecha
        io.write("\n");
    }
}
