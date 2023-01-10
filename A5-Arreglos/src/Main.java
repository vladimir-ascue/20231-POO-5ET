import java.util.Scanner;

public class Main {

    // A = {2,3,4,5}    lenght = 4
    // B = {4,5,6}      lenght = 3
    // A U B = { 2, 3, 4, 5, 6 } lenght A U B = 5
    // tamUnion = tamA + tamB - dup (elemInter)
    public static int[] unir(int[] a, int[] b){
        int dup = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if ( a[i] == b[j]){
                    dup++;
                }
            }
        }
        int tamUnion = a.length + b.length - dup;
        int[] union = new int[tamUnion];

        for (int i = 0; i < b.length; i++) {
            union[i] = b[i];
        }
        // A = {2,3,4,5}    lenght = 4
        // B = {4,5,6,7}      lenght = 4
        // A U B = { 2, 3, 4, 5, 6, 7 } lenght A U B = 6
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            if( !existe(a[i], union ) ) {
                union[b.length + cont] = a[i];
            }
         }
        return union;
    }
    // A = {2,3,4,5}    lenght = 4
    // B = {4,5,6}      lenght = 3
    // A  B = { 4, 5 }  lenght = 2 -> tamInter = 2 >>> tamInter = dup
    public static int[] intersectar(int[] a, int[] b){
        int tamInter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    tamInter++;
            }
        }

        int[] interseccion = new int[tamInter];

        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    interseccion[cont] = a[i]; // b[j]
                    cont++;
                }
            }
        }
        return interseccion;
    }

    public static Boolean existe(int elem, int[] conj){
        Boolean flag = false;
        for (int i = 0; i < conj.length; i++) {
            if( conj[i] == elem )
                flag = true;
        }
        return flag;
    }

    public static int menu(){
        escan.escribirLn("#########       MENU PRINCIPAL      #########");
        escan.escribirLn("######### OPERACIONES CON CONJUNTOS #########");
        escan.escribirLn("0- Salir");
        escan.escribirLn("1- Union");
        escan.escribirLn("2- Interseccion");
        escan.escribirLn("3- Diferencia");
        escan.escribirLn("4- Diferencia Simétrica");
        escan.escribirLn("5- Cambiar conjuntos");
        return escan.leerEntero(">> Ingrese una opcion (0 - 5)");
    }
    public static int[] leerConjunto(String nombre, int tam){
        int[] a = new int[tam];
        for (int i = 0; i < a.length; i++) {
            a[i] = escan.leerEntero(nombre+"["+i+"]");
        }
        return a;
    }

    public static void mostrarConjunto(String nombre, int[] conj){
        escan.escribir(nombre+" = { ");
        for (int i = 0; i < conj.length; i++) {
            if ( i == conj.length-1 )
                escan.escribir(conj[i]+"");
            else
                escan.escribir(conj[i] + ", ");
        }
        escan.escribirLn(" }");
    }
    public static void main(String[] args) {
        escan.escribirLn("######### OPERACIONES CON CONJUNTOS #########");
        String nombre1 = escan.leertexto("Nombre de primer Conjunto");
        int tam1 = escan.leerEntero("Tamaño de "+nombre1);
        int[] A = leerConjunto(nombre1,tam1);
        mostrarConjunto(nombre1,A);

        String nombre2 = escan.leertexto("Nombre de segundo Conjunto");
        int tam2 = escan.leerEntero("Tamaño de "+nombre2);
        int[] B = leerConjunto(nombre2,tam2);
        int opcion = menu();
        switch ( opcion ){
            case 0:
                escan.escribirLn("Adios ...");
                break;
            case 1:
                escan.escribirLn("Vamos a UNIR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                int [] union = unir(A,B);
                mostrarConjunto("Union",union);
                break;
            case 2:
                escan.escribirLn("Vamos a INTERSECTAR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                int [] interseccion = intersectar(A, B);
                mostrarConjunto("INterseccion", interseccion);
                break;
            case 3:
                escan.escribirLn("Vamos a hallar la DIFERENCIA de los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            case 4:
                escan.escribirLn("Vamos a hallar la DIFERENCIA SIMÉTRICA de los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            case 5:
                escan.escribirLn("Vamos a CAMBIAR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            default:
                escan.escribirLn("Opcion fuera de rango (0 - 5)");
                break;
        }
    }
}