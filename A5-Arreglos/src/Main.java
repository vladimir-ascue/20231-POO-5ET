import java.util.Scanner;

public class Main {
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
                break;
            case 2:
                escan.escribirLn("Vamos a INTERSECTAR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
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