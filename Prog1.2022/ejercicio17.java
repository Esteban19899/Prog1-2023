/* Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros.*/

public class ejercicio17 {
    public static void main(String[] args) {
        int[] arreglo = {0, 2, 4, 0, 8, 0, 17, 20, 22, 0, 10, 15, 0};
        
        int inicioAnteultimaSecuencia = -1;
        int finAnteultimaSecuencia = -1;
        
        int contadorSecuencias = 0;
        
        int inicioSecuenciaActual = -1;
        
        for (int i = 0; i < arreglo.length; i++) {
            int elemento = arreglo[i];
            
            if (elemento != 0) {
                if (inicioSecuenciaActual == -1) {
                    // Si es el inicio de una secuencia, se guarda la posición inicial
                    inicioSecuenciaActual = i;
                }
            } else {
                if (inicioSecuenciaActual != -1) {
                    // Si se encontró el fin de una secuencia, se actualiza la posición de la antepenúltima secuencia
                    contadorSecuencias++;
                    
                    if (contadorSecuencias == 3) {
                        inicioAnteultimaSecuencia = inicioSecuenciaActual;
                        finAnteultimaSecuencia = i - 1;
                        break;
                    }
                    
                    inicioSecuenciaActual = -1;
                }
            }
        }
        
        // Se muestra el resultado con la posición de inicio y fin de la antepenúltima secuencia
        System.out.println("Inicio: " + inicioAnteultimaSecuencia);
        System.out.println("Fin: " + finAnteultimaSecuencia);
    }
}
