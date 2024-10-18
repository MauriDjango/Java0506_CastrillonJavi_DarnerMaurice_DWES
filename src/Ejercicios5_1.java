import java.lang.reflect.Array;

public class Ejercicios5_1 {
/*
    Ejercicio 1
    Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los
    valores según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos
    en forma de tabla como se muestra en la figura.
  */
  void ejercicio1() {
      Integer[][] num = {
              {0, 30, 2, null , null, 5},
              {75, null, null, null, 0, null},
              {null, null, -2, 9, null, 11}
      };
      for (Integer[] fila : num) {
          for (Integer valor : fila) {
              if (valor != null) {
                  System.out.print(valor + " ");
              }else {
                  System.out.print("  ");
              }

          }
          System.out.print("\n");
      }
  }
}
