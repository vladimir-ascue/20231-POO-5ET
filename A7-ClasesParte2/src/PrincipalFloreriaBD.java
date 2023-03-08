import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrincipalFloreriaBD {
    private static List<List<String>> data = new ArrayList<List<String>>();
    public static void main(String[] args) {
//        c.conectar();
        CFlor f = new CFlor("Clavel", "Dulce", "Verde", 32, 150,new Date(),"Activo");
        f.save(); //
    }
}