/* Suponer a partir de lo resuelto en el ejercicio anterior (11) que
el elemento a eliminar coincide con el último que hay en el arreglo.
¿Qué pasa en este caso? ¿Cómo daría una solución al problema?
NO RESUELTO! */ //Colocar como primer condicion que si el numero a ingresar es == MAX-1, arreglo[MAX-1] = 0/vacio?

public class ejercicio12 {
    public static void main(String[] args) {
        int[] arreglo = { 3, 2, 3, 4, 5, 3, 7, 8, 9, 10 };
        int numeroUsuario = 10; // este numero se debe obtener con una funcion que le pida al usuario un numero int //
                                

        // recorrer arreglo buscando coincidencias//
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == numeroUsuario) {
                corrimientoIzq(arreglo, i);
            }
        }
        imprimirArreglo(arreglo);

    }
    //Corrimiento hacia la Izq: generalmente se usa para eliminar un elemento, se duplica el ultimo elemento del arreglo// 
    public static void corrimientoIzq(int arreglo[], int posicion) {
       if(posicion >= 0 && posicion <= arreglo.length-1){ //verifica que la posicion este dentro del rango del arreglo//
        for (int i = posicion; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
            }
        }
        else{
            System.out.println("la posicion ingresada no se encuentra dentro del rango del arreglo.");
        }    
    }
    //procedimiento para imprimir el contenido de un arreglo por pantalla//
    public static void imprimirArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
