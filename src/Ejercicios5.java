import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios5 {
    /*Ejercicio 15
 En una
Inicialmente, las mesas se
cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan nuevos clientes se debe mostrar
el estado de las mesas. Los grupos no se pueden romper aunque haya huecos sueltos suficientes.
El funcionamiento del programa se ilustra a continuación:*/
    void ejercicio15() {
        Map<String, Integer> mesas = new HashMap<>(Map.of());
        for (int i = 1; i < 11; i++) {
            Random random = new Random();
            mesas.put("Mesa" + i, random.nextInt(5));
        }
        //TODO: Leer numero personas y entrar en while
        for (int i = 1; i < 11; i++) {
            System.out.println("Mesa" + i + " = " + mesas.get("Mesa" + i));
        }
        Scanner scanner = new Scanner(System.in);

        var cantidadPersonas = scanner.nextInt();

        while (cantidadPersonas != -1) {

            if (cantidadPersonas > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + cantidadPersonas + ", haga grupos de 4 personas como máximo e intente de nuevo");
            } else {
                if (mesas.values().contains(0)) {
                    for (int i = 1; i < 11; i++) {
                        if (mesas.get("Mesa" + i) == 0) {
                            mesas.put("Mesa" + i, cantidadPersonas);
                            System.out.println("Sentados en mesa" + i);
                            break;
                        }
                    }
                } else {
                    Boolean sentado = Boolean.FALSE;
                    for (int i = 1; i < 11; i++) {

                        if (mesas.get("Mesa" + i) + cantidadPersonas <= 4) {
                            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+i);
                            mesas.put("Mesa" + i, mesas.get("Mesa" + i)+cantidadPersonas);
                            sentado = Boolean.TRUE;
                            break;

                        }
                    }
                    if (sentado == Boolean.FALSE) {
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                    }

                }
                for (int i = 1; i < 11; i++) {
                    System.out.println("Mesa" + i + " = " + mesas.get("Mesa" + i));
                }
            }
            cantidadPersonas = scanner.nextInt();
        }
    }
}