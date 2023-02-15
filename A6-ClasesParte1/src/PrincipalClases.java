import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalClases {
    // Corregir el error del profe Despues demostrar todas las flores no debe mostrarse el menu Actualizar Flores
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
        System.out.print("   >> ingrese una opción:");
    }
// Este codigo se actualizara en tu Equipo
    public static void menuCRUD(){
        System.out.println("0- Salir");
        System.out.println("1- (C) Crear");
        System.out.println("2- (R) Mostrar");
        System.out.println("3- (U) Actualizar");
        System.out.println("4- (D) Eliminar");
        System.out.print("   >> ingrese una opción:");
    }

    public static void mostrarFlores(){
        System.out.println("IDX\tNPMBRE\tAROMA\tCOLOR\tPRECIO");
        int cont = 0;
        for (CFlor f: Flores) {
            System.out.print(cont+"\t");
            f.mostrarEnLista();
            cont++;
        }
    }

    public static int menuVentas(){
        System.out.println("0- Regresar al menu anterior.");
        System.out.println("1- Registrar nueva venta.");
        System.out.println("2- Anular venta.");
        System.out.println("3- Reporte de ventas.");
        System.out.print("   >> Ingrese una opción: ");
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {
        Boolean flag;
        Flores.add(new CFlor("Rosa","Ducle","Rojo",10));
        Flores.add(new CFlor("Clavel","Dulce Suave","Blanco",15));
        Flores.add(new CFlor("Orquidea ","Dulce fuerte","Rosadita",30));
        Flores.add(new CFlor("Orquidea silvestre","Dulce fuerte","Purpura",50));
        Flores.add(new CFlor("geraneo","Dulce super suave","Purpura",20));
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
                           break;
                       case 3: // Actualizar Flor
                           System.out.println("  Menu Mostrar Flor ");
                           System.out.println(" 0- Regresar al menu Flores");
                           System.out.println(" 1- Actualizar un campo");
                           System.out.println(" 2- Actualizar todo");
                           System.out.println("   Ingrese una opcion>>  ");
                           int opcionActualizarFlor = new Scanner(System.in).nextInt();
                           switch (opcionActualizarFlor) {
                               case 0:
                                   System.out.println(" ... Regresando al menu Flores");
                                   break;
                               case 1:
                                   System.out.println("Ingrese la posicion a actualizar: ");
                                   int pos = new Scanner(System.in).nextInt();
                                   System.out.println("Ingrese campo que desea actualizar: ");
                                   String campo = new Scanner(System.in).nextLine();
                                   flor = (CFlor) Flores.get(pos);
                                   switch (campo){
                                       case "nombre":
                                           System.out.println("Nuevo nombre: ");
                                           flor.setNombre(new Scanner(System.in).nextLine());
                                           break;
                                       case "aroma":
                                           System.out.println("Nuevo aroma: ");
                                           flor.setAroma(new Scanner(System.in).nextLine());
                                           break;
                                       case "color":
                                           System.out.println("Nuevo color: ");
                                           flor.setColor(new Scanner(System.in).nextLine());
                                           break;
                                       case "precio":
                                           System.out.println("Nuevo precio: ");
                                           flor.setPrecio(new Scanner(System.in).nextDouble());
                                           break;
                                   }
                                   break;
                               case 2:

                                   break;
                           }
                           break;
                       case 4:  // Eliminar FLOR
                           System.out.println("  Menu Mostrar Flor ");
                           System.out.println(" 0- Regresar al menu Flores");
                           System.out.println(" 1- Eliminar por posicion");
                           System.out.println(" 2- Eliminar por nombre y color");
                           System.out.println(" 3- Eliminar todas las flores");
                           System.out.println("   Ingrese una opcion>>  ");
                           break;
                       default:
//                           System.out.print("   >> Posición: ");
//                           int posicion = new Scanner(System.in).nextInt();
//                           Flores.remove(posicion);
//                           break;
                           break;
                   }
                   break;
               case 2: // Gestinar Vendedores
                   break;
               case 3: // Gestinar Clientes
                   break;
               case 4: // Gestinar Documentos de Venta
                   
                   break;
               default:
                   break;
           }

        }while(flag);
    }
}
