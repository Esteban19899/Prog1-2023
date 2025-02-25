/* Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición).
 */

public class ejercicio10 {
    public static void main (String []args){
        int [] arreglo = {1,2,3,4,5,6,7,8,9,10};
        int numeroUsuario= 3; //este numero se debe obtener con una funcion que le pida al usuario un numero entero//

        //recorrer arreglo buscando coincidencias//
        for(int i=0; i<arreglo.length;i++){

            if(arreglo[i] == numeroUsuario){
                corrimientoIzq(arreglo, i);
                break;
            }
        }
        imprimirArreglo(arreglo);
        


    }
    //metodo o procedimiento generalmente asociado al hecho de eliminar un elemento en un arreglo (ordenado o no), se duplica el ultimo elemento del arreglo//
    public static void corrimientoIzq(int arreglo[],int posicion){
        for(int i = posicion; i < arreglo.length-1; i++ ) {
            arreglo[i] = arreglo[i+1];
        }
    }
    //procedimiento para imprimir el contenido del arreglo por pantalla sin salto de linea//
    public static void imprimirArreglo(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
