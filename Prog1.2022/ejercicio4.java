public class ejercicio4 {
//Buscar un elemento en un arreglo [10] de caracteres ya cargado y mostrar la o las posiciones del elemento.En caso de no estar indeicarlo tambien.//
    public static void main(String[] args) {
        char[] arreglo = {'a', 'b', 'c', 'd', 'e', 'f', 'd', 'h', 'i', 'd'};
        char elementoBuscado = 'd';
        
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elementoBuscado) {
                System.out.println("El elemento '" + elementoBuscado + "' se encuentra en la posición: "+i);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("El elemento '" + elementoBuscado + "' no se encuentra en el arreglo.");
        }
    }
}
