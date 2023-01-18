import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalClases {
    public static List<CFlor> Flores = new ArrayList<CFlor>();
    public static List<CCliente> Clientes = new ArrayList<CCliente>();
    public static List<CVendedor> Vendedores = new ArrayList<CVendedor>();
    public static List<CDocumentoVenta> DocumentoVenta = new ArrayList<CDocumentoVenta>();

    public static void menuPrincipal(){
        System.out.println("0- Salir.");
        System.out.println("1- Gestionar Flores.");
        System.out.println("2- Gestionar Vendedores.");
        System.out.println("3- Gestionar Clientes.");
        System.out.println("4- Gestionar Documento de venta.");
    }

    public static void menuCRUD(){
        System.out.println("0- Salir");
        System.out.println("1- (C) Crear");
        System.out.println("2- (R) Mostrar");
        System.out.println("3- (U) Actualizar");
        System.out.println("4- (D) Eliminar");
    }

    public static void mostrarFlores(){
        for (CFlor f: Flores) {
            f.mostrarEnLista();
        }
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
               case 1: // Gestinar Flores
                   System.out.println("Gestionaremos Flores");
                   menuCRUD();
                   int opcionFlor = new Scanner(System.in).nextInt();
                   switch (opcionFlor){
                       case 0: // Regresar al menu principal
                           System.out.println("\tRegresando al menu principal ... ");
                           break;
                       case 1: // Crear una Flor
                           CFlor flor = new CFlor();
                           Flores.add(flor);
                           break;
                       case 2:
                           System.out.println("  MOSTRAR FLOR ");
                           System.out.println("  0- Retornar al menu CRUD");
                           System.out.println("  1- Mostrar segun posicion");
                           System.out.println("  2- Mostrar todas");
                           System.out.print("   >> Opcion: ");
                           int opcionMostrar = new Scanner(System.in).nextInt();
                           switch (opcionMostrar){
                               case 0:
                                   System.out.println("\tRegresando al menu CRUD ... ");
                                   break;
                               case 1:
                                   System.out.print("   >> Posición: ");
                                   int posicion = new Scanner(System.in).nextInt();
                                   System.out.println("Nombre: "+Flores.get(posicion).getNombre());
                                   System.out.println("Aroma: "+Flores.get(posicion).getAroma());
                                   System.out.println("Color: "+Flores.get(posicion).getColor());
                                   System.out.println("Precio: "+Flores.get(posicion).getPrecio());
                                   break;
                               case 2:
                                   mostrarFlores();
                                   System.out.println();
                                   break;
                               default: break;
                           }
                       case 3: // Actualizar Flor
                           System.out.println("  ACTUALIZAR FLOR  ");
                           System.out.println("  0- Retornar al menu CRUD");
                           System.out.println("  1- Actualizar solo un campo");
                           System.out.println("  2- Actualizar todo");
                           break;
                       case 4:  // Eliminar FLOR
                           System.out.println("  ELIMINAR  FLOR  ");
                           System.out.println("  0- Retornar al menu CRUD");
                           System.out.println("  1- Eliminar Segun posicion");
                           System.out.println("  2- Eliminar Segun Nombre y color");
                           System.out.println("  3- Eliminar todas las flores del mundo");
                           break;
                       default:
//                           System.out.print("   >> Posición: ");
//                           int posicion = new Scanner(System.in).nextInt();
//                           Flores.remove(posicion);
//                           break;
                           break;
                   }
                   break;
               default:
                   break;
           }

        }while(flag);
    }
}
