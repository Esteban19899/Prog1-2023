public class ejercicio6 {
    public static void main (String []args){
    int [] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int numerosPares= 0;
    for (int i=0; i < arreglo.length; i++) {
        
        if(arreglo[i] % 2 == 0){
            numerosPares++;
        }
    }
    System.out.println("La cantidad de numero pares es "+numerosPares);
}
}