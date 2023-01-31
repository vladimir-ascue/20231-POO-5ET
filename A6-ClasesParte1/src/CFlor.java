import java.util.Scanner;

public class CFlor {
    // ATRIBUTOS - Caracteristicas - Propiedades del objeto de la realidad
    private String nombre;
    private String aroma;
    private String color;
    private double precio;
    // MÉTODOS
    // M. contructores
    public CFlor(){
        nombre = new Scanner(System.in).nextLine();
        aroma = new Scanner(System.in).nextLine();
        color = new Scanner(System.in).nextLine();
        precio = new Scanner(System.in).nextDouble();
    }

    public CFlor(String pNombre, String pAroma, String pColor, double pPrecio){
        System.out.print("Nombre: ");
        nombre = pNombre;
        aroma = pAroma;
        color = pColor;
        precio = pPrecio;
    }

    // M. Getters

    public String getNombre() {
        return nombre;
    }

    public String getAroma() {
        return aroma;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    // M. Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // M. Generales - Comportamiento - Función

    public void mostrar(){
        System.out.println(" - Nombre: " + this.getNombre());
        System.out.println(" - Aroma: " + this.getAroma());
        System.out.println(" - Color: " + this.getColor());
        System.out.println(" - Precio: " +this.getPrecio());
    }
    public void mostrarEnLista(){
        // Ejerccio: Corregir el formato (substring) y crear un metodo formatear(String cadena)
        System.out.print(this.getNombre()+"\t");
        System.out.print(this.getAroma()+"\t");
        System.out.print(this.getColor()+"\t");
        System.out.println(this.getPrecio());
    }

    public String formatear(String cadena){
        cadena.substring(0,15); // Devuelve una subcadena que inicia en 0 y termina en 15
        cadena.length(); // Devuleve el tamaño de la cadena (Texto)
        return null;
    }

    public String formateartexto(String a){
        // Tareitas
        return "";
    }
}
