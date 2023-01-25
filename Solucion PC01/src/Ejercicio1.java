import java.util.Scanner;
public class Ejercicio1 {
    public static void poblarArreglo(int[] arreglo, int multi){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i * multi;
        }
    }
    public static int buscarElemento(int elem, int[] arreglo){
        int cont = -1;
        do{
            cont++;
            if (elem == arreglo[cont])
                return cont;
        } while ( cont < arreglo.length );
        return -1;
    }

    public static int[] getPares(int[] arreglo){
        // tamaño = 5
        // multi = 4 => 0 4 8 12 16     => tam = arreglo.length
        // multi = 5 => 0 5 10 15 20    => tam = arreglo.length / 2 + 1

        // tamaño = 6
        // multi = 4 => 0 4 8 12 16 18  => tam = arreglo.length
        // multi = 5 => 0 5 10 15 20 25 => tam = arreglo.length / 2
        if (arreglo[1] % 2 == 0){
            return arreglo;
        }else {
            int tam;
            if(arreglo.length % 2 == 0)
                tam = arreglo.length / 2;
            else
                tam = arreglo.length/2 + 1;
            int[] pares = new int[tam];
            int cont2 = 0;  // Para el arreglo de pares
            for (int i = 0; i < arreglo.length; i++) {   // "i" es para el arreglo general
                if ( arreglo[i] % 2 == 0 ) {
                    pares[cont2] = arreglo[i];
                    cont2++;
                }
            }
            return pares;
        }
    }

    public static void main(String[] args) {
        // 1. crear
        System.out.print("Tamaño: ");
        int tam = new Scanner(System.in).nextInt();
        int[] arr = new int[tam];
        // 2. poblar
        System.out.print("multi: ");
        int multi = new Scanner(System.in).nextInt();
        poblarArreglo(arr, multi);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Elemento buscado: ");
        int buscado = new Scanner(System.in).nextInt();
        System.out.println(buscarElemento(buscado, arr));

        System.out.println("ARRAY PARES");
        for (int i = 0; i < getPares(arr).length; i++) {
            System.out.println(getPares(arr)[i]);
        }
    }
}