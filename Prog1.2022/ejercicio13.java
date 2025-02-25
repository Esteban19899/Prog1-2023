/* Hacer un programa que inserte un elemento (corrimientoDerecha) en un arreglo 
(ordenado decrecientemente) de tamaño MAX=10.
 */

public class ejercicio13 {
    public static void main (String[]args){
        int [] arreglo = {14,12,10,8,6,5,4,3,2,1};
        int elemento = 7;
        System.out.println("Arreglo Original:");
        imprimirArreglo(arreglo);  
        //recorrer el arreglo con la condicion de evaluar si "elemento" es < que lo que contiene la posicion//
        for(int i= 0; i < arreglo.length-1; i++){
            if (elemento > arreglo[i]){
                corrimientoDerecha(arreglo, i);
                arreglo[i] = elemento;
                break;
                }
            }
        System.out.println("\nArreglo modificado:");    
        imprimirArreglo(arreglo);
        
    }


    public static void corrimientoDerecha(int arreglo[], int pos) {
         if (pos >= 0 && pos <= arreglo.length - 1) { // validar//
             for (int i = arreglo.length - 1; i > pos; i--) {
                arreglo[i] = arreglo[i - 1]; // copiar//
             }
        }
     }
    //procedimiento para imprimir el contenido del arreglo por pantalla sin salto de linea//
    public static void imprimirArreglo(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
 }
    

