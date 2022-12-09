import java.util.Scanner;

public class PrincipalEstructuraVariables {

        public static int leerEntero(){
            int entero = 0;
            Scanner Console = new Scanner(System.in);
            try {
                entero = Console.nextInt();
            } catch (Exception e){
                System.out.println("Error: No me vengas con tonteras, ese no es un número ....");
            }
            return entero;
        }

        public static void main(String[] args) {
            int nota1; // Declaracion de variable
            nota1= 10; // Asignacion de valor

            int nota2 = 10;
            int nota3 = 10;
            final double pi = 3.1416; // Declaracion y Asignación de constante
            // pi = 4.387463297; // No se puede tener doble asignacion en las CONSTANTES
            System.out.println("EL promedio es: " + (nota1 + nota2 + nota3) / 3);

            System.out.println("Ingrese la primera nota");
            nota1 = leerEntero();
            System.out.println("Ingrese la segunda nota");
            nota2 = leerEntero();
            System.out.println("Ingrese la tercera nota");
            nota3 = leerEntero();

            System.out.println("El promedio es: " + (nota1 + nota2 + nota3) / 3);

        }
    }