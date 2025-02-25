/* Hacer un programa que elimine de un arreglo todas las
ocurrencias de una secuencia patrón dada por otro arreglo.*/

public class ejercicio20 {

    public static final int MAX = 6;
    public static final int MAXPATRON = 2;
    
    public static void main(String[] args) {
        int[] arreglo = { 1, 0, 3, 4, 0, 7 };
        int[] patron = {3, 4};
        
        
        for(int i = 0; i < MAX; i++){ 
            if (arreglo[i] == patron[0]){
                for(int j = 1; j < MAXPATRON; j++){ 
                    if(patron[j] == arreglo [i+j]){
                        if(patron[j] == patron[MAXPATRON-1]){
                            for(int k = i; k < patron[MAXPATRON-1]; k++)
                            corrimientoIzquierda(arreglo, i);
                        }
                    }       
                }
            }   
        }
        mostrarArreglo(arreglo);
    }



    // funcion para eliminar copiando hacia la izquierda desde X posicion//
    public static void corrimientoIzquierda(int[] arreglo, int posicion) {
        // Validar que la posición esté dentro del rango del arreglo
        if (posicion >= 0 && posicion < arreglo.length) {
            // Realizar el corrimiento
            for (int i = posicion; i < arreglo.length - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
        }
    }

    // funcion para mostrar el contenido de un arreglo de tipo entero.
    public static void mostrarArreglo(int[] arreglo) {
        for (int pos = 0; pos < arreglo.length; pos++) {
            System.out.print(arreglo[pos] + " ");
        }
    }
}
