/* Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
 */

public class ejercicio11 {
    public static void main(String[] args) {
        int[] arreglo = { 3, 2, 3, 4, 5, 3, 7, 8, 9, 10 };
        int numeroUsuario = 10; // este numero se debe obtener con una funcion que le pida al usuario un numero int//
                               

        // recorrer arreglo buscando coincidencias//
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == numeroUsuario) {
                corrimientoIzq(arreglo, i);
            }
        }
        imprimirArreglo(arreglo);

    }
    //metodo o procedimiento generalmente asociado al hecho de eliminar un elemento en un arreglo (ordenado o no), se duplica el ultimo elemento del arreglo//
    public static void corrimientoIzq(int arreglo[], int posicion) {
        for (int i = posicion; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
    }

    public static void imprimirArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}