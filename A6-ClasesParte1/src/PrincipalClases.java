public class PrincipalClases {
    public static void main(String[] args) {
        CFlor flor1;  // Instanciando , Existe una variable de tipo CFlor
        flor1 = new CFlor(); // Creando , recien en este punto existe

        flor1.setNombre("Orquidea");
 /*       flor1.color = "Violeta";
        flor1.aroma = "Dulce ligero";
        flor1.precio = 14.7;*/

        System.out.println("Nombre = " + flor1.getNombre());
/*        System.out.println("Aroma = " + flor1.aroma);
        System.out.println("Color = " + flor1.color);
        System.out.println("Precio = " + flor1.precio);*/
        System.out.println();
        if (flor1.getNombre().compareTo("") == 0)
            System.out.println("Es cadena vacia");
        else
            System.out.println("No es cadena vacia");
    }
}
