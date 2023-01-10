public class PrincipalCalculadora {

    public static void menu(){
        escan.escribirLn("######### MENU PRINCIPAL #########");
        escan.escribirLn("0- Salir");
        escan.escribirLn("1- Sumar");
        escan.escribirLn("2- Restar");
        escan.escribirLn("3- Multiplicar");
        escan.escribirLn("4- Dividir");
    }

    public static int suma(int num1, int num2){
        int suma=0;
        suma = num1 + num2;
        return suma;
    }

    public static int resta(int num1, int num2){
        int resta=0;
        resta = num1 - num2;
        return resta;
    }

    public static double dividir(int num1, int num2){
        double cosiente=0;
        cosiente = num1 / num2;
        return cosiente;
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        // Tiene que escribirse siempre
        menu();
        int opcion = 0;
        opcion = escan.leerEntero(">> Ingrese una opción");
        switch ( opcion ){
            case 0:
                escan.escribirLn("Adios, vuelva pronto.");
                break;
            case 1:
                escan.escribirLn("##### Vamos a sumar ####");
                num1 = escan.leerEntero("\tIngrese el primer sumando");
                num2 = escan.leerEntero("\tIngrese el segundo sumando");
                escan.escribirLn("La suma de "+ num1 + " + " + num2 + "es: " + suma(num1, num2));
                break;
            case 2:
                escan.escribirLn("##### Vamos a restar ####");
                num1 = escan.leerEntero("\tIngrese el minuendo");
                num2 = escan.leerEntero("\tIngrese el sustraendo");
                escan.escribirLn("La diferencia de "+ num1 + " - " + num2 + "es: " + resta(num1, num2));
                break;
            case 3:
                break;
            case 4:
                escan.escribirLn("##### Vamos a dividir ####");
                num1 = escan.leerEntero("\tIngrese el dividendo");
                num2 = escan.leerEntero("\tIngrese el divisor");

                if (num2 == 0){
                    // Mostrar menu
                    //    0- Regresar al menu principal. >>>> Regresa al menu principal
                    //    1- Ingresar nuevo dividor.  >>>> Se lee un nuevo valor para el divisor y se opera
                    //           Si se vueleve a inbresar cero ... le escupes en la cara ...
                }else{

                }

                escan.escribirLn("La diferencia de "+ num1 + " - " + num2 + "es: " + dividir(num1, num2));
                break;
            default:
                break;
        }
        // Haste este punto deberá repetirse
    }
}