//hacer un programa que elimine de un arreglo todas las ocurrencias
// de una secuencia patron dada por otro arreglo
//---------------------------------------------
// de un arreglo A (chequear inicio y fin de secuencia/ chequear contenido)
// comparalo con arreglo B, si tienen el mismo tamaño y los mismos valores
// eliminar secuencia arreglo B 



public class secuencias_20 {
    public static final int MAXVALOR=10;
    public static final int MAX=10;
    public static void main (String[] args){
        int inicio=0, fin=-1,inicioB=0, finB=0;
        int [] arregloA = {0,3,0,5,6,9,0,5,1,0};
        int [] arregloB = {0,0,0,5,1,0,0,0,0,0};
        imprimir_Arreglo(arregloA);
        inicioB = obtenerInicioSecuencia(arregloB, finB+1);//buscar inicio secuencia
        finB=obtenerFinSecuencia(arregloB, inicioB);
        while(inicio<MAX){
            inicio = obtenerInicioSecuencia(arregloA, fin+1);//buscar inicio secuencia
                if(inicio<MAX){
                    fin=obtenerFinSecuencia(arregloA, inicio);//buscar fin secuencia
                    if(esIgualPatron(arregloA, inicio, fin, arregloB, inicioB, finB)){//si esigualPatron
                        eliminarSecuencia(arregloA, inicio, fin);
                        fin=inicio;//eliminarSecuencia(arregloA);
                    }
                }
        }
        imprimir_Arreglo(arregloA);

    }
    public static void imprimir_Arreglo(int[] arreglo){
        for(int pos=0;pos<MAX;pos++){
            System.out.print(arreglo[pos] +" | ");
        }
        System.out.println();
    }
    
    public static void eliminarSecuencia (int []arreglo, int inicio, int fin){
        int aux= inicio;
        while(aux<=fin){
            corrimiento_Izquierda(arreglo, inicio);
            aux++;
        }
    }
    public static void corrimiento_Izquierda(int[]arreglo, int posicion){
        for(int i=posicion;i<MAX-1;i++){
            arreglo[i]=arreglo[i+1];                
        }
    }    
    public static int obtenerInicioSecuencia(int[]arreglo, int pos){
        while(pos<MAX&&arreglo[pos]==0){
            pos++;
        }
    return pos;
    }
    public static int obtenerFinSecuencia(int[]arreglo, int pos){
        while(pos<MAX && arreglo[pos]!=0){
            pos++;
        }
    return pos-1;
    }
    public static boolean esIgualPatron (int [] arreglo, int inicio, int fin,int [] arregloPatron, int iniP, int finP){
        int tam=fin-inicio+1;//arregloA
        int tamP=finP-iniP+1;
        if(tam==tamP){
            while(inicio<=fin&&arreglo[inicio]==arregloPatron[iniP]){
                inicio++;
                iniP++;
            }
        return (inicio>fin);
        }
        else{
        return false;    
        }
        
    }
    
}