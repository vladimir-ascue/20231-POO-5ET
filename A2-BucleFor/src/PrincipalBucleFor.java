public class PrincipalBucleFor {
    public static void escribir(String texto){ System.out.print(texto); }
    public static void escribirLinea(String texto){ System.out.println(texto); }
    static int limite = 12;
    // Si la variable de iteracion se declara dentro del for
    //  => la variable de iteracion existe solo dentro del for

    public static void main(String[] args) {
        int i;
        for (i = 0; i < limite; i++) {

            escribirLinea("Valor de i = " + i);

        }
       escribirLinea("Valor de i = " + i);
    }


}
