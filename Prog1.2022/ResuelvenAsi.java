public class ResuelvenAsi {
	/*
	 * Hacer un programa que elimine de un arreglo todas las
	 * ocurrencias de una secuencia patrón dada por otro arreglo.
	 * */
    
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static void main(String[] args) {
		int [] arrA = {0,7,8,3,0,4,4,0,8,0};
		int [] arrB = {0,2,5,6,0,0,4,4,0,0};
		//cargar_arreglo_aleatorio_secuencias_int(arrA);
		//cargar_arreglo_aleatorio_secuencias_int(arrB);
		mostrarSec(arrA);
		mostrarSec2(arrB);
		buscarOcurrencias(arrA,arrB);
		System.out.println("-------------");
		mostrarSec(arrA);
		mostrarSec2(arrB);
	}

	public static void buscarOcurrencias(int[] A, int[] B) {
		int iniA = 0, finA = -1, iniB = 0, finB = -1;

		while (iniA < MAX - 1) {
			iniB = obtenerIni(B, finB + 1);
			finB = obtenerFin(B, iniB);
			iniA = obtenerIni(A, finA + 1);
			if (iniA < MAX - 1) {
				finA = obtenerFin(A, iniA);
				comparar(A, B, iniA, finA, iniB);
			}
		}

	}

	public static void comparar(int[] a, int[] b, int iniA, int finA, int iniB) {
		int A = iniA;
		int B = iniB;
		if (a[A] == b[B]) {
			while (A <= finA) {
				if (A != 0) {
					corrIzq(a, iniA);
					A++;
					;
					B++;
				}
			}
		}
	}
	
	
	public static void corrIzq(int[] arr, int i) {
		for(; i < MAX-1; i++){
				arr[i]=arr[i+1];
			}
			arr[MAX-1] = -1;
	}
	
	public static int obtenerFin(int[] arr, int pos) {
		while (pos < MAX - 1 && arr[pos] != 0) {
			pos++;
		}
		return pos - 1;
	}

	public static int obtenerIni(int[] arr, int pos) {
		while (pos < MAX - 1 && arr[pos] == 0) {
			pos++;
		}
		return pos;
	}
	
	public static void mostrarSec(int[] A) {
		System.out.print("Arreglo de secuencias int:\n|");
		for (int pos = 0; pos < MAX; pos++) {
			System.out.print(A[pos] + "|");
		}
		System.out.print("\n");
	}
	public static void mostrarSec2(int[] b) {
		System.out.print("Arreglo de secuencias int:\n|");
		for (int pos = 0; pos < MAX; pos++) {
			System.out.print(b[pos] + "|");
		}
		System.out.print("\n");
	}
}
