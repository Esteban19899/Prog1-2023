/* Hacer un programa que elimine (corrimientoIzq) los valores pares en un arreglo
de tamaño MAX=10. */

public class ejercicio14 {
    public static final int MAX = 10;
    public static void main (String []args) {
        int [] arreglo = {1,2,3,4,5,6,7,8,9,10};
        
        //en caso que el ultimo valor del arreglo sea par volverlo 0//
        if(arreglo[arreglo.length-1] % 2 == 0){
            arreglo[arreglo.length-1] = 0;
        //recorrer el arreglo con la condicion del ej.//    
        }
        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] % 2 == 0) {
                corrimientoIzq(arreglo, i);
                }
            }   
        imprimirArreglo(arreglo);
        
    }
    

    public static void corrimientoIzq(int arreglo[],int posicion){
        if (posicion >= 0 && posicion <= arreglo.length-1){ //validar rango de pos//
            for(int i = posicion; i < arreglo.length-1; i++){ //recorro desde pos hasta el final del arreglo//
                arreglo[i] = arreglo[i+1]; //copiar//
            }
        }
    }
    public static void imprimirArreglo(int arreglo[]){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }
    }
}

