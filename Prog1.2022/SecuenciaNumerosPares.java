//Determinar el inicio y fin de la secuencia que más números pares tiene (si hay más de una, quedarse con la primera) //

public class SecuenciaNumerosPares {
    public static void main(String[] args) {
        int[] arreglo = {0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0};

        int inicioSecuencia = -1;
        int finSecuencia = -1;
        int contadorMaxPares = 0;

        int inicioActual = -1;
        int finActual = -1;
        int contadorTempPares = 0;

       
        for (int i = 0; i < arreglo.length; i++) { //Recorrer todo el arreglo con .length //
            if (arreglo[i] != 0) { // Verificar si el número es distinto de 0
                if (inicioActual == -1) {
                    inicioActual = i; // Si es el primer número distinto de 0, se actualiza el inicio actual
                }
                if (arreglo[i] % 2 == 0) { // Verificar si el número es par
                    contadorTempPares++; // Incrementar el contador temporal de números pares en la secuencia actual
                }
            } 
            else {
                if (inicioActual != -1) { // Verificar si se encontró un inicio de secuencia válido
                    finActual = i - 1; // Actualizar el fin de la secuencia actual
                    
                    if (contadorTempPares > contadorMaxPares) {
                        inicioSecuencia = inicioActual; // Actualizar el inicio de la secuencia con más números pares
                        finSecuencia = finActual; // Actualizar el fin de la secuencia con más números pares
                        contadorMaxPares = contadorTempPares; // Actualizar el contador máximo de números pares
                    }
                    
                    // Reiniciar las variables para la siguiente secuencia
                    inicioActual = -1;
                    finActual = -1;
                    contadorTempPares = 0;
                }
            }
        }

        System.out.println("Inicio: " + inicioSecuencia);
        System.out.println("Fin: " + finSecuencia);
    }
}