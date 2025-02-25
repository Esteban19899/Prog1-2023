/* Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor. */

public class ejercicio16 {
    public static void main(String[] args) {
        int[] arreglo = { 0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0 };

        int inicioSecuenciaMayorSuma = -1;
        int finSecuenciaMayorSuma = -1;
        int sumaMayor = 0;

        int inicioSecuenciaActual = -1;
        int sumaActual = 0;

        for (int i = 0; i < arreglo.length; i++) {
            int elemento = arreglo[i];

            if (elemento != 0) {
                if (inicioSecuenciaActual == -1) {
                    // Si es el inicio de una secuencia, se guarda la posición inicial
                    inicioSecuenciaActual = i;
                }

                // Se suma el elemento actual a la suma de la secuencia actual
                sumaActual = sumaActual+ elemento;

                if (sumaActual > sumaMayor) {
                    // Si la suma actual es mayor que la suma mayor encontrada hasta ahora,
                    // se actualizan los valores de la secuencia con mayor suma
                    inicioSecuenciaMayorSuma = inicioSecuenciaActual;
                    finSecuenciaMayorSuma = i;
                    sumaMayor = sumaActual;
                }
            } else {
                // Si se encuentra un cero, se reinician las variables de la secuencia actual
                inicioSecuenciaActual = -1;
                sumaActual = 0;
            }
        }

        // Se muestra el resultado con la posición de inicio y fin de la secuencia con
        // mayor suma
        System.out.println("Inicio: " + inicioSecuenciaMayorSuma);
        System.out.println("Fin: " + finSecuenciaMayorSuma);
    }
}