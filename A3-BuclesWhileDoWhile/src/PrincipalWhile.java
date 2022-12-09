import java.util.Scanner;

public class PrincipalWhile {
    public static void escribir(String texto){
        System.out.print(texto);
    }
    public static void escribirLinea(String texto){
        System.out.println(texto);
    }

    public static int leerEntero(String mensaje){
        int entero = 0;
        Boolean flag = true;
        Scanner teclado;
        do {
            escribir("\t"+mensaje+": ");
            teclado = new Scanner(System.in);
            try{
                entero = teclado.nextInt();
                flag = false;
            }catch(Exception e){
                escribirLinea("Error: Ese no es un entero válido.");
                escribirLinea("Intentalo nuevamente el proximo año.");
            }
        }while (flag);


        return entero;
    }

    public static void main(String[] args) {
//        System.out.println("\tBucle WHILE");
//        int iterador = 0;
//        int limite = 0;
//        Boolean flag = iterador < limite;
//        while( flag ){
//            System.out.println(" iterador = " + (iterador));
//            iterador++;
//            if ( iterador == limite)
//                flag = false;
//        }
//        System.out.print("################################\n");
//        System.out.println("\tBucle DO-WHILE");
//        int iterador2 = 0;
//        int limite2 = 0;
//        do {
//            System.out.println(" iterador2 = " + (iterador2));
//            iterador2++;
//        } while( iterador2 < limite2 );
        int edad = leerEntero("Ingrese su edad");
        escribirLinea("Su edad es: " + edad);
    }
}
