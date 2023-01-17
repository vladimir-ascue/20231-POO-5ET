class CFlor {
    // ATRIBUTOS - Caracteristicas - Propiedades del objeto de la realidad
    private String nombre;
    private String aroma;
    private String color;
    private double precio;
    // MÉTODOS
    // M. contructores
    public CFlor(){
        nombre = null;
        aroma = null;
        color = null;
        precio = 0;
    }

    public CFlor(String pNombre, String pAroma, String pColor, double pPrecio){
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

}
