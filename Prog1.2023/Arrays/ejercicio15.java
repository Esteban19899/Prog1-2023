/* Hacer un programa que devuelva la posición de inicio y fin de la
PRIMERA secuencia de números distinta de ceros.*/

public class ejercicio15 {

    public static void main (String[]args){
        int [] arreglo = {0, 2, 4, 5, 0, 8, 0, 17, 10, 20, 22, 0};

        int inicio = -1;
        int fin = -1;

        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] != 0){
                if(inicio == -1){
                inicio = i;}
            }
            else {
                if (inicio != -1){
                fin = i -1;
                break;
                }
            }
        }
    System.out.println("Inicio de secuencia posicion sub: "+inicio);
    System.out.println("Fin de secuencia poscicon sub: "+fin);
    }
}
