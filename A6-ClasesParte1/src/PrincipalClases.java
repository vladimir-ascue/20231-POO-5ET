import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalClases {

    public static List<CFlor> floresA = new ArrayList<CFlor>();
    public static CFlor[] floresB = new CFlor[25];

    public static void menuPrincipal(){
        System.out.println("0- Salir.");
        System.out.println("1- Gestionar Flores.");
        System.out.println("2- Gestionar Vendedores.");
        System.out.println("3- Gestionar Clientes.");
        System.out.println("4- Gestionar Documens de venta.");
    }

    public static void menuFlores(){
        System.out.println("0- Salir");
        System.out.println("1- (C) Crear");
        System.out.println("2- (R) Mostrar");
        System.out.println("3- (U) Actualizar");
        System.out.println("4- (D) Eliminar");
    }

    public static void main(String[] args) {
        Boolean flag;
        do{
           menuPrincipal();
           flag = true;
           int opcion = new Scanner(System.in).nextInt();
           switch (opcion){
               case 0:
                   flag = false;
                   break;
               case 1:
                   System.out.println("Gestionaremos Flores");
                   menuFlores();
                   int opcionFlor = new Scanner(System.in).nextInt();
                   switch (opcionFlor){
                       case 0: break;
                       case 1:
                           CFlor flor = new CFlor();
                           flor.setNombre(new Scanner(System.in).nextLine());
                           flor.setAroma(new Scanner(System.in).nextLine());
                           flor.setColor(new Scanner(System.in).nextLine());
                           flor.setPrecio(new Scanner(System.in).nextDouble());
                           floresA.add(flor);
                           flores.
                           break;
                       default:
                           break;
                   }
                   break;
               default:
                   break;
           }

        }while(flag);
    }
}
