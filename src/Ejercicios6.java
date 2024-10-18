public class Ejercicios6 {
    public static Boolean esCapicua(Integer num){
        String cap = num.toString();
        if (cap == new StringBuilder(cap).reverse().toString()){
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int numero) {
        numero++;
        while (!esPrimo(numero)) {
            numero++;
        }
        return numero;
    }

    public static int digitos(Integer numero){
        String cap = numero.toString();
        return cap.length();
    }


    public static char digitoN(Integer numero, int posicion) {
        String cap = numero.toString();
        return cap.charAt(posicion);
    }

    public static int quitaPorDetras(Integer numero, int posiciones) {
        int divisor = (int) Math.pow(10, posiciones);
        return numero / divisor;
    }
}
