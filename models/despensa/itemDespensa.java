public class ItemDespensa {

    private long id;
    private String nombre;
    private double cantidad;
    private String unidadMedida;
    private LocalDate fechaCaducidad;
    private long idProducto;
    private long idDespensa;
    
    public ItemDespensa() {
    }

    public ItemDespensa(long id, String nombre, double cantidad, String unidadMedida, LocalDate fechaCaducidad,
            long idProducto, long idDespensa) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.fechaCaducidad = fechaCaducidad;
        this.idProducto = idProducto;
        this.idDespensa = idDespensa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public long getIdDespensa() {
        return idDespensa;
    }

    public void setIdDespensa(long idDespensa) {
        this.idDespensa = idDespensa;
    }

    

}
