import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class metodos {

    public static final int MAX = 10;
    public static final int MAXVALOR = 20;
    public static final int MINVALOR = 1;// hasta
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int[] enteros = new int[MAX];
    }








    // Imprimir arreglo de enteros//
    public static void imprimirArregloInt(int[] arreglo) {
        for (int i = 0; i < MAX; i++) {
            System.out.println(arreglo[i] + " | ");
        }
    }

    // Imprimir arreglo de caracteres//
    public static void imprimirArregloChar(char[] arreglo) {
        for (int i = 0; i < MAX; i++) {
            System.out.println(arreglo[i] + " | ");
        }
    }

    // Cargar un arreglo de enteros//
    public static void cargarArregloInt(int[] arreglo) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < MAX; i++) {
                System.out.println("Ingrese el entero de la posición " + i + ":");
                arreglo[i] = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    // Cargar un arreglo de caracteres //
    public static void cargarArregloChar(int[] arreglo) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < MAX; i++) {
                System.out.println("Ingrese el caracter de la posicion " + i + ":");
                arreglo[i] = entrada.readLine().charAt(0);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    //Cargar un arreglo de char con valores de 'a' a la 'z'//
    public static void cargar_arreglo_aleatorio_char(char [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
            arr[pos]=(char)(r.nextInt(26) + 'a');
        }
    }
    //Cargar un arreglo de int con valores de MINVALOR a MAXVALOR
    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    // Obtener INICIO de secuencia en arreglo de enteros//
    public static int obtenerInicioSecuencia(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] == 0) {
            pos++;
        }
        return pos;
    }

    // Obtener FIN de secuencia en un arreglo de enteros//
    public static int obtenerFinSecuencia(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] == 0) {
            pos++;
        }
        return pos - 1;
    }

    // Eliminar secuencia en un arreglo//
    public static void eliminarSecuencia(int[] arreglo, int inicio, int fin) {
        int aux = inicio;
        while (aux <= fin) {
            corrimiento_Izquierda(arreglo, inicio);
            aux++;
        }
    }

    //Corrimiento a la izquierda
    public static void corrimiento_Izquierda(int[]arreglo, int posicion){
        for(int i=posicion;i<MAX-1;i++){
            arreglo[i]=arreglo[i+1];                
        }
    }

    //Corrimiento a la derecha
    public static void corrieminto_Derecha(int []arreglo, int posicion){
        for(int i= MAX-1; i> posicion, i++){
            arreglo[i] = arreglo[i-1];
        }
    }
}
