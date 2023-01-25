import java.util.Scanner;

public class Ejerccio2 {

    public static void poblarPares(int[] pares){
        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2;
        }
    }

    public static int[] poblarImpares(int[] impares){
        for (int i = 0; i < impares.length; i++) {
            impares[i] = (i * 2) + 1;
        }
        return impares;
    }

    public static void mostrar(String nombre, int[] arreglo){
        System.out.print(nombre + ":\n( ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println(" )");
    }

    public static void juntar(int[] pares, int[] impares){
        // pares
        //      0 2 4 6 8 10        tam = 6
        // impares
        //      1 3 5 7 9 11 13 15  tam = 8
        //
        // Juntos
        //      0 1 2 3 4 5 6 7 8 9 10 11 13 15    tam = 14
        // pos  I P I P I P I P I P I  P  I  P
        // Arr  p i p i p i p i p i p  i  i  i

        int tam = pares.length + impares.length;

        int[] unidos = new int[tam];  // unidos tiene 9 elementos

        System.out.println("Recorremos posicines pares");
        for (int i = 0; i < pares.length; i+=2) {
            unidos[i] = pares[ i/2 ];
            //System.out.println("i: " + i ) ;
            System.out.println("Unidos["+i+"]="+unidos[i]);
        }
        System.out.println("Recorremos posicines impares");
        for (int i = 1; i < unidos.length; i+=2) {
            System.out.println("i: " + i);
        }

        // i = 0
        // i+=2  === i = i + 2


    }

    public static void main(String[] args) {
        System.out.println("Tam1: ");
        int tam1 = new Scanner(System.in).nextInt();
        System.out.println("Tam2: ");
        int tam2 = new Scanner(System.in).nextInt();

        int[] pares = new int[tam1];
        int[] impares = new int[tam2];

        poblarPares(pares);
        mostrar("pares",pares);
        mostrar("Impares",poblarImpares(impares));

        juntar(pares,impares);

    }
}
