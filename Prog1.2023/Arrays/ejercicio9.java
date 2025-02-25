    /* Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, solicite al usuario un número entero y
lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada. */

public class ejercicio9 {
    final static int MAX = 10;
    public static void main (String []args) {
       /*  int [] arreglo = new int [MAX];
        arreglo = CargarArreglo(); 
        int nuevonumero = ObtenerNumero(); */

       int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
       int posicion = 0;
       int nuevonumero = 3;

       CorrimientoDerecha(arreglo, posicion);

       arreglo[0] = nuevonumero;

       for (int i=0; i< MAX; i++){
        System.out.print(arreglo[i]+" ");
       }
    
   }
   //metodo o procedimiento generalmente asociado al hecho de insertar un elemento en un arreglo (ordenado o no), se pierde el ultimo valor del arreglo//
    public static void CorrimientoDerecha(int arreglo[], int posicion) {
        if (posicion >= 0 && posicion <= MAX) {
            for (int i = (MAX - 1); i > posicion; i--) {
                arreglo[i] = arreglo[i - 1];
            }
        }
    }


}
