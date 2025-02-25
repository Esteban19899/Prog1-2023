//Implementar un metodo que realice un corrimiento a izquierda en un arreglo ordenado de tamaño MAX = 10 a partir de una posicion//

public class ejercicio8 {
    public static int MAX = 10;

    public static void main(String[] args) {
        int[] arreglo = {3, 5, 7, 1, 9, 8, 4, 6, 2, 10}; // Arreglo de tamaño MAX=10
                     //  0  1  2  3  4  5  6  7  8  9  (POSICIONES DEL ARREGLO)  //
        int posicion = 3; // Posición a partir de la cual realizar el corrimiento

        corrimientoIzquierda(arreglo, posicion);

        // Imprimir el arreglo después del corrimiento
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

    public static void corrimientoIzquierda(int[] arreglo, int posicion) {
        // Validar que la posición esté dentro del rango del arreglo
        if (posicion >= 0 && posicion < MAX) {
            // Realizar el corrimiento
            for (int i = posicion ; i < MAX-1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
        }
    }
}