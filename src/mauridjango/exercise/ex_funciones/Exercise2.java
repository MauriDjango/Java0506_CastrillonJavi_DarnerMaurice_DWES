package mauridjango.exercise.ex_funciones;

import mauridjango.exceptions.InvalidInputException;
import mauridjango.exercise.Exercise;
import mauridjango.exercise.math.MathLibrary;
import mauridjango.ui.IO;

public class Exercise2 extends Exercise {
  /**
   * Constructor to initialize the Exercise with an IO object.
   *
   * @param io An IO object for input and output.
   */
  public Exercise2(IO io) {
    super(io);
    String exerciseName = "Ejercicio: Biblioteca de Funciones Matemáticas";
    String description = """
                Este ejercicio demuestra el uso de la biblioteca de funciones matemáticas.
                """;
  }

  @Override
  public void run() throws InvalidInputException {
    // Ejemplos de uso de las funciones matemáticas
    io.write("¿Es primo 7? " + MathLibrary.esPrimo(7)); // true
    io.write("Potencia de 2^3: " + MathLibrary.potencia(2, 3)); // 8
    io.write("Voltea 1234: " + MathLibrary.voltea(1234)); // 4321
    io.write("Posición de dígito 3 en 1234: " + MathLibrary.posicionDeDigito(1234, 3)); // 2
    io.write("Quita 2 dígitos de 12345: " + MathLibrary.quitaPorDelante(12345, 2)); // 345
    io.write("Pega 5 por delante a 123: " + MathLibrary.pegaPorDelante(123, 5)); // 5123
    io.write("Junta 12 y 34: " + MathLibrary.juntaNumeros(12, 34)); // 1234
  }
}
