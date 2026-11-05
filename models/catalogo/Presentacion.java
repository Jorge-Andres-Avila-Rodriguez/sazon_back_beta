package models.catalogo;

public class Presentacion {

  private Long id; 
    private String decripcion;
    private double contenidoNeto;
    private String unidadMedida;
    private double precio;
    private String LongIdProducto;
    public Presentacion() {
    }
    public Presentacion(Long id, String decripcion, double contenidoNeto, String unidadMedida, double precio) {
        this.id = id;
        this.decripcion = decripcion;
        this.contenidoNeto = contenidoNeto;
        this.unidadMedida = unidadMedida;
        this.precio = precio;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDecripcion() {
        return decripcion;
    }
    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
    public double getContenidoNeto() {
        return contenidoNeto;
    }
    public void setContenidoNeto(double contenidoNeto) {
        this.contenidoNeto = contenidoNeto;
    }
    public String getUnidadMedida() {
        return unidadMedida;
    }
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getLongIdProducto() {
        return LongIdProducto;
    }
    public void setLongIdProducto(String longIdProducto) {
        LongIdProducto = longIdProducto;
    }

     
    

}


}

