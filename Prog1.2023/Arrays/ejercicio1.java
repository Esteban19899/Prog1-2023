import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1 {

    final static int MAX = 15;

    public static void main(String[] args) {
        int[] enteros = new int[MAX];
        cargarArreglo(enteros);
        mostrarArreglo(enteros);
    }

    // funcion para cargar arreglos enteros.
    public static void cargarArreglo(int [] arrenteros) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int pos = 0; pos < MAX; pos++) {
                System.out.println("Ingrese el entero de la posiscion " + pos + ": ");
                arrenteros[pos] = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);

        }
    }

    // funcion para mostrar el contenido de un arreglo.
    public static void mostrarArreglo(int[] arrenteros) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("arrenteros[" + pos + "] -> " + arrenteros[pos]);
        }

    }
}
