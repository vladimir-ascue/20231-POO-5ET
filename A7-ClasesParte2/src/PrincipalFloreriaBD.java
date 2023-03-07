import java.util.ArrayList;
import java.util.List;

public class PrincipalFloreriaBD {
    private static List<List<String>> data = new ArrayList<List<String>>();
    public static void main(String[] args) {
        conector c = new conector();
//        c.conectar();
        data = c.ejecutarProcedimientoConDatos("call listarFlores()");
        for (List<String> dato: data ) {
            System.out.print(dato.get(0)+" ");
            System.out.print(dato.get(1)+" ");
            System.out.print(dato.get(2)+" ");
            System.out.print(dato.get(3)+" ");
            System.out.print(dato.get(4)+" ");
            System.out.print(dato.get(5)+" ");
            System.out.print(dato.get(6)+" ");
            System.out.print(dato.get(7)+"\n");
        }

        c.ejecutarProcedimientoSinDatos("call eliminarFlor('6')");

        data = c.ejecutarProcedimientoConDatos("call listarFlores()");

        for (List<String> dato: data ) {
            System.out.print(dato.get(0)+" ");
            System.out.print(dato.get(1)+" ");
            System.out.print(dato.get(2)+" ");
            System.out.print(dato.get(3)+" ");
            System.out.print(dato.get(4)+" ");
            System.out.print(dato.get(5)+" ");
            System.out.print(dato.get(6)+" ");
            System.out.print(dato.get(7)+"\n");
        }
    }
}