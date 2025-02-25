public class ejercicio5 {
    //dado de un arreglo char [10] ya cargado. Invertir el orden del contenido con un metodo//

    public static void main(String[] args) {
        char[] arreglo = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        invertirArreglo(arreglo); //el metodo declarado mas abajo para invertir aplciado al arreglo declarado al principio como parametro. //

        System.out.println("Arreglo invertido:");
        imprimirArreglo(arreglo);
    }

    public static void invertirArreglo(char[] arreglo) { //metodo  para invertir arreglos//
        int inicio = 0; //es la posicion 0 del arreglo.
        int fin = arreglo.length - 1; //ultima pos, se le resta 1 porque si el arreglo es de [10] la ultima pos es 9, va de 0 a 9. //

        while (inicio < fin) {
            // Intercambio de elementos //
            char temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;

            inicio++;
            fin--;
        }
    }

    public static void imprimirArreglo(char[] arreglo) {
        for (char c : arreglo) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
