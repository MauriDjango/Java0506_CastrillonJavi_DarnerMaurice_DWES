package mauridjango.exercise.math;

public class MathLibrary {

  /**
   * Devuelve verdadero si el número que se pasa como parámetro es primo,
   * y falso en caso contrario.
   */
  public static boolean esPrimo(int numero) {
    if (numero <= 1) return false; // Números menores o iguales a 1 no son primos
    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) return false; // Si es divisible, no es primo
    }
    return true; // Es primo
  }

  /**
   * Dada una base y un exponente, devuelve la potencia.
   */
  public static double potencia(double base, int exponente) {
    return Math.pow(base, exponente);
  }

  /**
   * Le da la vuelta a un número.
   */
  public static int voltea(int numero) {
    StringBuilder numeroVolteado = new StringBuilder(String.valueOf(Math.abs(numero)));
    numeroVolteado.reverse(); // Invertir el número
    return numero < 0 ? -Integer.parseInt(numeroVolteado.toString()) : Integer.parseInt(numeroVolteado.toString());
  }

  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número entero.
   * Si no se encuentra, devuelve -1.
   */
  public static int posicionDeDigito(int numero, int digito) {
    String numeroStr = String.valueOf(Math.abs(numero));
    String digitoStr = String.valueOf(digito);
    return numeroStr.indexOf(digitoStr); // Devuelve la posición o -1 si no se encuentra
  }

  /**
   * Quita a un número n dígitos por delante (por la izquierda).
   */
  public static int quitaPorDelante(int numero, int n) {
    String numeroStr = String.valueOf(Math.abs(numero));
    if (n >= numeroStr.length()) return 0; // Si quita más dígitos de los que tiene, devuelve 0
    return Integer.parseInt(numeroStr.substring(n)); // Devuelve el número sin los primeros n dígitos
  }

  /**
   * Añade un dígito a un número por delante.
   */
  public static int pegaPorDelante(int numero, int digito) {
    return Integer.parseInt(digito + String.valueOf(Math.abs(numero))); // Agregar el dígito al inicio
  }

  /**
   * Pega dos números para formar uno.
   */
  public static int juntaNumeros(int numero1, int numero2) {
    return Integer.parseInt(String.valueOf(numero1) + String.valueOf(numero2)); // Concatenar números
  }
}
